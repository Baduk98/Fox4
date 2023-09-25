public class BmiService {

    public int calculate(int m, double h) {

        double bmi = m / (h * h);
        int result;
        result = (int) bmi;

        return result;

    }
}
