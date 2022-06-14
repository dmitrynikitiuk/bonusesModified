public class Main {
    public static void main(String[] args) {
int account = 100;
int fill = 8900;
int bonus;
if (fill > 1000) {bonus = fill / 100;} else {bonus = 0;};
int sum = account + fill + bonus;
        System.out.println("Итоговая сумма на счёте составляет:" + sum);
        System.out.println("Сумма бонусных рублей составляет:" + bonus);
}
}