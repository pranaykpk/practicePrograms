high = int(input("Enter the higher range of fibo sequence"))
print("0 1",end=" ")
a = 2
b= 0
c= 1
while a<high:
    
    next= b+c
    print(next,end=" ")
    b =c
    c =next
    a +=1