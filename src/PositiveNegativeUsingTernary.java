import java.util.*;
public class PositiveNegativeUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num > 0) ? "Positive" : "Negative";
        System.out.println(result);
    }
}
