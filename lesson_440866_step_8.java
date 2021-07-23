/*

Перегруженные письменные принадлежности

Немного измените и перегрузите метод draw() в классе WritingMaterials (из предыдущего урока) таким образом:

    draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: 1. Их цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". (почти как и было)
    draw(int n) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: <n>. Их цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". 
    draw(String color) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: 1. Их цвет - <color>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". 
    draw(String color, int n) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: <n>. Их цвет - <color>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". 

Можете проверить свой класс, запустив его с этим кодом:

class Main{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);

        WritingMaterials ruler = new WritingMaterials("линека", 34);
        ruler.setDraw(false);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);
        
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
            System.out.println(this.name + " провёл линиЙ: 1. Их цвет - " + this.color + ".");
        } else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }

    public void draw(int n) {
        if (this.draw) {
            System.out.println(this.name + " провёл линиЙ: " + n + ". Их цвет - " + this.color + ".");
        } else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }
    public void draw(String color) {
        if (this.draw) {
            System.out.println(this.name + " провёл линиЙ: 1. Их цвет - " + color + ".");
        } else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }
    public void draw(String color, int n) {
        if (this.draw) {
            System.out.println(this.name + " провёл линиЙ: " + n + ". Их цвет - " + color + ".");
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
