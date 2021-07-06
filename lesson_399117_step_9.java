/*

Максимальная сумма

Дан зубчатый двумерный массив. необходимо определить номер строки с максимальной суммой и эту саму максимальную сумму и саму строку, которая даёт эту сумму.
Входные данные:

Вводится число n - количество строк зубчатого массива. Затем информация вводится следующими блоками: число k - количество элементов в строке и потом k элементов.
Выходные данные:

Выведите на экран номер строки с максимальной суммой и сумму на разных строках. На следующей строчке выведите саму строку, которая даёт эту сумму.

Sample Input:

4
3
1 8 9
5
1 -2 3 6 4
6 
1 1 1 1 1 1
3 
-1 2 5

Sample Output:

1
18
1 8 9 

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int idMax = 0;
        int sumMax = -1000;
        int sum = 0;
        int[][] arrAB = new int[n][];
        for (int i = 0; i < n;i++) {
            k = sc.nextInt();
            arrAB[i] = new int[k];
            sum = 0;
            for (int j = 0;j < k; j++) {
                arrAB[i][j] = sc.nextInt();
                sum = sum + arrAB[i][j];
            }
            if (sumMax < sum) {
                sumMax = sum;
                idMax = i;
            }
        }



        //пример вывода
        System.out.println("" + (idMax+1));
        System.out.println("" + sumMax);
        for (int j = 0; j<arrAB[idMax].length; j++) {//length
            System.out.print(arrAB[idMax][j]+" ");
        }
        System.out.println();
    }
}