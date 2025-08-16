
public class Main {
    public static void main(String[] args){
        /*to define the name and email adress of customers through the function parameters*/
        Customer customer1 = new Customer("Cátia", "catiaalbuquerque@gmail.com");
        Customer custumer2 = new Customer("Vitor","vitorlima@gmail.com");

        /*to define the title, author and price of book through the function parameters*/
        Book book1 = new Book("Java®: Como Programar","Paul Deitel and Harvey Deitel", 474.40);
        Book book2 = new Book("Peter Jandl Junior","Java Guia do Programador - 4ª Edição", 90.69);
        
        /*triggering the print methods for each client*/
        customer1.buy(book1);
        customer1.inspect(book1);

        custumer2.buy(book2);
        custumer2.inspect(book2);

    }
}
