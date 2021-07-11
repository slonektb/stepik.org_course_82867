/*

Подсчёт без учёта регистра

Вводится строка, найдите, сколько раз в ней встречается буква "f". Подсчитайте количество вхождений только "маленькой буквы".

Sample Input:

Good morning my dear friend. This is fish.

Sample Output:

2

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0;i < str.length();i++) {
            if ("f".equals(str.substring(i,i+1))) {
                count++;
            }
        }
        System.out.println(""+count);
    }
}
