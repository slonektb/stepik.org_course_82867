/*

Финальные животные

Запретите наследование от класса Fish, переопределение метода rename у класса Animal и изменение свойства description.
*/

final class Fish extends Animal{
    String squama;
    boolean upStreamSwim;

    {
        type = "Рыба";
        name = "NoName";
    }

    Fish() {
        super("Рыба", "No Name");
    }

    public void bul_bul () {
        System.out.println("Bul-bul");
    }

    public void setSquama(String s) {
        squama = s;
    }

    public void setUpStreamSwim(boolean b) {
        upStreamSwim = b;
    }

    public String getSquama() {
        return this.squama;
    }

    public boolean isUpStreamSwim() {
        return this.upStreamSwim;
    }

    @Override
    public void rename (String s) {
        name = s;
    }
    
    public void setDescription (String s) {
        description = s;
    }
    
    @Override
    public void display () {
        System.out.println("I am Fish");
        super.display();
        System.out.println("У меня чешуя " + this.squama);
        System.out.println("Я плаваю против течения? - " + ((upStreamSwim)?"Да":"Нет"));
    }

}
