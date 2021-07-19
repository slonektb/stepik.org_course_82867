/*

Письменные принадлежности 1

Опишите класс WritingMaterials. У класса WritingMaterials должны быть свойства:

    name - название предмета (String)
    color - цвет, которым он пишет (String).
    price - его цена (int)
    length - его длина (double)
    draw - ответ на вопрос, умеет ли эта письменная принадлежность писать? (boolean)

У предмета должны быть методы:

    display()  - выводит информацию о предмете в формате:

    "Название: <его название>, Цвет: <цвет>, Длина: <его длина>, Цена: <его цена>, Умеет рисовать: <Да/Нет>.
    replace_rod(String) - принимает новый цвет стержня
    priceUp(int) - принимает на вход изменение цены. Увеличивает цену на это число.
    priceDown(int) - принимает на вход изменение цены. Уменьшает цену на это число.
    draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линию. Её цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.".

 Можете проверить свой класс, запустив его с этим кодом:

class Main{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.name = "ручка";
        pen.color = "Красный";
        pen.length = 15.6;
        pen.price = 145;
        pen.draw = true;
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials();
        ruler.name = "линейка";
        ruler.length = 30.0;
        ruler.price = 25;
        ruler.draw = false;
        ruler.display();
        ruler.draw();
        ruler.priceUp(13);
        ruler.display();
    }
}

*/

public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;

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

