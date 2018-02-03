package model;

import java.util.List;

/**
 * Created by Алексей on 02-Feb-18.
 */
public interface PupilsRepository {

    List<Pupil> getAllPupils();

    List<Book> getAllBooks();
}
