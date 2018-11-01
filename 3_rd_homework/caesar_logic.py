# ord('A') = 65
# ord('Z') = 90
# ord('a') = 97
# ord('z') = 122


def encrypt(offset, text):
    encrypted_text = ''
    new_text = list(text)  # разбиваем строку на отдельные элементы
    for i in range(0, len(text)):
        number = ord(new_text[i])
        if (number < 65) or (number > 122):
            new_text[i] = new_text[i]
        if (number > 90) and (number < 97):
            new_text[i] = new_text[i]
        if (number > 64) and (number < 91):
            if (number + offset > 64) and (number + offset < 91):
                new_text[i] = chr(number + offset)
            elif number + offset > 90:
                new_text[i] = chr(96 + number + offset - 90)
            elif number + offset < 65:
                new_text[i] = chr(123 - (65 - number - offset))
        if (number > 96) and (number < 123):
            if (number + offset > 96) and (number + offset < 123):
                new_text[i] = chr(number + offset)
            elif number + offset > 122:
                new_text[i] = chr(64 + number + offset - 122)
            elif (number + offset < 97) and (number + offset > 90):
                new_text[i] = chr(91 - (97 - number - offset))
            elif (number + offset < 91) and (number + offset > 64):
                new_text[i] = chr(number + offset - 6)
    for i in range(0, len(text)):
        encrypted_text = encrypted_text + str(new_text[i])
    return encrypted_text


def decrypt(offset, text):
    offset = -1 * offset
    return encrypt(offset, text)
