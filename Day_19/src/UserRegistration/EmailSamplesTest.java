package UserRegistration;

public class EmailSamplesTest {

    public static void main(String[] args) {

        UserValidator validator =
                new UserValidator();

        String[] validEmails = {

                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {

                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println(
                "\nVALID EMAILS"
        );

        for (String email : validEmails) {

            try {

                System.out.println(
                        email
                                + " -> "
                                + validator.validateEmail(email)
                );

            } catch (
                    InvalidUserDetailsException e
            ) {

                System.out.println(
                        email
                                + " -> Invalid"
                );
            }
        }

        System.out.println(
                "\nINVALID EMAILS"
        );

        for (String email : invalidEmails) {

            try {

                System.out.println(
                        email
                                + " -> "
                                + validator.validateEmail(email)
                );

            } catch (
                    InvalidUserDetailsException e
            ) {

                System.out.println(
                        email
                                + " -> Invalid"
                );
            }
        }
    }
}