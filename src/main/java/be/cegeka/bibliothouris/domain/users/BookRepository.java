package be.cegeka.bibliothouris.domain.users;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class BookRepository {
    List<Book> bookList;

    @PersistenceContext
    private EntityManager entityManager;

//    Klopt nog niet ;)
    public List<Book> getAllBooks() {
        return bookList;
    }
}
