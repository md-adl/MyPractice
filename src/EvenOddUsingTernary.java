import java.util.*;
public class EvenOddUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num %2 == 0) ? "Even" : "odd" ;
        System.out.println(result);
    }
}
