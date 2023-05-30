import java.util.*;
public class SimpleIntrest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();

        int si = (P * R * T)/100;
        System.out.println(si);
    }
}
