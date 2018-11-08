def smile(sentence):
    if sentence == '':
        return True
    elif sentence.count('[') != sentence.count(']'):
        return False
    elif sentence.count('{') != sentence.count('}'):
        return False
    elif sentence.count('(') != sentence.count(')'):
        return False
    else:
        new_text = list(sentence)
        new_sentence = []
        if sentence.count('[') != sentence.count(']'):
            return False
        elif sentence.count('{') != sentence.count('}'):
            return False
        elif sentence.count('(') != sentence.count(')'):
            return False
        else:
            for i in range(0, len(sentence)):
                if new_text[i] == '[':
                    new_sentence.append('[')
                if new_text[i] == '(':
                    new_sentence.append('(')
                if new_text[i] == '{':
                    new_sentence.append('{')
                if new_text[i] == ']':
                    if new_sentence[-1] == '[':
                        new_sentence.pop()
                if new_text[i] == '}':
                    if new_sentence[-1] == '{':
                        new_sentence.pop()
                if new_text[i] == ')':
                    if new_sentence[-1] == '(':
                        new_sentence.pop()
            if new_sentence == []:
                return True
            else:
                return False
