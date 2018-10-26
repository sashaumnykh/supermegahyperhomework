from caesar_logic import encrypt
from caesar_logic import decrypt


print("Выберите действие:")
print("1) Введите 'e', если хотите зашифровать строку.")
print("2) Введите 'd', если хотите расшифровать строку.")
action = input()
if (action != 'e') and (action != 'd'):
    raise ValueError("Введена неизвестная операция, попробуйте еще раз :)")
print("Введите текст:")
text = input()
print("Укажите смещение:")
offset = input()
if (offset[1:].isdigit()) and (offset[0] == '-'):
    offset = int(offset[1:])*(-1)
    if offset < 26:
        if action == 'e':
            print(encrypt(offset, text))
        if action == 'd':
            print(decrypt(offset, text))
    else:
        raise ValueError("Значение смещения не должно превосходить 25!")
elif offset[:].isdigit():
    offset = int(offset)
    if offset < 26:
        if action == 'e':
            print(encrypt(offset, text))
        if action == 'd':
            print(decrypt(offset, text))
    else:
        raise ValueError("Значение смещения не должно превосходить 25!")
else:  # Слава Наташе Сенаторовой!!!!!!!!!!!!!!!!!
        raise ValueError('Введите целочисленное значение смещения!')
