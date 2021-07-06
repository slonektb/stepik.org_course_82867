/*

Поменяться местами

Дан список (сначала количество элементов, потом сами элементы). Потом водятся два числа: a и b. Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран построчно. Гарантируется, что а и b не выходят за границы размеров массива.

Sample Input:

5
12
78
45
378
12
2
4

Sample Output:

12
78
12
378
45

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int buf = arr[a];
        arr[a] = arr[b];
        arr[b] = buf;

        for (int i = 0;i < n;i++) {
            System.out.println("" + arr[i]);
        }
    }
}







                       
                    
                       















