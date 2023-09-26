public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int m = 98; // кг
        double h = 1.87; // м

        int index = service.calculate(m, h);

        System.out.println(index);
    }
}