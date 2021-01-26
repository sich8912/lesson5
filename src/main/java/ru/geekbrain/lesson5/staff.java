package ru.geekbrain.lesson5;

public class staff {

    private String fio;
    private String position;
    private String email;
    private String tel;
    private int zp;
    private int age;

    public staff(String fio, String position, String email, String tel, int zp, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.zp = zp;
        this.age = age;
    }

    public void staffInfo() {
        System.out.println("Сотрудник- " + fio + "; " + position + "; " + email + "; " + tel + "; " + zp + "; " + age);
    }

    public String getFio() {
        return fio;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getTel() {
        return tel;
    }
    public int getZp() {
        return zp;
    }
    public int getAge() {
        return age;
    }


}
