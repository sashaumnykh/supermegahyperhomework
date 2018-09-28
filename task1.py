def rotate(list):
    if list == []:
        return list
    else:
        new_list = []
        lenght = len(list)
        the_last = list[lenght-1]
        new_list.append(the_last)
        new_list.extend(list)
        new_list.pop(-1)
        return new_list

test =list (input().split(" "))
print(rotate(test))