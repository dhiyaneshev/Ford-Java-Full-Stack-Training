import java.util.Random;
import java.util.Scanner;

//import org.apache.commons.lang3.RandomStringUtils;
public class ITSupportAdministrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the department number refering the following\n" +
                "1. Technical\n" +
                "2. Admin\n" +
                "3. Human Resource\n" +
                "4. Legal\n");
        int deptNum = sc.nextInt();
        System.out.println("Enter First Name:");
        String firstName = sc.next();
        System.out.println("Enter Last Name:");
        String lastName = sc.next();

        CredentialService credentialService = new CredentialService(firstName, lastName, deptNum);
        credentialService.showCredentials();
    }
}

class CredentialService{

    private String firstName;
    private String lastName;
    private int deptNum;
    private String[] departments = {"Technical","Admin","HumanResource","Legal"};
    private final String company = "ford";

    public CredentialService(String firstName, String lastName, int deptNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNum = deptNum;
    }

    //a)	Generate an email with the following syntax firstNamelastName@department.company.com
    public String generateEmailAddress(){
        return firstName+lastName+"@"+departments[deptNum-1]+"."+company+".com";
    }

    //c)	Generate a random password which will contain(number,capital letter,small letter & special character)
    public String generatePassword(){
//        String validCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\\\|;:\\'\\\",<.>/?";
//        String pwd = "";
        int leftLimit = 32; // numeral ' '
        int rightLimit = 126; // letter '~'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

//        System.out.println(generatedString);
        return generatedString;
    }

    //d)	Display the generated credentials
    public void showCredentials(){
        System.out.println("Dear "+firstName+" your generated credentials are as follows:\n" +
                "Email\t  ---> "+generateEmailAddress()+"\nPassword   ---> "+generatePassword());
//        System.out.print("Email ID: ");
//        System.out.println(generateEmailAddress());
//        System.out.print("Password: ");
//        System.out.println(generatePassword());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeptName() {
        return departments[deptNum-1];
    }

    public String getCompany() {
        return company;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDeptNum(int deptNum) {
        this.deptNum = deptNum;
    }
}
