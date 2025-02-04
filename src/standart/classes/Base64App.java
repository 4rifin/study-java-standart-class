package standart.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Hello World! Arifin";
        String encode64= Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encode64);

        byte[] bytes = Base64.getDecoder().decode(encode64);
        String result = new String(bytes);
        System.out.println(result);
    }
}
