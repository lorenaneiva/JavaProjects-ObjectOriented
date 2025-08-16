public class Book {
    private String title;
    private String author;
    private double price;

public Book(String title, String author, double price){
    this.title = title; // to define atributtes in the main
    this.author = author;
    this.price = price;
} 

public String getTitle(){return title;} // to print in the class customer
public String getAuthor(){return author;}
public double getPrice(){ return price; }



}
