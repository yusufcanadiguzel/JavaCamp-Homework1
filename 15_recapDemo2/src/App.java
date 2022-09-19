public class App {
    public static void main(String[] args) throws Exception {

        double[] numbers = { 1.2, 3.4, 5.6, 7.8, 9.0 };

        double total = 0;
        double result = 0;

        for (int i = 0, x = numbers.length; i < x; i++) {
            System.out.println(numbers[i]);

            total += numbers[i];

            if (numbers[i] > result) {
                result = numbers[i];
            }
        }

        System.out.println("Toplam : " + total);
        System.out.println("En büyük sayı : " + result);

    }
}
