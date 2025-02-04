package standart.classes;

import java.util.Objects;

public class ObjectsApp {
    public static class Data {
        private String Data;

        public Data(String data) {
            Data = data;
        }

        public String getData() {
            return Data;
        }

        public void setData(String data) {
            Data = data;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Data data = (Data) object;
            return Objects.equals(Data, data.Data);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(Data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "Data='" + Data + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        execute(null);

    }

    public static void execute(Data data) {
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));


    }
}
