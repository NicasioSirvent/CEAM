#python code that calculates the volume of a cube from one of its side continously until user enters zero as side length

side = float(input("Enter the side length of cube:"))
while side != 0:
    volume = side**3
    print("The volume of cube is",volume)
    side = float(input("Enter the side length of cube:"))
