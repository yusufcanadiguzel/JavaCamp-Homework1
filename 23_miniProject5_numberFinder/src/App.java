public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numbers = {1,3,5,6,8,0,7,9};

        int key = 5;

        for (int number : numbers) {

            if (number == key) {
                System.out.println("Sayı mevcut.");
                return;
            }
            
        }

        System.out.println("Sayı mevcut değil.");
    
    }
}
