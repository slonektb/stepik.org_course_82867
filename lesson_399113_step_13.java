/*

Двоичная запись

Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.

Sample Input:

6

Sample Output:

011

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while(a > 0) {
            if(a%2 == 0) result.append("0");
            else result.append("1");
            a = a/2;
        }
        System.out.println(result);
    }
}












