package BankDetails;

class Account {
    public String AccountHolderName;
    protected String email;
    private String Password;
    int accountNumber;

    public void accInfo() {
        System.out.println("Account holder name : " + accountNumber);
        System.out.println("Account holder email : " + email);
        System.out.println("Account holder account number : " + accountNumber);
        // System.out.println("Account password : "+getPaaword());
    }

    // getters and setters
    public String getPaaword() {
        return this.Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}

public class BankDetails {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.email = "piyushkuma045";
        ac.accountNumber = 125463;
        ac.accInfo();
        ac.setPassword("123");
        System.out.println("Account password : " + ac.getPaaword());
        // ac.getPaaword();
    }

}
