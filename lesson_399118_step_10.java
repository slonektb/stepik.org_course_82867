/*

Метание молота 2

В метании молота состязается n спортcменов. Каждый из них сделал m бросков. Победитель определяется по лучшему результату. Определите количество участников, а так же самих участников состязаний, которые разделили первое место, то есть определите количество строк в массиве, которые содержат значение, равное наибольшему.
Входные данные

Программа получает на вход два числа n и m,  являющиеся числом строк и столбцов в массиве. Далее во входном потоке идет n  строк по m чисел, являющихся элементами массива.
Выходные данные

Сначала программа выводит количество спортсменов, показавших наилучший результат, затем – их номера в порядке возрастания. Не забудьте, что  строки (спортсмены)  нумеруются с 0.

Sample Input 1:

3 3
3 1 2
1 3 4
3 3 3

Sample Output 1:

1
1 

Sample Input 2:

3 5
3 1 2 4 2
1 3 4 1 3
3 3 3 3 3

Sample Output 2:

2
0 1 

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int count = 0;
        int max = 0;
        String res = "";
        boolean f = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == max) {
                    f = true;
                }
            }
            count = (f) ? count +1: count;
            res = (f) ? res + i + " ": res;
            f = false;

        }
        System.out.println("" + count);
        System.out.println(res);
    }
}