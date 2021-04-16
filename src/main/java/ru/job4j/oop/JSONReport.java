package ru.job4j.oop;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return super.generate("name : " + name, "body : " +  body);
    }

    public static void main(String[] args) {

        JSONReport jsonReport = new JSONReport();
        String text = jsonReport.generate("Report's name,", "Report's body");
        System.out.println(text);
    }
}
