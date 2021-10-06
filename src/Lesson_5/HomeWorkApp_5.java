package Lesson_5;

public class HomeWorkApp_5 {

    public static void main(String[] args) {
        Сотрудник[] persArr = new Сотрудник[5];
        persArr[0] = new Сотрудник("Ivanov Ivan", "Engineer", "mmm@mail.ru", "4521325", 56, 42);
        persArr[1] = new Сотрудник("Petrov Oleg", "Engineer", "kkk@mail.ru", "8522105", 85, 55);
        persArr[2] = new Сотрудник("Petrova Elena", "Engineer", "ooo@mail.ru", "1254174", 55, 20);
        persArr[3] = new Сотрудник("Dorofeev Alex", "Engineer", "jjj@mail.ru", "5555174", 55, 40);
        persArr[4] = new Сотрудник("Norov Vlad", "Engineer", "ddd@mail.ru", "1254174", 75, 35);


        for (int i = 0; i < 5; i++) {
            Сотрудник person40 = persArr[i];
            if (person40.getВозраст() > 40) {
                person40.getInfo();
            }
        }
    }
}
