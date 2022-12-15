package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Shop {

    public static void fieldRequest(){
        ArrayList<NoteBook> set = new ArrayList<>();
        set.add(Storage.noteBook1);
        set.add(Storage.noteBook2);
        set.add(Storage.noteBook3);
        set.add(Storage.noteBook4);
        set.add(Storage.noteBook5);
        set.add(Storage.noteBook6);
        set.add(Storage.noteBook7);
        set.add(Storage.noteBook8);
        set.add(Storage.noteBook9);
        set.add(Storage.noteBook10);
        set.add(Storage.noteBook11);
        String[] fields = {"год выпуска", "цвет", "размер экрана в дюймах", "частоту процессора в ГГц", "количество ядер процессора",
                "объем оперативной памяти в МБ", "количество USB-портов", "название операционной системы", "стоимость"};
        int fieldSearch = 0;
        String fieldResearch = """
                1 - Год выпуска,
                2 - Цвет,
                3 - Размер экрана,
                4 - Частота процессора,
                5 - Количество ядер,
                6 - Оперативная память,
                7 - Количество USB-портов,
                8 - Операционная система,
                9 - Стоимость.
                """;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите поле по которому хотите осуществлять поиск: ");
        System.out.println(fieldResearch);
        String field = scan.nextLine();
        if(field.equals("1")){
            String userValue;
            System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            NoteBook.getResultIntYear(set, Integer.parseInt(userValue));
        } else if (field.equals("3")) {
            String userValue;
            System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            NoteBook.getResultIntScreen(set, Integer.parseInt(userValue));
        } else if (field.equals("4")) {
            String userValue;
            System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            NoteBook.getResultIntFreaquncy(set, Integer.parseInt(userValue));
        } else if (field.equals("5")) {
            String userValue;
            System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            NoteBook.getResultIntCore(set, Integer.parseInt(userValue));
        } else if (field.equals("6")) {
            String userValue;
            System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            NoteBook.getResultIntRam(set, Integer.parseInt(userValue));
        } else if (field.equals("7")) {
            String userValue;
            System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            NoteBook.getResultIntUSB(set, Integer.parseInt(userValue));
        } else if (field.equals("2") || field.equals("8")) {
            String userValue;
            System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            NoteBook.getResultStr(set, userValue);
        } else if (field.equals("9")) {
            String userValue;
            System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            NoteBook.getResultDouble(set, Double.parseDouble(userValue));
        } else{
            System.out.println("Некорректный ввод");
        }
    }
}
