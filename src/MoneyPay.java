public class MoneyPay implements PayMethod {
    private int price;

    public MoneyPay(int price) {
        this.price = price;
        pay();
    }

    @Override
    public void pay() {

        System.out.println("Cумма к оплате: " + price);
        System.out.println("Спасибо за заказ!!!");
    }
}