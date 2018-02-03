package Sorting;

import model.Pupil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Алексей on 02-Feb-18.
 */
public abstract class MoreLessGivenNumber extends SortAbs {

    protected int number;

    public MoreLessGivenNumber(TypeSort typeSort, int number) {
        super(typeSort);
        this.number = number;
    }

    @Override
    public List<Pupil> sort(List<Pupil> pupils) {
        return checkOrder(sortingProcess(pupils));
    }

    private List<Pupil> sortingProcess(List<Pupil> pupils) {
        List<Pupil> result = new ArrayList<>();
        for (Pupil p : pupils) {
            if (condition(p)) {
                result.add(p);
            }
        }
        return result;
    }

    protected abstract boolean condition(Pupil pupil);

    private List<Pupil> checkOrder(List<Pupil> pupils) {
        if (typeSort == TypeSort.SORT_UP) {
            Collections.sort(pupils, comparator);
        } else if (typeSort == TypeSort.SORT_DOWN) {
            Collections.sort(pupils, comparator);
            Collections.reverse(pupils);
        }
        return pupils;
    }

    Comparator<Pupil> comparator = new Comparator<Pupil>() {
        @Override
        public int compare(Pupil left, Pupil right) {
            return left.getNumberReadBooks() - right.getNumberReadBooks();
        }
    };
}
