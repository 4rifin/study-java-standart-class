package standart.classes;

import java.math.BigDecimal;

public class BigNumberApp {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1000000000000000000");
        BigDecimal b = new BigDecimal("1000000000000000000");
        BigDecimal result = a.add(b);
        System.out.println(result);
;    }
}
