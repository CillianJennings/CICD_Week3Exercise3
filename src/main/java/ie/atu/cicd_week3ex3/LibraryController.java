package ie.atu.cicd_week3ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LibraryController {
    private final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService ls){
        this.libraryService = ls;
    }

    @PostMapping("/addBook")
    public String getBook(@RequestBody Book book){
        return libraryService.addBook(book);
    }

    @PostMapping("/getBook")
    public ArrayList<Book> getLibrary(){
        return libraryService.getBook();
    }
}
