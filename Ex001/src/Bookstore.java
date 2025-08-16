public class Bookstore {
    String title;
    String author;
    double price;


    void discount(double disc){
        price -= price*disc/100;
        System.out.printf("Discounted price: %.2f %n", price);
    }

} 
