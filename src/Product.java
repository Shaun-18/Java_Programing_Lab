public class Product {
    String prodID;
    String prodName;
    int stock;
    double price;


    Product(String prodID, String prodName, int stock, double price){
        this.prodName = prodName;
        this.prodID = prodID;
        this.stock = stock;
        this.price = price;
    }
    void stockValue(double value){
         value = price * stock;
    }

    void sale(int quantity){
        if (stock > quantity){
            stock = stock - quantity;
        } else {
            System.out.println("Insufficient Stock");
        }
    }
    void addStock(int adding){
        stock = stock + adding;
    }
    void displayProduct(){
        System.out.println("Product Name: " + prodName + " Product ID " + prodID + " Product Price " + price + " Stock " + stock );
    }
}
