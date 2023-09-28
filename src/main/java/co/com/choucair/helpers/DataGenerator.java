package co.com.choucair.helpers;

import com.github.javafaker.Faker;
import java.util.Locale;

public class DataGenerator {

    public static Faker faker = new Faker(new Locale("es", "CO"));


    public static String getRandomEmail() {
        String email = faker.internet().emailAddress().toLowerCase();
        return email;
    }

}
