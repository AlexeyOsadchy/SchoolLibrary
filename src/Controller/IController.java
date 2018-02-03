package Controller;

import Sorting.TypeSort;
import view.MenuView;

/**
 * Created by Алексей on 02-Feb-18.
 */
public interface IController {

    void onAttach(MenuView menu);

    void onStatisticsClick();

    void onShowBooksListClick();

    void onSortMoreGivenNumber(int number, TypeSort typeSort);

    void onSortLessGivenNumber(int number, TypeSort typeSort);

    void onSortEqualGivenNumber(int number, TypeSort typeSort);

    void onSortRangeGivenNumber(int bottom, int top, TypeSort typeSort);

    void onShowFullStatistics();
}
