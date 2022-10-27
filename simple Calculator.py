# Python based simple calculator that can add, subtract, multiply and divide using functions
# Here X and Y are two numbers

# This function adds two numbers 
def add(a, b):
   return a + b
# This function subtracts two numbers 
def subtract(a, b):
   return a - b
# This function multiplies two numbers
def multiply(a, b):
   return a * b
# This function divides two numbers
def divide(a, b):
   return a / b
# This function is for operation
print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")
# Take input from the user 
choice = input("Enter your choice(1/2/3/4):")
num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
# This function is for operational purposes
if choice == '1':
   print(num1,"+",num2,"=", add(num1,num2))
elif choice == '2':
   print(num1,"-",num2,"=", subtract(num1,num2))
elif choice == '3':
   print(num1,"*",num2,"=", multiply(num1,num2))
elif choice == '4':
   print(num1,"/",num2,"=", divide(num1,num2))
else:
# This function is for results of above commands
   print("Invalid input")