package co.com.choucair.models;

import co.com.choucair.helpers.DataGenerator;
import co.com.choucair.models.builder.PersonalInformationBuilder;

public class PersonalInformation {

    private String name;
    private String lastName;
    private String email;
    private String city;
    private String lenguage;
    private String zipCode;
    private String password;

    public PersonalInformation(PersonalInformationBuilder personalInformationBuilder) {
        this.name = personalInformationBuilder.getName();
        this.lastName = personalInformationBuilder.getLastName();
        this.email = personalInformationBuilder.getEmail();
        this.city = personalInformationBuilder.getCity();
        this.lenguage = personalInformationBuilder.getLenguage();
        this.zipCode = personalInformationBuilder.getZipCode();
        this.password = personalInformationBuilder.getPassword();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getLenguage() {
        return lenguage;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPassword() {
        return password;
    }

}
