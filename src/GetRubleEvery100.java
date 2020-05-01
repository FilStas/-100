public class GetRubleEvery100 {
    public static void main(String[] args) {
        int deposit = 100;
        int oneRubleBonus = 100;
        int accruedBonus;
        int amountСredited = 1001;

        System.out.println("Было на счёте: " + deposit);
        System.out.println("Сумма зачисления: " + amountСredited);

        if (amountСredited >= 1000) {
            accruedBonus = amountСredited / oneRubleBonus;

            System.out.println("Начисленные бонусы: " + accruedBonus);
            System.out.println("Итого: " + (deposit + amountСredited + accruedBonus));
        } else {

            System.out.println("Итого: " + (deposit + amountСredited));

        }

    }
}
