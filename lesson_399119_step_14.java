/*

IP-адрес

Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. В следующих трех строках показаны три правильных IP-адреса:

127.0.0.0
192.168.0.01
255.00.255.255
Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.

Входные данные

На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.
Выходные данные

Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

Sample Input 1:

192.168.1.2

Sample Output 1:

YES

Sample Input 2:

192.11.690.0

Sample Output 2:

NO

Sample Input 3:

67.67.67

Sample Output 3:

NO

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orig = sc.nextLine();

        String[] sByts = orig.split("\\.");

        boolean f = false;
        f = (sByts.length == 4) ? true:false;
        int bytes = -1;
        if (f) {
            for (int i = 0;i < 4; i++) {
                try {
                    bytes = Integer.parseInt(sByts[i]);
                } catch (NumberFormatException e) {
                    bytes = -1;
                }
                f = ((bytes>=0) && (bytes<=255)) ? true:false;
                if (!f) break;
            }
        }

        System.out.println((f)? "YES":"NO");
    }
}