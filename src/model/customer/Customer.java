package model.customer;

import java.util.regex.Pattern;

public class Customer {

    private static final String EMAIL_REGEX_PATTERN = "^(.+)@(.+).(.+)$";
    private final String firstname;
    private final String lastName;
    private final String email;

    public Customer(final String firstName, final String lastName, final String email){
        this.firstname = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isValidEmail(email);
    }

    private void isValidEmail(final String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);

        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Invalid email");
        }
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return "First Name: " + this.firstname + " Last Name: " + this.lastName + " Emai: " + this.email;
    }


}
