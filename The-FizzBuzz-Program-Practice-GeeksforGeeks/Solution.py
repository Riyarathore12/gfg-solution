Problem: The FizzBuzz Program | Practice | GeeksforGeeks

URL: https://www.geeksforgeeks.org/problems/the-fizzbuzz-program/1?page=1&category=Java&sortBy=submissions

Solution:

#User function Template for python3

class Solution:
    def fizzBuzz(self, number):
        if number % 15 == 0:
            print("FizzBuzz")
        elif number % 3 == 0:
            print("Fizz")
        elif number % 5 == 0:
            print("Buzz")
        else:
            print(number)
