/*

Следующее четное

Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы. 
Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.

Sample Input 1:

5

Sample Output 1:

6

Sample Input 2:

8

Sample Output 2:

10

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("" + (a + 2 - (a % 2)));
    }
}