public class Main {
    public static void main(String[] args) {
        int moneyStart = 100;
        int moneyPlus = 1002;
        int moneyFinish;

        if (moneyPlus > 1000) {
            moneyFinish = moneyStart + moneyPlus + moneyPlus / 100;
        } else {
            moneyFinish = moneyStart + moneyPlus;
        }
        System.out.println("Итоговый счёт:" + moneyFinish);
    }
}
