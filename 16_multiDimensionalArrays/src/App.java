public class App {
    public static void main(String[] args) throws Exception {

        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int i = 0; i < numbers[0].length; i++) {
            
            for (int j = 0; j < numbers[1].length; j++) {
                System.out.println(numbers[i][j]);
            }

            System.out.println("-----------------------------------");
        }
    }
}
