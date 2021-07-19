/*

Письменные принадлежности 3

Добавьте инкапсуляцию в класс WritingMaterials. Для каждого свойства в классе WritingMaterials должны быть свои методы get/set (для булевых значений не get, a is).

 Можете проверить свой класс, запустив его с этим кодом:

class Main{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isDraw());
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

    public WritingMaterials() {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
}
