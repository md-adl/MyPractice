import java.util.*;
public class PrintHelloWorldUsingFunction {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int CalculateSum(int num1, int num2){ // Here num1, num2 are Parameters

        int sum = num1 + num2;
        return sum;
    }

    public static void  swap(int a , int b){
        int temp = a;
             a = b;
             b = temp;
        System.out.println(" a= " + a);
        System.out.println(" b= " + b);
    }

    public static void main(String[] args) {
//         printHelloWorld();
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//       int sum =  CalculateSum(a , b); // Here a , and b are As Arguments
//       System.out.println("Sum of Two Number is" + sum);

//        int a = 4;
//        int b = 8;
//        swap(a, b);
//        System.out.println(" a= " + a);
//        System.out.println(" b= " + b);
    }
}
