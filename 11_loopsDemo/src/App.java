public class App {
    public static void main(String[] args) throws Exception {

        // For Loop
        System.out.println("For Loop");

        int count = 10;

        for (int i = 0; i <= count; i += 2) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------- \n");

        // While Loop
        System.out.println("While Loop");

        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("------------------------------------------- \n");

        // Do-While Loop
        System.out.println("Do-While Loop");

        int number = 10;

        do {
            number++;
            System.out.println(number);
        } while (number <= 10);
        
        System.out.println("------------------------------------------- \n");
    }
}
