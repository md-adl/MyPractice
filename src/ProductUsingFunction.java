import java.util.*;
public class ProductUsingFunction {

    public static int Prod(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Prod(a , b);
        System.out.println(result);
    }
}
