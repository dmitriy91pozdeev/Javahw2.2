public class Main {
    public static void main(String[] args) {

        int balance = 100; // баланс
        int replenishment = 1100; // сумма пополнения
        int bonus = replenishment/100; // количество бонусов за пополнение
        int noBonus = balance + replenishment; // баланс после пополнения на сумму до 1000 руб.
        int withBonus = balance + replenishment + bonus; // баланс после пополнения на сумму более 1000 руб.

        if (replenishment <= 1000) {
            System.out.println("Текущий баланс: " + noBonus + " руб.");
        } else {
            System.out.println("Текущий баланс: " + withBonus + " руб.");
            System.out.println("Бонус: " + bonus + " руб.");
        }

    }
}
