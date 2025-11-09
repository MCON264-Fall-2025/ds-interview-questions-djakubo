#  README Template

##  Problem Statement
> Given a string of parentheses determine whether it is balanced and return true or false

---

##  Assumptions
State any assumptions you made while solving the problem.
Examples:
- The input can only be of type String
- The input can contain characters other than parentheses
- There can only be one stack

---

##  Conceptual Solution
The algorithm works by setting up one stack to keep track of the open parentheses in the correct order.
When the program encounters a closing parenthesis it will check if the top of the stack contains a corresponding
open parenthesis and if it does it will remove that open parenthesis. If at any point that is not the case,
the algorithm returns false, but if the entire stack is emptied it will return true. 

Example outline:
1. Program finds the next character in the string and determines whether it is closing or opening
2. If it is opening it pushes onto the stack
3. If it is closing it checks if the top of the stack is the corresponding open parenthesis
4. If it is not it returns false
5. If it is true it pops the opening parenthesis from the stack and repeats the loop with the next character
6. If the loop has completed without returning false than the program will return the isEmpty status of the stack.
   This is done to ensure that there is no remaining open parenthesis that never found its closing parenthesis

---

##  Example
Example:
- input = "{[()}]"
- Expected output: false

- stack = {
- stack = {[
- stack = {[(
- ) matches ( 
- stack = {[
- } does not match [
- returns false

