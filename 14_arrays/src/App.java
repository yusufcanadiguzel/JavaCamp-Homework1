public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numbers = new int[3];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;

        for (int i = 0, x=numbers.length; i < x; i++) {
            System.out.println(numbers[i]);
        }

        String[] names = {"Yusufcan", "Adıgüzel", "Test"};

        for (String name : names) {
            System.out.println(name);
        }
 
    }
}
