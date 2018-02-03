package model;

/**
 * Created by Алексей on 02-Feb-18.
 */
public class Pupil {

    private int pupilId;
    private int numberReadBooks;
    private String fullName;

    public Pupil(int id, String fullName, int numberReadBooks) {
        this.pupilId = id;
        this.fullName = fullName;
        this.numberReadBooks = numberReadBooks;
    }

    public int getPupilId() {
        return pupilId;
    }

    public void setPupilId(int pupilId) {
        this.pupilId = pupilId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberReadBooks() {
        return numberReadBooks;
    }

    public void setNumberReadBooks(int numberReadBooks) {
        this.numberReadBooks = numberReadBooks;
    }
}
