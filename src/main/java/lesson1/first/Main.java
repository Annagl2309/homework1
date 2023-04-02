package lesson1.first;

public class Main {
    public static void main(String[] args) {
        Person.Builder p = new Person.Builder().addFirstName().addLastName().addMiddleName()
                .addCountry().addPhone().addAge().addGender();
    }
}
