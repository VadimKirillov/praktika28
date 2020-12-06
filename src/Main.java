import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что Вы хотите купить?");
        System.out.println("Мяч - 1, Автомат - 2, Мозги - 3");

        int price = 0;

        Integer i = scanner.nextInt();
        switch (i) {
            case 1: price = 500;
            break;
            case 2: price = 2000;
            break;
            case 3: price = 100000;
            break;
        }



        System.out.println("К оплате: " + price);

        System.out.println("Выберите способ оплаты: Наличными - 1, Картой - 2");


        try {
            Integer j = scanner.nextInt();
            switch (j) {
                case 1: new MoneyPay(price);
                break;
                case 2: new CardPay(price);
                break;
            }
        }

        catch (Exception e){
            System.out.println(e);
        }
    }
}
