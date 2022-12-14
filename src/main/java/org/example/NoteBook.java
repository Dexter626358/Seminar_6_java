package org.example;

import java.util.*;

public class NoteBook {
    public String year;
    public String colour;
    public String screenSize;
    public String procFriquancy;
    public String procCores;
    public String ram;
    public String usbQuantity;
    public String operationSystem;
    public String price;
    public String[] fields;


//    public NoteBook(int id, int year, String colour, int screenSize, int procFriquancy, int procCores, int ram, int usbQuantity, String operationSystem, double price){
//        this.id = id;
//        this.year = year;
//        this.colour = colour;
//        this.screenSize = screenSize;
//        this.procFriquancy = procFriquancy;
//        this.procCores = procCores;
//        this.ram = ram;
//        this.usbQuantity = usbQuantity;
//        this.operationSystem = operationSystem;
//        this.price = price;
//    }


    public static void printer(HashSet<ArrayList<String>> setResult){
        System.out.println("По Вашему запросу найдены следующие результаты: ");
        for (List<String> item: setResult) {
            System.out.println(String.format(" Год выпуска - %s,\n цвет - %s,\n размер экрана - %s,\n частота процессора - %s,\n количество ядер процессора - %s," +
                            "\n объем оперативной памяти - %s,\n количество USB-портов - %s,\n операционная система - %s,\n стоимость - %s", item.get(0), item.get(1),
                    item.get(2), item.get(3), item.get(4), item.get(5), item.get(6), item.get(7), item.get(8)));
            System.out.println();
            System.out.println("===================================================================================");
            System.out.println("===================================================================================");
            System.out.println();

        }
    }

    public static HashSet<ArrayList<String>> noteBookStore() {
        HashSet<ArrayList<String>> set = new HashSet<>();
        set.add(new ArrayList<>(List.of("2019", "black", "24", "1200", "2", "8", "2", "Windows", "25000")));
        set.add(new ArrayList<>(List.of("2021", "red", "12", "3600", "4", "8", "4", "MacOs", "71500")));
        set.add(new ArrayList<>(List.of("2022", "silver", "16", "4200", "8", "16", "6", "Windows", "45300")));
        set.add(new ArrayList<>(List.of("2022", "white", "22", "2400", "16", "32", "2", "Linux", "35000")));
        set.add(new ArrayList<>(List.of("2019", "black", "12", "2600", "8", "32", "4", "Windows", "100500")));
        set.add(new ArrayList<>(List.of("2021", "red", "12", "3600", "4", "8", "4", "MacOs", "71500")));
        set.add(new ArrayList<>(List.of("2018", "red", "24", "3400", "2", "16", "6", "Windows", "45000")));
        set.add(new ArrayList<>(List.of("2020", "silver", "22", "3800", "8", "8", "2", "MacOs", "120000")));
        set.add(new ArrayList<>(List.of("2021", "black", "12", "1200", "16", "8", "6", "Linux", "46600")));
        set.add(new ArrayList<>(List.of("2021", "white", "16", "3400", "8", "4", "4", "Windows", "45000")));
        set.add(new ArrayList<>(List.of("2022", "red", "16", "2600", "4", "16", "6", "Windows", "67000")));
        return set;
    }

    public static HashSet<ArrayList<String>> getResult(String userValue) {
        HashSet<ArrayList<String>> setCollection = noteBookStore();
        HashSet<ArrayList<String>> setResult = new HashSet<>();
        for (ArrayList<String> item: setCollection) {
            if (item.contains(userValue)) {
                setResult.add(item);
            }
        }
        return setResult;
    }

    public static int fieldRequest(){
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
        switch (field.strip()) {
            case "1":
                fieldSearch = 0;
                break;
            case "2":
                fieldSearch = 1;
                break;
            case "3":
                fieldSearch = 2;
                break;
            case "4":
                fieldSearch = 3;
                break;
            case "5":
                fieldSearch = 4;
                break;
            case "6":
                fieldSearch = 5;
                break;
            case "7":
                fieldSearch = 6;
                break;
            case "8":
                fieldSearch = 7;
                break;
            case "9":
                fieldSearch = 8;
                break;
            default:
                System.out.println("Некорректный ввод");
        }

        return fieldSearch;
    }

    public static String valueRequest(int field){
        String userValue;
        String[] fields = {"год выпуска", "цвет", "размер экрана в дюймах", "частоту процессора в ГГц", "количество ядер процессора",
                "объем оперативной памяти в МБ", "количество USB-портов", "название операционной системы", "стоимость"};
        Scanner scan = new Scanner(System.in);
        System.out.println(String.format("Введите %s:", fields[field]));
        userValue = scan.nextLine();
        return userValue;

    }
}


