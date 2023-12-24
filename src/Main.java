public class Main {
    public static void main(String[] args) {

        int currentBalance = 100; // текущая сумма на счету клиента
        int rechargeAmount = 1100; // сумма пополнения

        int bonusAmount = 0; // сумма бонуса

        if (rechargeAmount > 1000) {
            bonusAmount = rechargeAmount / 100 - 10;
        }

        int totalBalance = currentBalance + rechargeAmount + bonusAmount;

        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonusAmount + " рублей");
    }
}