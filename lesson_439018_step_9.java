/*

Письменные принадлежности 2

Дополните класс WritingMaterials. У класса WritingMaterials должны быть следующие конструкторы:

    Позволяющий создать предмет с его названием и цветом.
    Позволяющий создать предмет с его названием и ценой. При этом в цвете окажется значение "No Color".
    Позволяющий создать предмет с его ценой, длиной и способностью рисовать. При этом в цвете окажется значение "No Color", а в названии - "No Name".
    Позволяющий создать предмет со всеми его свойствами в том же порядке, который указан на предыдущем слайде.

 Можете проверить свой класс, запустив его с этим кодом:

::java11
class Main{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.display();
        ruler.draw();

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.draw = true;
        wm2.display();
        wm2.draw();
    }
}


*/
public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;

    WritingMaterials (String n, String c) {
        name = n;
        color = c;
    }
    WritingMaterials (String n, int p) {
        name = n;
        price = p;
        color = "No Color";
    }
    WritingMaterials (int p, double l, boolean d) {
        name = "No Name";
        price = p;
        length = l;
        draw = d;
        color = "No Color";
    }
    WritingMaterials (String n, String c, int p, double l, boolean d) {
        name = n;
        price = p;
        length = l;
        draw = d;
        color = c;
    }

    public void display () {
        System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + ( (draw)? "Да":"Нет" ) + ".");
    }
    public void replace_rod(String c) {
        this.color = c;
    }
    public void priceUp(int p) {
        this.price = this.price + p;
    }
    public void priceDown(int p) {
        this.price = this.price - p;
    }
    public void draw() {
        if (this.draw) {
            System.out.println(this.name + " провёл линию. Её цвет - " + this.color + ".");
        } else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }
}
