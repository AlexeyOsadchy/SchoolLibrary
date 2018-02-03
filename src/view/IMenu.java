package view;

import model.Book;
import model.Pupil;

import java.util.List;

/**
 * Created by Алексей on 02-Feb-18.
 */
public interface IMenu {

    void showMainMenu();

    void showChooseSortingMenu();

    void showListPupils(List<Pupil> pupils);

    void showListBooks(List<Book> books);
}
