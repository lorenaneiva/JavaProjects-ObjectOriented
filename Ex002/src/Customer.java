import java.util.Random;
public class Customer {
    /*private means that only the class itself can use this generator. It prevents other parts of the code interfering with it */
    private String name; 
    private int code;
    private String email;
    /*private: só eu uso; static = é da classe; final= não troca.*/
    private static final Random generator = new Random();

    public Customer(){
        /*min + nextInt(max - min +1); for 4 digit codes. */
        this.code = 1000 + generator.nextInt(9000);  
    }

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void buy(Book book){
        System.out.printf("Purchase: %s by the customer %s (code %d, e-mail %s)%n", book.getTitle(), name, code, email);
    }
    public void inspect(Book book){
        System.out.printf("Info about the book:%nTitle: %s%nAuthor: %s%nPrice: %.2f%n", book.getTitle(), book.getAuthor(), book.getPrice());
        System.out.println("--");
    }
    

}
