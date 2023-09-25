package co.com.choucair.models.builder;

import co.com.choucair.helpers.DataGenerator;
import co.com.choucair.models.PersonalInformation;
import javafx.util.Builder;

public class PersonalInformationBuilder implements Builder<PersonalInformation> {

    private String name;
    private String lastName;
    private String email;
    private String city;
    private String lenguage;
    private String zipCode;
    private String password;

    private PersonalInformationBuilder() {
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.city = "";
        this.lenguage = "";
        this.zipCode = "";
        this.password = "";
    }

    @Override
    public PersonalInformation build() {
        return new PersonalInformation(this);
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

    public static PersonalInformationBuilder with(){
        return new PersonalInformationBuilder();
    }

    public PersonalInformationBuilder withName(String name){
        this.name=name;
        return this;
    }

    public PersonalInformationBuilder withLastName(String lastName){
        this.lastName=lastName;
        return this;
    }

    public PersonalInformationBuilder withEmail(String email){
        this.email=email;
        return this;
    }

    public PersonalInformationBuilder withCity(String city){
        this.city=city;
        return this;
    }

    public PersonalInformationBuilder withLenguage(String lenguage){
        this.lenguage=lenguage;
        return this;
    }

    public PersonalInformationBuilder withZipCode(String zipCode){
        this.zipCode=zipCode;
        return this;
    }
    public PersonalInformationBuilder withPassword(String password){
        this.password=password;
        return this;
    }

    public PersonalInformation withInformation(){
        withName("Walberto");
        withLastName("Mazzilli");
        withCity("Barranquilla");
        withZipCode("253417");
        withEmail(DataGenerator.getRandomEmail());
        withLenguage("Spanish");
        withPassword("Nicolas32@");
        return build();
    }



}
