/*

Наследники письменных принадлежностей

Создайте три класса - наследника от класса WritingMaterials (из предыдущего урока): Pen, Ruler и Divider.
Класс Pen:

По умолчанию будем считать, что все ручки умеют рисовать.

У ручек должны быть новые свойства: 

    countColor - количество цветов этой ручки (количество стержней, по умолчанию - 1)
    auto - ответ на вопрос, автоматическая она, или нет.

Добавьте ручкам метод writeMyName, который выводит на экран строку, содержащую ваше имя.
Класс Ruler:

По умолчанию будем считать, что все линейки не умеют рисовать.

У линеек должны быть новые свойства: 

    length - длина линейки
    wood - из дерева ли эта линейка

Добавьте линейкам метод measure, который выводит на экран строку "Сейчас померяем длину".
Класс Divider:

По умолчанию будем считать, что все циркули умеют рисовать.

У циркулей должны быть новые свойства: 

    dividerType - тип циркуля
    metal - сделан ли этот циркуль из металла

Добавьте циркулям метод draw_circle, который выводит на экран строку "Нарисован круг".

Можете проверить свой класс, запустив его с этим кодом:

class Main{
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.display();
        r.setLength(25);
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();
    }
}


*/




public class Pen extends WritingMaterials{
    int countColor;
    boolean auto;

    Pen () {
        super.draw = true;
        countColor = 1;
    }

    public void writeMyName () {System.out.println("Слоняра");}

    public void setCountColor(int i) {countColor = i;}

    public void setAuto(boolean b) {
        auto = b;
    }

    public int getCountColor() {
        return countColor;
    }

    public boolean isAuto() {
        return auto;
    }
}

public class Ruler extends WritingMaterials{
    int length;
    boolean wood;
    Ruler () {
        super.draw = false;
    }

    public void measure () {System.out.println("Сейчас померяем длину");}

    public void setWood(boolean b) {
        wood = b;
    }

    public boolean isWood() {
        return wood;
    }
}

public class Divider extends WritingMaterials{
    String dividerType;
    boolean metal;

    Divider () {
        super.draw = true;
    }
    public void draw_circle () {System.out.println("Нарисован круг");}

    public void setDividerType(String s) {
        dividerType = s;
    }

    public void setMetal(boolean b) {
        metal = b;
    }

    public String getDividerType() {
        return dividerType;
    }

    public boolean isMetal() {
        return metal;
    }
}

