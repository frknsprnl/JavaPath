public class ArrayHarmonic {
    public static void main(String[] args) {
        double[] list = {15, 6, 7, 12, 7, 9 , 3};
        double harmonicSum = 0.0;
        for (int i = 0; i < list.length; i++){
            harmonicSum = harmonicSum + (1 / list [i]);
        }

        double harmonicMean = list.length / harmonicSum;
        System.out.println("Harmonic Mean is " + String.format("%.4f", harmonicMean) );
    }
}
