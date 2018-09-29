def rotate(lst):
    if lst == []:
        return lst
    else:
        new_lst = []

        the_last = lst[-1]
        new_lst.append(the_last)
        new_lst.extend(lst)
        new_lst.pop(-1)
        return new_lst

test =list (input().split(" "))
print(rotate(test))