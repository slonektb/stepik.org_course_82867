/*

Палиндром

Вводится строка. определите, является ли она палиндромом. Напоминаю,  что палиндром - это слово/строка, которая читается одинаково слева направо и справа налево. В ответ выведите YES/NO.

Sample Input 1:

Тот

Sample Output 1:

YES

Sample Input 2:

А роза упала на лапу азора

Sample Output 2:

YES

Sample Input 3:

Аргентина манит негра

Sample Output 3:

YES

Sample Input 4:

sffgadhgcs v

Sample Output 4:

NO

Sample Input 5:

ttt 4t tt

Sample Output 5:

YES

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strABC = "";
        String strCBA = "";
        char temp;
        for (int i = 0;i < str.length();i++) {
            temp = str.charAt(i);

            if (temp != ' ') {
                strABC = strABC + temp;
                strCBA = temp + strCBA;
            }
        }
        System.out.println((strABC.equalsIgnoreCase(strCBA)) ? "YES":"NO");
    }
}