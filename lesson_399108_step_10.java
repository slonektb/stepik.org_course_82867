/*

Монотонное неубывание

Напишите функцию monneub,  которая принимает как аргумент массив целых чисел и находит длину максимального монотонно не убывающего промежутка и выведите её на экран. Содержание функции main менять запрещено.

Sample Input:

10
1 2 3 1 3 4 5 1 1 3

Sample Output:

4

*/

import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        monneub(mas);
    }

    //разместите свою функцию, например здесь
    static void monneub (int[] arr) {
        int count = 0;
        int maxC = 0;
        for (int i = 0;i < arr.length-1;i++) {
            count++;
            if (arr[i] > arr[i+1]) {
                if (maxC < count) maxC = count;
                count = 0;
            } else if (i == arr.length-2) {
                count++;
            }
            if (maxC < count) maxC = count;
        }
        
        System.out.println("" + maxC);
    }
}