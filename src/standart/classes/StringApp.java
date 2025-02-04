package standart.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Arifin";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("e"));

        String[] names = name.split("");
        for (String nm : names){
            System.out.println(nm);
        }

    }
}
