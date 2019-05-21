import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Task3 ts = new Task3();
        double array[][] = ts.arrayInit(5, 5, 15, 89);
        System.out.println("max = " + ts.maximum(array));
        System.out.println("min = " + ts.minimum(array));
        System.out.println("arifmetic mean = " + ts.arifmeticMean(array));
        System.out.println("geometric mean = " + ts.geometricMean(array));
        System.out.println("first local min = " + ts.localMin(array));
        System.out.println("transp array:");
        ts.transp(array);
    }

    public double[][] arrayInit(int rows, int columns, int ot, int ddo) {
        double array[][] = new double[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(ddo - ot + 1) + ot;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "; ");
            }
            System.out.println(" ");
        }
        return array;
    }

    public double minimum(double[][] array){
        double min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public double maximum(double[][] a) {
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public double arifmeticMean(double array[][]) {
        double average = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                k++;
                average += array[i][j];
            }
        }
        return average / k;
    }

    public double geometricMean(double array[][]) {
        double mean = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                mean *= array[i][j];
                k++;
            }
        }
        mean = Math.pow(mean, 1 / k);
        return mean;
    }

    public double localMin(double array[][]) {
        double localMin = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j != 0 && j != array[i].length - 1 && i == 0) {
                    if (array[i][j] < array[i][j - 1] & array[i][j] < array[i + 1][j] & array[i][j] < array[i][j + 1]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                } else if (j != 0 && j != array[i].length - 1 && i == array.length - 1) {
                    if (array[i][j] < array[i][j - 1] & array[i][j] < array[i - 1][j] & array[i][j] < array[i][j + 1]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                } else if (i != 0 && i != array.length - 1 && j == 0) {
                    if (array[i][j] < array[i][j + 1] & array[i][j] < array[i - 1][j] & array[i][j] < array[i + 1][j]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                } else if (i != 0 && i != array.length - 1 && j == array[i].length - 1) {
                    if (array[i][j] < array[i + 1][j] & array[i][j] < array[i - 1][j] & array[i][j] < array[i][j - 1]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                } else if (j == 0 && i == 0) {
                    if (array[i][j] < array[i + 1][j] && array[i][j] < array[i][j + 1]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                } else if (j == array[i].length - 1 && i == 0) {
                    if (array[i][j] < array[i + 1][j] && array[i][j] < array[i][j - 1]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                } else if (j == 0 && i == array.length - 1) {
                    if (array[i][j] < array[i - 1][j] && array[i][j] < array[i][j + 1]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                } else if (j == array[i].length - 1 && i == array.length - 1) {
                    if (array[i][j] < array[i - 1][j] && array[i][j] < array[i][j - 1]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                } else if (i != 0 && j != 0 && i != array.length - 1 && j != array[i].length - 1) {
                    if (array[i][j] < array[i - 1][j] && array[i][j] < array[i][j - 1]
                            && array[i][j] < array[i + 1][j] && array[i][j] < array[i][j + 1]) {
                        localMin = array[i][j];
                        i = array.length;
                        break;
                    }
                }
            }
        }
        return localMin;
    }

    public void transp(double[][] array){
        double tmp=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array[i].length; j++) {
                tmp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=tmp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "; ");
            }
            System.out.println(" ");
        }

    }

}
