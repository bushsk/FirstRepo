def factorial(n):
    if n < 0:
        return None  # Factorial is not defined for negative numbers
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

# Take user input for the number
try:
    number = int(input("Enter a non-negative integer to calculate its factorial: "))
    if number < 0:
        print("Factorial is not defined for negative numbers.")
    else:
        print(f"The factorial of {number} is: {factorial(number)}")
except ValueError:
    print("Invalid input. Please enter a valid integer.")



