import java.util.*;
public class IsPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean  isPrime= true;
        if (n == 2) {
            System.out.println("Entered number is Prime");
        }
        else {
            for (int i = 2; i<Math.sqrt(n); i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("Entered number is Prime");
            }else {
                System.out.println("Entered Number is Not Prime");
            }

        }





    }
}
