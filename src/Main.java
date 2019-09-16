import java.util.Scanner;



public class Main {



    public static void main(String arg[]){



       /* Book book1= new Book("director","Mary","She published a book");

        book1.getDisplayText();



        Book book2= new Book(5.0,true);

        book2.getTotalrice(5);



        Book book3= new Book(15,false);

        book3.getTotalrice(5);*/


        Book book1= new Book("Forever","Mary","She published a book", 5.0, true);

        Scanner sc = new Scanner(System.in);

      System.out.printf("Enter the number you want to purchase: ");

        int booknu1= sc.nextInt();

        double total=book1.getTotalrice(booknu1);


        System.out.println("Total price for book "+book1.getBookname()+" is "+total);



    }

}
