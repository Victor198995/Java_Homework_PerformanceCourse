Task 1*.
For a positive integer n calculate the result value, which is equal to the sum of the odd numbers of n.
Example,
    n = 1234 result = 4;
    n = 246 result = 0;

Task 2.
For a positive integer n calculate the result value, which is equal to the amount of the “1” in the binary
representation of n.
Example,
    n = 14 = 1110 result = 3;
    n = 128 = 1000 0000 result = 1;

Task 3.
For a positive integer n, calculate the result value, which is equal to the sum of the first n Fibonacci numbers.
Note. Fibonacci numbers are a series of numbers in which each next number is equal to the sum of the two
preceding ones: 0, 1, 1, 2, 3, 5, 8, 13... (the value of the fist element in Fibonacci numbers is "0", the values of the second and the third elements are equal to "1", for other elements use the formula F(n)=F(n-1)+F(n-2))
Example,
    n = 8 result = 33;
    n = 11 result = 143;
    
    *To solve task as in the example
    
Example of task solution in **eMentor**.

**Task**. Find the sum of given integer values of a and b.

Download skeleton code from our cloned repository to solve the task:

    // Implement code according to description of task x
    public static int taskX(int a, int b) {
        //TODO: Delete line below and write your own solution
        throw new UnsupportedOperationException();
    }

Change the skeleton code and put it into our repository:

    public static int taskX(int a, int b) {
        int result; 
        result = a + b;
        return result;
    }
    
Assume, that **a** and **b** values are already set, and assigning new values to them is an error.
The results should be stored in an integer variable, for example **result**, and complete your code with
an operator **return result**;