import math
# ball1 = (5.5, 2.4, 8.0)
# ball2 = (5.0, 5.7, 2.0)


def balls_collide(ball1, ball2):
    x1, y1, r1 = ball1
    x2, y2, r2 = ball2
    if (r1 < 0) or (r2 < 0):
        raise ValueError("Радиусы должны быть неотрицательными числами")
    else:
        count1 = (x2-x1)*(x2-x1)
        count2 = (y2-y1)*(y2-y1)
        distance = math.sqrt(count1 + count2)
        if distance <= r1 + r2:
            return True  # сталкиваются
        else:
            return False  # не сталкиваются

# print (balls_collide(ball1, ball2))
