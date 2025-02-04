package standart.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String value= "arifin";
        StringTokenizer st = new StringTokenizer(value," ");
        while (st.hasMoreTokens()) {
            String result = st.nextToken();
            System.out.println(result);
        }

    }
}
