package study.july30;

public class VIPCustomer extends Customer {

    public String rank;

    public VIPCustomer(String name, String accountNum) {
        super(name, accountNum);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("등급: " + rank);
    }
}
