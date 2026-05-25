package UserRegistration;

import java.util.regex.Pattern;

public class UserValidator {

    /*
     * UC1
     */
    public boolean validateFirstName(
            String firstName
    ) throws InvalidUserDetailsException {

        String regex =
                "^[A-Z][a-z]{2,}$";

        if (!Pattern.matches(regex, firstName)) {

            throw new InvalidUserDetailsException(
                    "Invalid First Name"
            );
        }

        return true;
    }

    /*
     * UC2
     */
    public boolean validateLastName(
            String lastName
    ) throws InvalidUserDetailsException {

        String regex =
                "^[A-Z][a-z]{2,}$";

        if (!Pattern.matches(regex, lastName)) {

            throw new InvalidUserDetailsException(
                    "Invalid Last Name"
            );
        }

        return true;
    }

    /*
     * UC3
     */
    public boolean validateEmail(
            String email
    ) throws InvalidUserDetailsException {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        if (!Pattern.matches(regex, email)) {

            throw new InvalidUserDetailsException(
                    "Invalid Email"
            );
        }

        return true;
    }

    /*
     * UC4
     */
    public boolean validateMobileNumber(
            String mobile
    ) throws InvalidUserDetailsException {

        String regex =
                "^[0-9]{2}\\s[0-9]{10}$";

        if (!Pattern.matches(regex, mobile)) {

            throw new InvalidUserDetailsException(
                    "Invalid Mobile Number"
            );
        }

        return true;
    }

    /*
     * UC8
     */
    public boolean validatePassword(
            String password
    ) throws InvalidUserDetailsException {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*]*[@#$%^&*][^@#$%^&*]*$).{8,}$";

        if (!Pattern.matches(regex, password)) {

            throw new InvalidUserDetailsException(
                    "Invalid Password"
            );
        }

        return true;
    }
}