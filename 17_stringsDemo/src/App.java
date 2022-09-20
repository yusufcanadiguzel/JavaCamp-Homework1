public class App {
    public static void main(String[] args) throws Exception {

        String message = "Hello World?";

        System.out.println(message.concat(" Hellooooo?"));

        System.out.println("Eleman sayısı : " + message.length());

        System.out.println("9. indexteki harf : " + message.charAt(9));

        System.out.println(message.startsWith("H"));
        System.out.println(message.endsWith("."));

        char[] question = new char[12];
        message.getChars(0, 5, question, 0);
        System.out.println(question);

        System.out.println(message.indexOf("o"));
        System.out.println(message.lastIndexOf("l"));

        String newMessage = message.replaceAll(" ", "-");
        System.out.println(newMessage);

        System.out.println(message.substring(2));
        System.out.println(message.substring(2, 5));

        for (String letter : message.split(" ")) {
            System.out.println(letter);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

    }
}
