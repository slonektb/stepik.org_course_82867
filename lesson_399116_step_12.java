/*

Уникальные элементы

Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные

Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные

Выведите ответ на задачу.

Sample Input:

6
1
2
2
3
3
3

Sample Output:

1

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
        int count = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((arr[i] == arr[j]) && ( i != j)) {
                    count++;
                }
            }
            if (count == 1) System.out.println(arr[i]);
            count = 1;
        }
    }
}














                       
                    
                       















