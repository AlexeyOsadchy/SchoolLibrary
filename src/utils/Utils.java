package utils;

import model.Book;
import model.Pupil;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Алексей on 03-Feb-18.
 */
public class Utils {

    public static List<String> read(String fileName) {
        List<String> strings = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    strings.add(s);
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return strings;
    }

    public static List<Pupil> parsePupil(List<String> strings) {
        List<Pupil> pupils = new ArrayList<>();
        for (String s : strings) {
            String[] params = s.split(",");
            pupils.add(new Pupil(Integer.valueOf(params[0]), params[1], Integer.valueOf(params[2])));
        }
        return pupils;
    }

    public static List<Book> parseBook(List<String> strings) {
        List<Book> books = new ArrayList<>();
        for (String s : strings) {
            String[] params = s.split(",");
            books.add(new Book(Integer.valueOf(params[0]), params[1]));
        }
        return books;
    }

    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("[0-9]{1,2}");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}
