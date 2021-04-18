package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Ivanov");
        student.setGroup("computer science");
        student.setAdmission("13.06.2010");

        System.out.println("student " + student.getFullName());
        System.out.println("group " + student.getGroup());
        System.out.println("admission " + student.getAdmission());
    }

}
