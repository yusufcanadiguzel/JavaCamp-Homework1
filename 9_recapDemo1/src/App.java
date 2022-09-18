import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();

        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        int number3 = random.nextInt(100);

        int result = number1;

        if (number2 > result) {
            result = number2;
        } 

        if (number3 > result) {
            result = number3;
        }

        System.out.println("Sayı 1 : " + number1);
        System.out.println("Sayı 2 : " + number2);
        System.out.println("Sayı 3 : " + number3);

        System.out.println("En büyük sayı : " + result);

    }
}
