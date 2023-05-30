import java.util.*;
public class IsFever {
    public static void main(String[] args) {
        double temp = 103.3;

        String result = (temp > 100.00)? "You have Fever": "Yu dont have Fever" ;
        System.out.println(result);
    }
}
