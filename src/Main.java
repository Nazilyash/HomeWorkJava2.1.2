public class Main {
    public static void main(String[] args) {
        int initialBalance = 0;
        int depositAmount = 1001;
        int requiredDepositAmount = 1000;
        int tariff = 100;
        int bonus;
        if (depositAmount > requiredDepositAmount) {
           bonus = depositAmount/tariff;
        }else {
            bonus = 0;
        }
        int finalBalance = initialBalance + depositAmount + bonus;
        System.out.println("Итоговый бонус:");
        System.out.println(bonus);
        System.out.println("Итоговая сумма на счете клиента:");
        System.out.println(finalBalance);
        System.out.println("Done");
    }
}
