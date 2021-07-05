/*

Большее из 3

Вводится 3 целых числа, выведите большее из них

Sample Input:

1 2 3

Sample Output:

3

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();

        int max = h;

        if (max < m) {
            max = m;
        } 
        if (max < x) {
            max = x;
        }
        System.out.println(max);
        
    }
}