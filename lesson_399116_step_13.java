/*

Переставить соседние

Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.). Если элементов нечетное число, то последний элемент остается на своем месте.
Входные данные

Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные

Выведите ответ на задачу.

Sample Input:

6
4
5
3
4
2
3

Sample Output:

5
4
4
3
3
2

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        if (arr.length%2 != 0) {
            count = arr.length - 1;
        } else {
            count = arr.length;
        }
        int buffer = 0;
        for (int i = 0; i < count; i = i+2) {
            buffer = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = buffer;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}



















                       
                    
                       















