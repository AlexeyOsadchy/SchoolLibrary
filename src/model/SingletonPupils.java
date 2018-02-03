package model;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 02-Feb-18.
 */
public class SingletonPupils {

    private static final String PUPILS_FILE_NAME = "Pupils.txt";

    private static SingletonPupils sSingletonPupils;
    private List<Pupil> pupils;

    private SingletonPupils() {
        pupils = new ArrayList<>();
        initialization();
    }

    public static SingletonPupils getInstance() {
        if (sSingletonPupils == null) {
            sSingletonPupils = new SingletonPupils();
        }
        return sSingletonPupils;
    }

    public List<Pupil> getPupils() {
        return pupils;
    }

    private void initialization() {
        this.pupils = Utils.parsePupil(Utils.read(PUPILS_FILE_NAME));
    }
}
