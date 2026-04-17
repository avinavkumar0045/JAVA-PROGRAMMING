public class Book {
    String title;
    String author;
    double price;

    Book(){

    }
    Book( String a , String b , double c){
        title = a;
        author = b;
        price = c;

    }

    public void display(){
        System.out.println("The title is : "+ title );
        System.out.println("The author is :"+ author) ;
        System.out.println("The price is : "+ price);

       
    }

    public static void main(String[] args) {

        Book a = new Book();
        Book b = new Book("Water", "Avinav", 234);

        b.display();
    
    }
    }