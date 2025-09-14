public class book {
    String title;    //instance variable
    String author;
    String isbn;

    static int totalBooks; //static variable

    boolean isBorrowed;

    static{
        totalBooks=0;
    }

    {
        totalBooks++;
    }

    book(String isbn, String title, String author){  //constructor
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    book(String isbn){
        this.isbn=isbn;
    }

    public void borrowBook(){   //instance method
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else{
        this.isBorrowed=true;
        System.out.println("Enjoy the book");
        }
    }
    public void returnBook(){    //instance method
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope u Enjoyed");
        }
        else{
            System.out.println("Book is in library");
        }

    }
    public static int getTotalBooks(){   //static method
        return totalBooks;
    }
    public static void main(String[] args) {
        book physics=new book("1","phy","hcverma");
        book math =new book("2");
        // book chem =new book();  // this will not run bcz we haden't passed any necessary argument
        System.out.println(getTotalBooks());
        physics.borrowBook();
         physics.borrowBook();
        math.returnBook();
        math.borrowBook();
        physics.returnBook();
        physics.returnBook();
    }
}
