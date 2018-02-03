import view.MenuView;

/**
 * Created by Алексей on 02-Feb-18.
 */
public class SchoolLibrary {

    private MenuView menuView;

    public SchoolLibrary() {
    }

    public static void main(String[] args) {
        SchoolLibrary library = new SchoolLibrary();
        library.start();
    }

    public void start() {
        menuView = new MenuView();
    }
}
