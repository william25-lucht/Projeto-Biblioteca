import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> listBooks(){
        return books;
    }

    public List<Book> seachByTitle(String title){
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())){
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> seachByAuthor(String author){
    List<Book> result = new ArrayList<>();
    for (Book livro : books) {
         if (livro.getAuthor().toLowerCase().equals(author.toLowerCase())){
             result.add(livro);
         }
    }
    return result;
}

public boolean removeByIsbn(String isbn) {
    return books.removeIf(book -> livro.getIsbn().equals(isbn));
    }
}