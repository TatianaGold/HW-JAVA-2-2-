public class Main {
    public static void main(String[] args) {

        int initialAmount = 170;
        int deposit = 1500;
        int balance = initialAmount + deposit;
        int bonus;

        (bonus) = (deposit > 1000) ? (deposit / 100) : 0;

        int finalBalance = balance + bonus;

        System.out.println("Сумма на счету: " + balance );
        System.out.println("Бонусных рублей: " + bonus);
        System.out.println("Всего на счету с бонусами: " + finalBalance);
    }
}