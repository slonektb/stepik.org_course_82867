/*

Сортировка массива

Дан массив, вам необходимо написать функцию, которая ничего не возвращает, но меняет сам массив, а именно: сортирует его по убыванию. Содержание функции main менять запрещено.

Sample Input:

5
3 7 2 4 1

Sample Output:

7 4 3 2 1

*/

import java.util.Scanner;
import java.util.Arrays;
class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        sort(mas);
        for(int i: mas)
            System.out.print(i + " ");
    }
    static void sort (int[] array) {
        Arrays.sort(array);

        // reverse the array, just like dumping the array!
        // swap(1st, 1st-last) <= 1st: 0, 1st-last: nums.length - 1
        // swap(2nd, 2nd-last) <= 2nd: i++,  2nd-last: j--
        // swap(3rd, 3rd-last) <= 3rd: i++,  3rd-last: j--
        //
        for (int i = 0, j = array.length - 1, tmp; i < j; i++, j--) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}