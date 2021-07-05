/*

Треугольник

Вводятся три целых числа. Необходимо определить, существует ли треугольник с такими сторонами. В ответ выведите "Yes"/"No".

Sample Input 1:

3 4 5

Sample Output 1:

Yes

Sample Input 2:

2 2 5

Sample Output 2:

No

*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(((c >= (a + b)) || (b >= (a + c)) || (a >= (b + c))) ? "No" : "Yes");
    }
}