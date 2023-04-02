package lesson1.first;

import lombok.Data;

@Data
public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;
        public Builder addFirstName() {
            this.firstName = firstName;
            return this;
        }
        public Builder addLastName() {
            this.lastName = lastName;
            return this;
        }
        public Builder addMiddleName() {
            this.middleName = middleName;
            return this;
        }
        public Builder addCountry() {
            this.country = country;
            return this;
        }
        public Builder addAddress(String address) {
            this.address = address;
            return this;
        }
        public Builder addPhone() {
            this.phone = phone;
            return this;
        }
        public Builder addAge() {
            this.age = age;
            return this;
        }
        public Builder addGender() {
            this.gender = gender;
            return this;
        }
    }
}
