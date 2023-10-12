package ie.atu.cicd_week3ex3;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class LibraryService {
    ArrayList<Book> library = new ArrayList<Book>();
    public String addBook(Book book){
        String message = "You have added the book: " + book.getTitle();
        library.add(book);
        return message;
    }

    public ArrayList<Book> getBook(){
        return library;
    }
}
