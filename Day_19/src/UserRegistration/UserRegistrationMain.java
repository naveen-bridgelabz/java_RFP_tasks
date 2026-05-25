package UserRegistration;

public class UserRegistrationMain {

    public static void main(String[] args) {

        UserValidator validator =
                new UserValidator();

        try {

            /*
             * UC1
             */
            System.out.println(
                    validator.validateFirstName(
                            "Naveen"
                    )
            );

            /*
             * UC2
             */
            System.out.println(
                    validator.validateLastName(
                            "Kumar"
                    )
            );

            /*
             * UC3
             */
            System.out.println(
                    validator.validateEmail(
                            "abc.xyz@bl.co.in"
                    )
            );

            /*
             * UC4
             */
            System.out.println(
                    validator.validateMobileNumber(
                            "91 9876543210"
                    )
            );

            /*
             * UC5 to UC8
             */
            System.out.println(
                    validator.validatePassword(
                            "Password@1"
                    )
            );

        } catch (
                InvalidUserDetailsException e
        ) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}