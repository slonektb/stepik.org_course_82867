/*

МКАД

Длина Московской кольцевой автомобильной дороги —109 километров. Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час. На какой отметке он остановится через t часов?

Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном направлении по МКАД, если же значение v<0, то в отрицательном.

Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.

Sample Input 1:

60
2

Sample Output 1:

11

Sample Input 2:

-1
1

Sample Output 2:

108

*/
import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();

        int sum = 0;

        if (v>0) {
            sum = (v*t)%109;
        } else if (v<0) {
            sum = 109 - Math.abs((v*t)%109);
        }

        System.out.println("" + sum);
    }
}