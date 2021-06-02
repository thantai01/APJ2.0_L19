package Demo2;

public class Main {
    private static AccountValidate accountValidate;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        accountValidate = new AccountValidate();
        for (String account : validAccount) {
            boolean isvalid = accountValidate.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountValidate.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
