package ru.geekbrain.lesson5;

public class lesson5 {
    public static void main(String[] args) {

        int ageMin = 40;
        
        staff[] staff = {
                new staff("ivan", "proger", "ivan1@mail.ru", "89991234568", 30000, 30),
                new staff("viktor", "admin", "ivan2@mail.ru", "89991234567", 30000, 45),
                new staff("kolia", "tester", "ivan3@mail.ru", "89991234560", 30000, 50),
                new staff("petia", "sysadmin", "ivan4@mail.ru", "89991234561", 30000, 20),
                new staff("vasia", "proger", "ivan5@mail.ru", "89991234564", 30000, 35)
        };

        for (int i = 0; i < staff.length; i++) {

            if (staff[i].getAge() > ageMin) {
                staff[i].staffInfo();
            }
        }
    }
}
