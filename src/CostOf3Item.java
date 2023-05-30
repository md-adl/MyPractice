import java.util.*;
public class CostOf3Item {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float penicl = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalcost = penicl + pen + eraser;
        float GstOnTotalItem = (totalcost * 18)/100;
        float totalcostwitGst = totalcost + GstOnTotalItem;
        System.out.println("GST on Total Item " + GstOnTotalItem);
        System.out.println("Total Cost Include GST " +totalcostwitGst);
        System.out.println("Total Cost without GST " +totalcost);

    }
}

