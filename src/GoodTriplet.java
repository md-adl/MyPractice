import java.util.*;
public class GoodTriplet {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A+B == C || A+C == B || B+C==A || B+A==C ){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}

//Quesion
//        Three Numbers
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given three numbers A, B, C. The triplet is said to be a "good triplet" if the sum of any two numbers is equal to the third number.
//        Print 1 if the triplet is good, else print 0.
//        Input
//        Three integers are given as input. a, b, c.
//
//        Constraints
//        1 ≤ a, b, c ≤ 104
//        Output
//        Print 1 if three numbers form a good triplet else print 0.
//        Example
//        Sample Input:
//        2 5 3
//
//        Sample Output:
//        1
//
//        Explanation:
//        sum of (2, 3) is 5.
