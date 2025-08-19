
public class Main {
    public static void main(String[] args){
        Bookstore obj1 = new Bookstore(); /*object instantiation */
        Bookstore obj2 = new Bookstore();
    
        obj1.title = "1984";
        obj1.author = "George Orwell";
        obj1.price = 7.28;
         

        obj2.title = "Harry Potter and the Philosopher's Stone";
        obj2.author = "J. K. Rowling";
        obj2.price = 23.71;

        

        System.out.printf("Books in the system: %s and %s %n", obj1.title, obj2.title);

        System.out.printf("The %s was written by %s and costs $ %.2f %n", obj1.title, obj1.author, obj1.price); 
        System.out.printf("But the is a discount, so it comes to "); obj1.discount(15);   

        System.out.printf("The %s was written by %s and costs $ %.2f %n", obj2.title, obj2.author, obj2.price );    
        System.out.printf("But the is a discount, so it comes to "); obj2.discount(15);
    }
    
}
