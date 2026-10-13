
public class ShoppingTotal {
    public void getPrice(){
        String ProNane = "Vaseline";
        double price =12.50;
        int quantity = 19;
        double discount = 0.25;

        double AmtDue =price * quantity-(price * quantity) * discount ;
        System.out.println("Your Total is: "+ AmtDue);
    }



}
