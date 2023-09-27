public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 98; // кг
        double height = 1.87; // м

        int index = service.calculate(weight, height);

        System.out.println(index);
    }
}