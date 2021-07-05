/*

Второй максимум

Последовательность состоит из различных натуральных чисел и завершается числом 0. Определите значение второго по величине элемента в этой последовательности.

Числа, следующие за числом 0, считывать не нужно.
Входные данные

Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит). Гарантируется, что будет введено хотя бы 2 числа.
Выходные данные

Выведите ответ на задачу.

Sample Input:

2 3 4 5 8 7 4 0

Sample Output:

7

*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int d = -1;
        d = sc.nextInt();
        while (d != 0) {
            list.add(d);
            d = sc.nextInt();
        }
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        Arrays.sort(arr);
        System.out.println(""+arr[arr.length-2]);
    }
}
















