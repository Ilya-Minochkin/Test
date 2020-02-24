public class Main {
    final static int N = 5;

    public static void main(String[] args) {

        double[][] array = new double[N][N];
        double avg;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++){
                array[i][j] = Math.random() * 100;
            }
        }
        showMatrix(array);
      //  System system = new System();
        avg = getAverage(array);
        System.out.println("Average = " + avg);
        System.out.printf("Close to average = %.10f\n", getCloserToAverage(array, avg));
        Double dbl = new Double(2.3);
        Integer integer = new Integer(N);
        System.out.println(array.toString());
        System.out.println(Integer.toHexString(array.hashCode()));
    }



    static void showMatrix(double[][] array){
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static double getAverage(double[][] array){
        double avg = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                avg += array[i][j];
            }
        }
        return avg/(N*N);
    }


    static double getCloserToAverage(double[][] array, double average){
        int k = 0, l = 0;
        double diff = Double.POSITIVE_INFINITY;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (Math.abs(average - array[i][j]) < diff){
                    diff = Math.abs(average - array[i][j]);
                    k = i;
                    l = j;
                }
            }
        }
        return array[k][l];
    }
}
