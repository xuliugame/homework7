//Define the visitor interface, all visitor classes should implement this interface
interface Visitor {
    // The visitBook method allows the visitor to visit a Book element.
    // The Book parameter is the specific element that the visitor will visit and operate on.
    void visitBook(Book book);
}

//  Implement the guest interface and define the book borrowing operation
class Borrow implements Visitor {
    //// If the book has not been borrow, the book has been borrowed, and the information about the borrow will be printed.
    @Override
    public void visitBook(Book book) {
        if (!book.isBorr()) {
            book.setBorr(true);
            System.out.println(book.getTitle() + " was borrowed.");
        }
    }
}

//Implement the guest interface and define the book return operation
class Return implements Visitor {
    // If the book has been borrow, return the book and print the information
    @Override
    public void visitBook(Book book) {
        if (book.isBorr()) {
            book.setBorr(false);
            System.out.println(book.getTitle() + " has been returned.");
        } else {
            System.out.println(book.getTitle() + " was not borrowed.");
        }
    }
}
