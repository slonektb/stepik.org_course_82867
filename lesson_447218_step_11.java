/*

Пронумерованные письменные принадлежности

Добавьте автоматическую нумерацию создания всех письменных принадлежностей и наследников. Используйте при этом статическое поле. Так же, для удобства, сгенерируйте классу WritingMaterials  метод toString(), который выводил бы подробную информацию о предмете (данные по всем полям, включая номер). Вывод номера в метод display() не добавляйте.

*/

public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;
    static String description;
    private int id;
    private static int counter = 1;

    {
        name = "ХЗ";
        color = "серобуромалиновый";
        description = "This is WritingMaterials";
    }

    WritingMaterials (String n, String c) {
        name = n;
        color = c;
        id = counter++;
    }
    WritingMaterials (String n, int p) {
        name = n;
        price = p;
        color = "No Color";
        id = counter++;
    }
    WritingMaterials (int p, double l, boolean d) {
        name = "No Name";
        price = p;
        length = l;
        draw = d;
        color = "No Color";
        id = counter++;
    }
    WritingMaterials (String n, String c, int p, double l, boolean d) {
        name = n;
        price = p;
        length = l;
        draw = d;
        color = c;
        id = counter++;
    }

    public WritingMaterials() {
        id = counter++;
    }

    static void setDescription (String s) {
        description = s;
    }

    @Override
    public String toString() {
        return "id: " +id + ", Имя: " + name + ", Длина: " + length + ", цвет: " + color;
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
