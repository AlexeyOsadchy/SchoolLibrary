package model;

import java.util.List;

/**
 * Created by Алексей on 02-Feb-18.
 */
public class PupilsProvider implements PupilsRepository {

    @Override
    public List<Pupil> getAllPupils() {
        return SingletonPupils.getInstance().getPupils();
    }

    @Override
    public List<Book> getAllBooks() {
        return SingletonBooks.getInstance().getBooks();
    }
}
