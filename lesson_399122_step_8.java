/*

Количество уникальных чисел

Вводится число n, затем n целых чисел. Определите, сколько различных чисел было введено.

Sample Input:

7
1 1 2 2 2 3 3

Sample Output:

3

*/


import java.util.HashSet;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < n;i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("" + numbers.size());
    }
}
