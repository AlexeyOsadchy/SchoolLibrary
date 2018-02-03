package Sorting;

import model.Pupil;

public class RangeGivenNumber extends MoreLessGivenNumber {

    private int top;
    private int bottom;

    public RangeGivenNumber(TypeSort typeSort, int top, int bottom) {
        super(typeSort, top);
        this.bottom = bottom;
        this.top = top;
    }

    @Override
    protected boolean condition(Pupil pupil) {
        if (pupil.getNumberReadBooks() >= bottom && pupil.getNumberReadBooks() <= top) {
            return true;
        }
        return false;
    }
}
