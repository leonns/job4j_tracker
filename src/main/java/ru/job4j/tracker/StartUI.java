package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
       /* Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        LocalDateTime currentDateTimeFormat = item.getCreated();
        String current = currentDateTimeFormat.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + current);*/

        Item item = new Item(1, "Item 1");
        Tracker tracker = new Tracker();
        tracker.add(item);
        System.out.println(tracker.findById(1));
    }

}
