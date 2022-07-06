public class Main {
    public static void main(String[] args) {

        // входные данные
        int amount = 1100;
        int initial = 100;

        // логика программы
        int bonus = amount / initial;

        if (amount < 1000){
            bonus = 0;
        }

        int result = amount + initial + bonus;

        System.out.printf("Бонус составит: " + bonus);
        System.out.printf("Итоговая сумма составит: " + result);
    }
}
