package app;

import java.util.Scanner;
import java.util.Locale;
public class DataProvider {

    public String getUserData() {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        System.out.println("Please, input indicator value : ");
        return input.nextLine().trim();
    }
}
