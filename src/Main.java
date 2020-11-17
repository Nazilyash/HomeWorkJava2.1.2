public class Main {
    public static void main(String[] args) {
        int InitialBalance = 0;
        int DepositAmount = 1001;
        int RequiredDepositAmount = 1000;
        int tariff = 100;
        int bonus;
        if (DepositAmount > RequiredDepositAmount) {
           bonus = DepositAmount/tariff;
        }else {
            bonus = 0;
        }
        int FinalBalance = InitialBalance + DepositAmount + bonus;
        System.out.println("Итоговый бонус:");
        System.out.println(bonus);
        System.out.println("Итоговая сумма на счете клиента:");
        System.out.println(FinalBalance);
        System.out.println("Done");
    }
}
