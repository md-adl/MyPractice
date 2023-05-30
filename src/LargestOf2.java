import java.util.*;
public class LargestOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A is the largest");
        }else {
            System.out.println("B is the largest");
        }
    }
}
