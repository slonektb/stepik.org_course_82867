/*

Переопределённые письменные принадлежности

Переопределите у созданных вами классов наследников (Pen, Ruler и Divider.) метод display. Перед выводом стандартной информации добавьте в начало вывода фразу "This is <название класса>". Так же добавьте в метод display информацию о новых свойствах этого класса. 

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

    @Override
    public void display () {
        System.out.println("This is Pen");
        super.display();
        System.out.println("Количество цветов: " + countColor + ". Автоматическая?: " + ((auto)? "Да":"Нет"));
    }
}
public class Ruler extends WritingMaterials{
    double length;
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

    public void setLength (double i) {
        length = i;
    }

    @Override
    public double getLength () {
        return length;
    }

    @Override
    public void display () {
        System.out.println("This is Ruler ");
        super.display();
        System.out.println("Длинна: " + length + ". Из дерева?: " +  ((wood)?"Да":"Нет"));
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

    @Override
    public void display () {
        System.out.println("This is Divider");
        super.display();
        System.out.println("Тип: " + dividerType + ". Из металла?: " + ((metal)?"Да":"Нет"));
    }
}
