import java.util.*;
public class FactorialUsingFunction {

    public static int Factorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Factorial(n);
        System.out.println(result);
    }
}
