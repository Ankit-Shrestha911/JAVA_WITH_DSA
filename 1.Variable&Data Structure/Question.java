import java.util.*;

public class Question{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencilPrice=0,penPrice=0,notebookPrice=0;
        float gstBill = 0,finalAnswer=0;
        System.out.println("Enter price of pencil:");
        pencilPrice = sc.nextFloat();
        
        System.out.println("Enter price of pen:");
        penPrice = sc.nextFloat();
        
        System.out.println("Enter price of notebook:");
        notebookPrice = sc.nextFloat();
        
        float tempPrice = pencilPrice+penPrice+notebookPrice;
        gstBill = (18*tempPrice)/100;

        finalAnswer = tempPrice+gstBill;


        //System.out.printf("Your Bill: %.2f",+finalAnswer);
        System.out.print("Your bill: "+finalAnswer);


        
    }
}
