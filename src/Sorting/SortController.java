package Sorting;

import model.Pupil;

import java.util.List;

/**
 * Created by ������� on 02-Feb-18.
 */
public class SortController {

    public List<Pupil> sort(SortAbs sorting, List<Pupil> pupils) {
        return sorting.sort(pupils);
    }
}
