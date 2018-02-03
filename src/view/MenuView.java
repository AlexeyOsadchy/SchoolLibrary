package view;

import Controller.ControllerLibrary;
import Controller.IController;
import Sorting.TypeSort;
import model.Book;
import model.Pupil;
import utils.Utils;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Алексей on 02-Feb-18.
 */
public class MenuView implements IMenu {

    private static final String MENU_ITEM_BACK = "Back";

    private static final String MENU_ITEM_STATISTICS = "Show statistics";
    private static final String MENU_ITEM_BOOKS_LIST = "Show list of books";

    private static final String MENU_ITEM_MORE_GIVEN_NUMBER_UP = "More given number (number of books upwards)";
    private static final String MENU_ITEM_MORE_GIVEN_NUMBER_DOWN = "More given number (number of books downwards)";
    private static final String MENU_ITEM_LESS_GIVEN_NUMBER_UP = "Less given number (number of books upwards)";
    private static final String MENU_ITEM_LESS_GIVEN_NUMBER_DOWN = "Less given number (number of books downwards)";
    private static final String MENU_ITEM_EQUAL_GIVEN_NUMBER = "Equal given number";
    private static final String MENU_ITEM_RANGE_GIVEN_NUMBER_UP = "Range of books (number of books upwards)";
    private static final String MENU_ITEM_RANGE_GIVEN_NUMBER_DOWN = "Range of books (number of books downwards)";
    private static final String MENU_ITEM_FULL_STATISTICS = "Show full statistics";


    private IController controller;
    private Scanner scanner;

    public MenuView() {
        controller = new ControllerLibrary();
        scanner = new Scanner(System.in);
        controller.onAttach(this);
    }

    @Override
    public void showMainMenu() {
        while (true) {
            System.out.println();
            System.out.println("1) " + MENU_ITEM_BOOKS_LIST);
            System.out.println("2) " + MENU_ITEM_STATISTICS);
            System.out.println("3) " + MENU_ITEM_BACK);
            switch (scanner.next()) {
                case "1":
                    controller.onShowBooksListClick();
                    break;
                case "2":
                    controller.onStatisticsClick();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Incorrect input");
            }
        }
    }

    @Override
    public void showChooseSortingMenu() {
        while (true) {
            System.out.println();
            System.out.println("1) " + MENU_ITEM_MORE_GIVEN_NUMBER_UP);
            System.out.println("2) " + MENU_ITEM_MORE_GIVEN_NUMBER_DOWN);
            System.out.println("3) " + MENU_ITEM_LESS_GIVEN_NUMBER_UP);
            System.out.println("4) " + MENU_ITEM_LESS_GIVEN_NUMBER_DOWN);
            System.out.println("5) " + MENU_ITEM_EQUAL_GIVEN_NUMBER);
            System.out.println("6) " + MENU_ITEM_RANGE_GIVEN_NUMBER_UP);
            System.out.println("7) " + MENU_ITEM_RANGE_GIVEN_NUMBER_DOWN);
            System.out.println("8) " + MENU_ITEM_FULL_STATISTICS);
            System.out.println("9) " + MENU_ITEM_BACK);
            switch (scanner.next()) {
                case "1":
                    controller.onSortMoreGivenNumber(enterParams("Enter number"), TypeSort.SORT_UP);
                    break;
                case "2":
                    controller.onSortMoreGivenNumber(enterParams("Enter number"), TypeSort.SORT_DOWN);
                    break;
                case "3":
                    controller.onSortLessGivenNumber(enterParams("Enter number"), TypeSort.SORT_UP);
                    break;
                case "4":
                    controller.onSortLessGivenNumber(enterParams("Enter number"), TypeSort.SORT_DOWN);
                    break;
                case "5":
                    controller.onSortEqualGivenNumber(enterParams("Enter number"), TypeSort.SORT_DOWN);
                    break;
                case "6":
                    controller.onSortRangeGivenNumber(
                            enterParams("Enter bottom number"), enterParams("Enter top number"), TypeSort.SORT_UP);
                    break;
                case "7":
                    controller.onSortRangeGivenNumber(
                            enterParams("Enter bottom number"), enterParams("Enter top number"), TypeSort.SORT_DOWN);
                    break;
                case "8":
                    controller.onShowFullStatistics();
                    break;
                case "9":
                    return;
                default:
                    System.out.println("Incorrect input");
            }
            System.out.println("\nEnter any key for continue");
            scanner.next();
        }
    }

    private int enterParams(String message) {
        while (true) {
            System.out.println(message);
            String s = scanner.next();

            if (Utils.checkWithRegExp(s)) {
                return Integer.valueOf(s);
            } else {
                System.out.println("Incorrect input");
            }
        }
    }

    @Override
    public void showListPupils(List<Pupil> pupils) {
        if (pupils.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Pupil pupil : pupils) {
                System.out.println(pupil.getFullName() + " has read " + pupil.getNumberReadBooks() + " books");
            }
        }
    }

    @Override
    public void showListBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.getBookId() + " " + book.getNameOfBook());
        }
    }


}
