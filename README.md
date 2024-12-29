# 1)Armstrong Number Checker ✨

A Java program to check if a number is an Armstrong number, where the number equals the sum of its digits raised to the power of the number of digits.

Features ✔️

🌐 Calculates the number of digits.

⚙️ Verifies Armstrong numbers using custom power computation.

💡 Provides user-friendly console input/output.

##How It Works 🔄

Input: User enters a number.

Process: Computes the sum of each digit raised to the power of the digit count.

Output: Prints true if the number is Armstrong, otherwise false.


# 2)Deficient, Perfect, and Abundant Number Checker ✨

A Java program to classify a number as Deficient, Perfect, or Abundant based on the sum of its divisors (excluding itself).

##Features ✔️

🔢 Identifies whether a number is:

Deficient: Sum of divisors < Number.

Perfect: Sum of divisors = Number.

Abundant: Sum of divisors > Number.

💡 Simple user input and intuitive results.

##How It Works 🔄

Input: User enters a number.

Process:

Iterates through numbers from 1 to half of the input.

Calculates the sum of all divisors (excluding the number itself).

Output:

Prints Deficient if the sum is less than the input.

Prints Perfect if the sum equals the input.

Prints Abundant if the sum is greater than the input.


# 3)Division of a Number ✨

A Java program to find all divisors of a given number and display them.

##Features ✔️

🔍 Computes all divisors of a number.

💡 Simple and efficient loop-based computation.

🖥️ Displays results in a comma-separated format.

##How It Works 🔄

Input: User enters a number.

Process:

Iterates through numbers from 1 to the input.

Checks if the current number divides the input without a remainder.

Collects all divisors.

Output: Displays all divisors in a comma-separated format.


# 4)Factorial Program ✨
A Java program to calculate the factorial of a number entered by the user.

##Features ✔️
🌐 Prompts the user to input a number.

⚙️ Calculates the factorial of the number using a loop.

💡 Provides user-friendly console input/output.

##How It Works 🔄
Input:
User enters a number.

Process:
The program calculates the factorial of the entered number using a for loop.
Output:
Prints the factorial of the number entered by the user.


# 5)Finding Digital Root ✨
A Java program to find the digital root of a number. The digital root is obtained by repeatedly summing the digits of the number until a single digit is obtained.

##Features ✔️
🌐 Calculates the digital root of a number.

⚙️ Uses a loop to sum the digits of the number repeatedly.

💡 Provides user-friendly console input/output.

##How It Works 🔄
Input:
User enters a number.

Process:
The program repeatedly calculates the sum of the digits of the number until a single-digit result is obtained.
Output:
Prints the digital root (a single-digit result).

# 6)GCD Program ✨
A Java program to calculate the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm.

##Features ✔️
🌐 Calculates the GCD of two numbers.

⚙️ Uses the Euclidean algorithm for efficient calculation.

💡 Provides user-friendly console input/output.

##How It Works 🔄
Input:
User enters two numbers.

Process:
The program calculates the GCD of the two numbers by repeatedly applying the Euclidean algorithm, which involves dividing the larger number by the smaller one and replacing the larger number with the remainder until the remainder is zero.
Output:
Prints the GCD of the two numbers.

# 7)Perfect Number Checker ✨
A Java program to check whether a number is a Perfect Number based on the sum of its divisors (excluding itself).

Features ✔️
🔢 Identifies whether a number is Perfect:

A number is considered Perfect if the sum of its divisors (excluding itself) equals the number itself.
💡 Simple user input and intuitive results.

##How It Works 🔄
Input:
User enters a positive number.
Process:
Validates that the input is positive.
Iterates through numbers from 1 to num/2 (divisors cannot exceed half the number).
Calculates the sum of all divisors of the input number (excluding the number itself).
Output:
Prints a message indicating whether the number is a Perfect Number or Not a Perfect Number.

# 8)Prime Number Checker ✨
A Java program to determine whether a number is prime.

Features ✔️
🔢 Identifies whether a number is:

Prime: A number greater than 1 with no divisors other than 1 and itself.
Not Prime: A number that has divisors other than 1 and itself.
💡 Efficient calculation using square root optimization for divisor checking.

##How It Works 🔄
Input:
User enters an integer.
Process:
Validates the input:
If the number is <= 1, it is not a prime number.
Special case: 2 is a prime number.
Iterates through numbers from 2 to the square root of the input number.
Checks if the number has any divisors other than 1 and itself.
Uses a boolean flag to determine if the number is prime.
Output:
Prints true if the number is prime.
Prints false if the number is not prime.


# 9)Nth Fibonacci Number Finder ✨
A Java program to find the Fibonacci number at a given position.

Features ✔️
🔢 Calculates the Fibonacci number for any non-negative position:

Fibonacci Sequence: A sequence where each number is the sum of the two preceding ones, starting with 0 and 1.
💡 Efficient iterative approach to calculate Fibonacci numbers.

##How It Works 🔄
Input:
User enters a non-negative integer representing the position in the Fibonacci sequence.
Process:
Validates the input:
If the input is negative, prompts the user to enter a valid non-negative number.
Handles edge cases for 0 and 1 directly.
Uses an iterative approach to calculate the Fibonacci number for positions 2 and above:
Starts with the first two Fibonacci numbers (0 and 1).
Iteratively computes the Fibonacci number up to the given position.
Output:
Prints the Fibonacci number at the specified position.


# 10)Sum of First N Natural Numbers ✨
A Java program to calculate the sum of the first N natural numbers.

Features ✔️
🔢 Calculates the sum of the first N natural numbers:

Uses the mathematical formula n * (n + 1) / 2 for efficient calculation.
💡 Simple user input with intuitive output.

##How It Works 🔄
Input:
User enters a non-negative integer N.
Process:
Validates the input:
If the input is negative, it prompts the user to enter a non-negative number.
Calculates the sum of the first N natural numbers using the formula:
sum = n * (n + 1) / 2
Output:
Prints the sum of the first N natural numbers.
