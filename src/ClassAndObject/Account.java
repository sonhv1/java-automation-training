package ClassAndObject;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(){}

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}


