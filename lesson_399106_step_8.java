/*

Три равные строки

С клавиатуры построчно вводятся три строки. Необходимо определить, все ли он равны. Если да, то вывести "Yes", в противном случае - "No".

Sample Input 1:

String
String
String

Sample Output 1:

Yes

Sample Input 2:

String
String
Not String

Sample Output 2:

No

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        if (s1.equals(s2) && s2.equals(s3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}