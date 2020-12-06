import java.util.Scanner;

public class CardPay implements PayMethod {
    private int price,CVV;
    private String cardnum, carddate;



    public CardPay(int price) {
        this.price = price;
        pay();
    }

    public boolean card_info() {
        try {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Оплата картой");
            System.out.println("Введите номер карты(16 знаков):");



            while (1==1) {
                cardnum = scanner.nextLine();
                String regex = "\\d{16}";
                if (cardnum.matches(regex)) {
                    System.out.println("Номер введён верно!");
                    break;
                } else {
                    System.out.println("Неправильный номер карты, попробуйте ещё раз");
                }
            }



            System.out.println("Введите срок действия карты (12/2020)");
            while (true) {
                carddate = scanner.nextLine();
                if (carddate.matches("(0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d")) {
                    System.out.println("Корректно");
                    break;
                } else {
                    System.out.println("Неккоретно, повторите ввод");
                }
            }


            System.out.println("Введите CVV код:");

            while (true) {
                CVV = scanner.nextInt();
                if (CVV > 99 && CVV < 1000) {
                    System.out.println("CVV код введен верно");
                    return true;
                }
                else
                    System.out.println("Неверный код");

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }



    @Override
    public void pay() {
        while (1==1) {
            if (card_info()) {

                System.out.println("Спасибо за заказ!!!");
                return;
            }
            else
                System.out.println("Бан");

        }
    }
}
