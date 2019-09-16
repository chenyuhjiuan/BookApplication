public class Book {

    private String bookname;

    private String author;

    private String description;

    private double price;

    private Boolean isInStock;


    public Book() {

    }

    public Book(String bookname, String author, String description, double price, Boolean isInStock) {
        this.bookname = bookname;
        this.author = author;
        this.description = description;
        this.price = price;

        this.isInStock = isInStock;
    }

    public String getBookname() {
        return bookname;
    }

    public void setTitle(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }
    public void getDisplayText(){


        System.out.println("The author is "+getAuthor()+".");

        System.out.println("The title is "+getBookname()+".");

        System.out.println(getDescription()+"."); }

     public double getTotalrice (int number){

        double totalprice=0;

        if(getInStock()){

            totalprice= number*getPrice();

        }else{
            totalprice=0;
        }

        return totalprice;
    }


}
