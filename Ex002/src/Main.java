
public class Main {
    public static void main(String[] args){

        Customer customer1 = new Customer("Cátia", "catiaalbuquerque@gmail.com");
        Customer custumer2 = new Customer("Vitor","vitorlima@gmail.com");


        Book book1 = new Book("Java®: Como Programar","Paul Deitel and Harvey Deitel", 474.40);
        Book book2 = new Book("Peter Jandl Junior","Java Guia do Programador - 4ª Edição", 90.69);
        
        customer1.buy(book1);
        customer1.inspect(book1);

        custumer2.buy(book2);
        custumer2.inspect(book2);

    }
}
