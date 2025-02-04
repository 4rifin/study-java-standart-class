package standart.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();

        System.out.println(intValue);
        System.out.println(doubleValue);

        String valueString = "1000";

        Integer valueInt = Integer.parseInt(valueString);
        System.out.println(valueInt);
    }
}
