package standart.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("inputName : ");
        String name = sc.nextLine();

        System.out.println("hello " + name);
    }
}
