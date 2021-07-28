/*

Интерфейсы зданий

Создайте интерфейсы LivingHouse и SocialHouse (жилой дом и общественное здание). Подумайте, какие методы должны требовать к реализации эти интерфейсы. Опишите 2-3 таких метода. 
Добавьте нужные интерфейсы к классам наследникам из предыдущей задачи и реализуйте необходимые методы.

*/

public interface LivingHouse {
    int getYearOfConstruction();
    int getCountApartment();
}

public interface SocialHouse {
    int getYearOfConstruction();
    String getArchitectName();
    boolean isCultural();
}

public class Library extends Building implements SocialHouse{
    private String type;
    private int countBooks;

    @Override
    public String toString () {
        return "Библиотека " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество книг: " + countBooks + ", для аудитории: " + type + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setCountBooks (int n) {
        this.countBooks = n;
    }

    @Override
    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    @Override
    public String getArchitectName() {
        return architectName;
    }

    @Override
    public boolean isCultural() {
        return isCultural;
    }
}

public class House extends Building implements LivingHouse{
    private int countApartment;
    private boolean concierge;

    @Override
    public String toString () {
        return "Жилой дом " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество квартир: " + countApartment + ", консъерж: " + ((concierge)?"есть":"отсутствует") + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setConcierge(boolean b) {
        concierge = b;
    }

    public void setCountApartment(int countApartment) {
        this.countApartment = countApartment;
    }

    @Override
    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    @Override
    public int getCountApartment() {
        return countApartment;
    }
}

public class PoliceDepartment extends Building implements SocialHouse{
    private String district;
    private int countOfPolicement;

    @Override
    public String toString () {
        return "Полицейский участок " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество полицейских: " + countOfPolicement + ", район: " + district + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCountOfPolicement() {
        return countOfPolicement;
    }

    @Override
    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    @Override
    public String getArchitectName() {
        return architectName;
    }

    @Override
    public boolean isCultural() {
        return isCultural;
    }
}

public class University extends Building implements SocialHouse{
    private String type;
    private int countStudents;

    @Override
    public String toString () {
        return "Университет " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество студентов: " + countStudents + ", направленность: " + type + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCountStudents(int countStudents) {
        this.countStudents = countStudents;
    }

    @Override
    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    @Override
    public String getArchitectName() {
        return architectName;
    }

    @Override
    public boolean isCultural() {
        return isCultural;
    }
}

public class HighRiseBuilding extends Building implements LivingHouse{
    private boolean restorans;
    private int countPenthouse;
    private int countApartment;

    @Override
    public String toString () {
        return "Небоскреб " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество пентхаусов: " + countPenthouse + ", рестораныы в здании: " + ((restorans)?"есть":"отсутствуют") + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setCountPenthouse(int countPenthouse) {
        this.countPenthouse = countPenthouse;
    }

    public void setRestorans(boolean restorans) {
        this.restorans = restorans;
    }

    public void setCountApartment(int countApartment) {
        this.countApartment = countApartment;
    }

    @Override
    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    @Override
    public int getCountApartment() {
        return countApartment;
    }
}


