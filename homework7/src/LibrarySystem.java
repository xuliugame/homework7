// The main class LibrarySystem is used to demonstrate the use of the Visitor pattern.
public class LibrarySystem {
    public static void main(String[] args) {
        //Create Book object
        Book book1 = new Book("SWEN732");
        Book book2 = new Book("SWEN610");

        // create visitor object

        Visitor borrow = new Borrow();
        Visitor returnBook = new Return();

        book1.accept(borrow);
        book2.accept(borrow);

        book1.accept(returnBook); // Return the book "SWEN732"
    }
}
