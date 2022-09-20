public class App {
    public static void main(String[] args) throws Exception {

        int number = 1;

        if (number == 1 || number == 2) {
            System.out.println("Sayı asaldır.");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı.");
            return;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                System.out.println("Sayı asal değildir.");
                return;
            }

        }

        System.out.println("Sayı asaldır");

    }
}
