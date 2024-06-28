def factorial(n):
    if(n==1):
        return 1
    elif(n==0):
        return 1
    else:
        fact=factorial(n-1)*n
        return fact
 
n=int(input("enter number: "))
print("factorial is",factorial(n))
