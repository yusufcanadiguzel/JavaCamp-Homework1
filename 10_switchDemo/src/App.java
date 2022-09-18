public class App {
    public static void main(String[] args) throws Exception {
        
        int star = 4;

        switch (star) {
            case 5:
                System.out.println("Çok İyi!");
                break;
            case 4:
                System.out.println("İyi!");
                break;
            case 3:
                System.out.println("Orta!");
                break;
            case 2:
                System.out.println("İdare Eder!");
                break;
            case 1:
                System.out.println("Kötü!");
                break;
            default:
                System.out.println("Lütfen puanlama yapınız.");
                break;
        }
    }
}
