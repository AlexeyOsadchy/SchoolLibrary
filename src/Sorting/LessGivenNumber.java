package Sorting;

import model.Pupil;

public class LessGivenNumber extends MoreLessGivenNumber {

    public LessGivenNumber(TypeSort typeSort, int number) {
        super(typeSort, number);
    }

    @Override
    protected boolean condition(Pupil pupil) {
        if (pupil.getNumberReadBooks() < number) {
            return true;
        }
        return false;
    }
}