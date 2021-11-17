import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;
public class UserRegistration {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String firstName = sc.next();
        Predicate<String> firstNameValidate = Pattern
                .compile("^[A-Z]{1}[a-z]{2,}$")
                .asPredicate();
        System.out.println(firstNameValidate.test(firstName));

        System.out.println("Enter your Last Name: ");
        String lastName = sc.next();
        Predicate<String> lastNameValidate = Pattern
                .compile("^[A-Z]{1}[a-z]{2,}$")
                .asPredicate();
        System.out.println(lastNameValidate.test(lastName));

        System.out.println("Enter your Email ID: ");
        String email = sc.next();
        Predicate<String> emailValidate = Pattern
                .compile("[a-z0-9_+]*(.[a-z0-9_])*?@[a-z]*.(co|com|edu)(.[a-z])?$")
                .asPredicate();
        System.out.println(emailValidate.test(email));

        System.out.println("Enter your Mobile Number with the Country code: ");
        String mobileNo = sc.next();
        Predicate<String> mobileNoValidate = Pattern
                .compile("^[0-9]{2}\s?[0-9]{10}$")
                .asPredicate();
        System.out.println(mobileNoValidate.test(mobileNo));

        System.out.println("Enter Password (min 8 characters, at least one 1 Upper Case, at least 1 number and 1 special character): ");
        String password = sc.next();
        Predicate<String> passwordValidate = Pattern
                .compile("^(?=.*[~!@#$%^&*-+=()])(?=.*[0-9])(?=.*[A-Z]).{8,}")
                .asPredicate();
        System.out.println(passwordValidate.test(password));
        sc.close();
    }
}