package Sorting;

import model.Pupil;

public class MoreGivenNumber extends MoreLessGivenNumber {

    public MoreGivenNumber(TypeSort typeSort, int number) {
        super(typeSort, number);
    }

    @Override
    protected boolean condition(Pupil pupil) {
        if (pupil.getNumberReadBooks() > number) {
            return true;
        }
        return false;
    }
}
