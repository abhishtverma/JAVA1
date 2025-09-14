package OOPs.Inheritence;

public class testLibraryItem1 {
    public static void main(String[] args) {
        book1 book = new book1();
        book.isbn = "2";
        book.itemID = 9;
        book.checkout();
        book.returnItem();
        // u can use all methods and variables just put them public or static
    }

}
