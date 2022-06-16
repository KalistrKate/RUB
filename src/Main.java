public class Main {
    public static void main(String[] args) {

        int account = 100; // Начальный баланс
        int paid = 1200; // Сумма пополнения
        int newBalance = paid + account;
        int bonus;
        if (paid > 1000) {
            bonus = paid / 100 * 1;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + (newBalance + bonus));
        System.out.println("Начислено бонусов:" + bonus);
    }
}
