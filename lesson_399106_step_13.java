/*


Високосный год. По данному году определите, является ли он високосным. Если забыли, какой год называют високосным, то вот вам ссылка: високосный год

Если год Високосный, то выведите "Yes", если же нет, то выведете "No"

Sample Input:

1993

Sample Output:

No

*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if ((y % 4 != 0) || (y % 100 == 0) && (y % 400 != 0)){
            System.out.println("No");
        }

         else {

            System.out.println("Yes");
        }
    }
}