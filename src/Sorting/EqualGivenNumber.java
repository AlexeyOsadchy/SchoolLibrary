package Sorting;

import model.Pupil;

public class EqualGivenNumber extends MoreLessGivenNumber {

    public EqualGivenNumber(TypeSort typeSort, int number) {
        super(typeSort, number);
    }

    @Override
    protected boolean condition(Pupil pupil) {
        if (pupil.getNumberReadBooks() == number) {
            return true;
        }
        return false;
    }
}
