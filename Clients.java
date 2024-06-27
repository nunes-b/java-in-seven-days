public class Clients {
    String firstName;
    Integer age;
    private Integer balance;

    //constructor
    Clients () {
        balance = 10;
    }

    void newAccount(){
        System.out.print(firstName + " Account created!\n");
        System.out.println("Balance: $" + balance);
    }
    void deposit (double value){
        int avaliableBalance = balance;
        double extract = avaliableBalance + value;
        System.out.println("Deposit: $" + value);
        System.out.println("New balance: $" + extract);
    }
}
