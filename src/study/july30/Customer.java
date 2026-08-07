package study.july30;

public class Customer {

    // 필드 생성
    private String name;
    private String accountNum;
    private int totalMoney;

    // 생성자
    public Customer (String name, String accountNum) {
        this.name = name;
        this.accountNum = accountNum;
    }

    public String getName() {
        return name;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public int getTotalMoney() {
        return totalMoney;
    }


    public void deposit() {
        System.out.println("입금");
    }

    public void withdrawal() {
        System.out.println("출금");
    }

    public void showInfo() {
        System.out.println("-------- 고객 정보 --------");
        System.out.println("이름: " + name);
        System.out.println("계좌 번호: " + accountNum);
        System.out.println("계좌 총 금액: " + totalMoney);
    }




}
