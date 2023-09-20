public class main {
    public static void main(String[] args) {

        int a = 100; // баланс
        int b = 1100; // сумма пополнения
        int c = b/100; // количество бонусов за пополнение
        int d = a + b; // баланс после пополнения на сумму до 1000 руб.
        int e = a + b + c; // баланс после пополнения на сумму более 1000 руб.

        if (b <= 1000) {
            System.out.println("Текущий баланс: " + d + " руб.");
        } else {
            System.out.println("Текущий баланс: " + e + " руб.");
            System.out.println("Бонус: " + c + " руб.");
        }

    }
}
