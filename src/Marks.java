import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        String result = (mark >= 33) ? "Pass" : "Fail";
        System.out.println(result);

    }
}
