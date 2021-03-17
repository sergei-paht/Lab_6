import java.util.Arrays;
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        int c = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {  //создаем матрицу
            for (int j = 0; j < array.length; j++) {
                array[i][j] = c + (int) (Math.random() * 100);
            }
        }
        System.out.println("Исходня матрица:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));// выводим исходную матрицу
        }
        for (int q = 0; q < n; q++) {
            int element = array[q][q];
            arr1[q] = element;
            System.out.printf("%5d", arr1[q]);//выводим главную диагональ
        }
        for (int left = 0; left < arr1.length; left++) {  //1 часть метода
            int minInd = left;
            for (int i = left; i < arr1.length; i++) {
                if (arr1[i] < arr1[minInd]) {
                    minInd = i;
                }
            }
            swap(arr1, left, minInd);
        }
        for (int p = 0; p < n; p++){   // создаем конечную матрицу
            array[p][p] = arr1[p];
        }
        System.out.println(" - главная диагональ");
        System.out.println("Отсортированная диагональ:");
        for (int b = 0; b < n; b++) {
            System.out.println(Arrays.toString(array[b]));
        }
    }
    static void swap (int[]array, int left, int right){ // 2 часть метода
        if (left != right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
    }
}