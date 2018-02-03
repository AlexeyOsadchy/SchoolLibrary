package Controller;

import Sorting.*;
import model.PupilsProvider;
import model.PupilsRepository;
import view.IMenu;
import view.MenuView;

/**
 * Created by Алексей on 02-Feb-18.
 */
public class ControllerLibrary implements IController {

    private IMenu view;
    private PupilsRepository repository;
    private SortController sortingController;

    public ControllerLibrary() {
        repository = new PupilsProvider();
        sortingController = new SortController();
    }

    @Override
    public void onAttach(MenuView menu) {
        view = menu;
        view.showMainMenu();
    }

    @Override
    public void onStatisticsClick() {
        view.showChooseSortingMenu();
    }

    @Override
    public void onShowBooksListClick() {
        view.showListBooks(repository.getAllBooks());
    }

    @Override
    public void onSortMoreGivenNumber(int number, TypeSort typeSort) {
        view.showListPupils(sortingController.sort(new MoreGivenNumber(typeSort, number), repository.getAllPupils()));
    }

    @Override
    public void onSortLessGivenNumber(int number, TypeSort typeSort) {
        view.showListPupils(sortingController.sort(new LessGivenNumber(typeSort, number), repository.getAllPupils()));
    }

    @Override
    public void onSortEqualGivenNumber(int number, TypeSort typeSort) {
        view.showListPupils(sortingController.sort(new EqualGivenNumber(typeSort, number), repository.getAllPupils()));
    }

    @Override
    public void onSortRangeGivenNumber(int bottom, int top, TypeSort typeSort) {
        view.showListPupils(sortingController.sort(new RangeGivenNumber(typeSort, top, bottom), repository.getAllPupils()));
    }

    @Override
    public void onShowFullStatistics() {
        view.showListPupils(repository.getAllPupils());
    }

}
