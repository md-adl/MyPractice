import  java.util.*;
public class EvenAndOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do{
            int number = sc.nextInt();
            if(number % 2 == 0){
                evenSum = evenSum +number;
            }else {
                oddSum = oddSum + number;
            }
            System.out.println("Do You Want to continue Press 1 else 0");
            choice = sc.nextInt();
        }while (choice == 1);

        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}

//
//Question 2 : Write a program that reads a set of integers, and then prints the sum of the
//        even and odd integers