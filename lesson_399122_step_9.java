/*

Встречалось ли число раньше?

Вводится число n, затем n целых чисел. Для каждого числа выведите слово YES (в отдельной строке), если это число ранее встречалось в последовательности или NO,  если не встречалось.

Sample Input:

6
1 2 3 2 3 4

Sample Output:

NO
NO
NO
YES
YES
NO

*/


import java.util.HashSet;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < n;i++) {
            boolean isAdded = numbers.add(sc.nextInt());
            System.out.println ((isAdded)?"NO":"YES");
        }

    }
}
