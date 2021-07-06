/*

Кубы 2

Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от a до b. Затем вводится число n и n чисел после него. Используя данные из массива найдите кубы этих. Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error".

Sample Input:

5
10
4
5
8
-1
5

Sample Output:

125
512
Error
125

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = b - a +1;
        int ma = a;
        int[] arrAB = new int[k];
        for (int i = 0; i < k;i++) {
            arrAB[i] =(int) Math.pow(ma,3);
            ma++;
        }

        int n = sc.nextInt();
        int[] arrN = new int[n];

        for (int i = 0;i < n;i++) {
            arrN[i] = sc.nextInt();
        }

        for (int i = 0;i < n;i++) {
            if ((arrN[i] >=a) && (arrN[i] <= b)) {
                System.out.println("" + arrAB[arrN[i]-a]);
            } else {
                System.out.println("Error");
            }

        }
    }
}
















                       
                    
                       















