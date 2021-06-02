package Demo1;

public class ValidateEmail {
    private static Validation emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        emailExample = new Validation();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validates(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validates(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}