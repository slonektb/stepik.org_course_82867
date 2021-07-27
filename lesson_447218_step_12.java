/*

Финальные письменные принадлежности

Запретите наследование от класса Ruler, переопределение метода drawCircle у класса Divider и изменение свойства description.

*/

final class Ruler extends WritingMaterials{
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
    final void draw_circle () {System.out.println("Нарисован круг");}

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
    
   
    static void setDescription(String s) {
        description = s;
    }
}
