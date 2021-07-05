/*

Две равные строки

С клавиатуры построчно вводятся три строки. Если среди них есть ровно две равные строки то вывести "Yes", в противном случае - "No".

Sample Input 1:

String
Hello!
String

Sample Output 1:

Yes

Sample Input 2:

hello
String
Not String

Sample Output 2:

No

*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        if ((a.equals(b)) && (b.equals(c))) {
            System.out.println("No");
        } else if ((a.equals(b)) || (b.equalsIgnoreCase(c)) || (c.equals(a))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}