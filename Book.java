package NTUSingapore.Exercise2;

/**
 * Created by Cao on 6/23/2015.
 */
public class Book {
    private String name;
    Author author;
    private double price;
    private int qtyInStock;
    public Book (String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book (String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
    public String toString(){
        return getName() + " by " + getAuthor();
    }
}
