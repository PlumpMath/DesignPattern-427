package proxy;

public class Customer implements IBuyCar {
	private int cash;//购车款

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
	
	public void buyCar() {
		System.out.println("buyCar买一辆车花费了-->" + cash + "元");
	}

}
