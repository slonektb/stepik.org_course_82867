/*

Подсчёт без учёта регистра

Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. Найдите, сколько раз в тексте встречается введённый символ в любом регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.

Sample Input:

Good morning my dear friend. My fish.
m

Sample Output:

3

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sym = sc.nextLine();
        int count = 0;
        for (int i = 0;i < str.length();i++) {
            if (sym.equalsIgnoreCase(str.substring(i,i+1))) {
                count++;
            }
        }
        System.out.println(""+count);
    }
}