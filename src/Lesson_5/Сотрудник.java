package Lesson_5;

public class Сотрудник {
    private String ФИО;
    private String должность;
    private String email;
    private String телефон;
    private int зарплата;
    private int возраст;


    public Сотрудник(String ФИО, String должность, String email, String телефон, int зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    public void getInfo() {
        System.out.println("ФИО: " + ФИО + "|" + " Должность: " + должность + "|" + " Email: " + email + "|" + " Телефон: " + телефон + "|" + " Зарплата: " + зарплата + "|" + " Возраст: " + возраст);
    }

    public int getВозраст() { return возраст; }
}
