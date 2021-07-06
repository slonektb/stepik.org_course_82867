/*

Сумма массивов

Вводится число n. Затем вводится 2 раза по n действительных чисел - два массива. Вывести на экран их сумму.

Sample Input:

5
-3 2.5 3.47 86 1.2
1 -2 5 -12.5 4

Sample Output:

-2.0
0.5
8.47
73.5
5.2

*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arrA = new double[n];
        double[] arrB = new double[n];
        for (int i = 0; i < n;i++) {
            arrA[i] = sc.nextDouble();
        }
        for (int i = 0; i < n;i++) {
            arrB[i] = sc.nextDouble();
        }

        for (int i = 0;i < n;i++) {
            System.out.println("" + (arrA[i]+arrB[i]));
        }
    }
}
















                       
                    
                       















