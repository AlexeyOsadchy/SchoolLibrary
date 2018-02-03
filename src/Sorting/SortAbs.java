package Sorting;

import model.Pupil;

import java.util.List;

/**
 * Created by Алексей on 02-Feb-18.
 */
public abstract class SortAbs {

    protected TypeSort typeSort;

    public SortAbs(TypeSort typeSort) {
        this.typeSort = typeSort;
    }

    public abstract List<Pupil> sort(List<Pupil> pupils);
}
