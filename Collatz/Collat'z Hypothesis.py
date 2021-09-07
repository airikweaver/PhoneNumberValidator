c0 = int(input("Hello! This program is based on Collat'z Theory." +
" The hypothesis says that regardless of the initial value of the number" +
" you type in, it will always go to 1. Please provide a positive integer :"))

steps = 0

while c0 <= 0:
    if c0 == 0:
        c0 = int(input("Please provide a positive integer not equal to 0. Type a new one here : "))
    elif c0 < 0:
        c0 = int(input("Your number cannot be negative. Type a new one here : "))

while c0 != 1:
    print(c0)
    
    if c0 % 2 == 0:
        
        c0 /= 2
        steps +=1
        
    else:
        
        c0 = 3 * c0 + 1
        steps+=1
        
print(c0)

print("It took", steps, "steps to finish.")
