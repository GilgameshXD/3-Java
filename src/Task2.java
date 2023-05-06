public class Task2 {
    public static void main(String[] args) {

        int CurrentBalance = 100;                   // Объявляете переменные для входных данных и
        int TopupAmount = 200;                     // параметров программы: начального счёта,
        int MinimumLimitForBonus = 1000;            // суммы пополнения и тп
        int NewBalance;
        int Bonuses = 0;

        if (TopupAmount > MinimumLimitForBonus) {                                                                // Условным оператором проверяете, превысила ли
            NewBalance = CurrentBalance + TopupAmount + TopupAmount / 100;                                   // сумма пополнения порог, и для этих двух разных
            Bonuses = TopupAmount / 100;                                                                     // сценариев рассчитываете сумму бонуса и выводите
        } else {                                                                                                 // на экран.
            NewBalance = CurrentBalance + TopupAmount;
        }
        System.out.println("Ваш баланс: " + NewBalance + " рубль(-ей)" + "\nБонусов зачислено: " + Bonuses);
    }
}