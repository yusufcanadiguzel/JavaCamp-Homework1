public class App {
    public static void main(String[] args) throws Exception {
        
        char[] vowels = {'e', 'E', 'i', 'I', 'o', 'O', 'a', 'A', 'u', 'U'};

        char letter = 'e';

        for (char character : vowels) {
            if (letter == character) {
                System.out.println("Sesli harf.");
                return;
            }
        }

        System.out.println("Sesli harf değil.");
    }
}
