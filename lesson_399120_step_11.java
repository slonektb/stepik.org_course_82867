/*

Второклассная задача

У второклассников очень популярна следующая задача:

101 = 1

8181515 = 4

1111112 = 0

8888888 = 14

1010101 = 3

7000007 = ?

Преподавателю программирования в некоем Центре для одаренных детей так понравилась эта задачка, что он решил именно ее использовать для проверки знаний математики 2-го класса у своих учеников.

Пусть первое число x, а соответствующее ему n
Входные данные

Единственное неотрицательное число x, не превышающее 101001.
Выходные данные

Выведите n.

Sample Input 1:

1010101

Sample Output 1:

3

Sample Input 2:

8888888

Sample Output 2:

14

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        char temp;
        char[] chars = str.toCharArray();
        for (int i = 0;i < chars.length;i++) {
            temp = chars[i];
            if (temp == '8') {
                count = count + 2;
            } else if (temp == '0' || temp == '6' || temp == '9') {
                count++;
            }
        }
        System.out.println("" + count);
    }
}