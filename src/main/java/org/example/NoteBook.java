package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class NoteBook {
    public int year;
    public String colour;
    public int screenSize;
    public int procFriquancy;
    public int procCores;
    public int ram;
    public int usbQuantity;
    public String operationSystem;
    public double price;

    public NoteBook(int year, String colour, int screenSize, int procFriquancy, int procCores, int ram, int usbQuantity, String operationSystem, double price){
        this.year = year;
        this.colour = colour;
        this.screenSize = screenSize;
        this.procFriquancy = procFriquancy;
        this.procCores = procCores;
        this.ram = ram;
        this.usbQuantity = usbQuantity;
        this.operationSystem = operationSystem;
        this.price = price;

    }

    public static void printer(ArrayList<NoteBook> setResult){
        System.out.println("По Вашему запросу найдены следующие результаты: ");
        for (NoteBook item: setResult) {
            System.out.println(String.format(" Год выпуска - %d,\n цвет - %s,\n размер экрана - %d,\n частота процессора - %d,\n количество ядер процессора - %d," +
                            "\n объем оперативной памяти - %d,\n количество USB-портов - %d,\n операционная система - %s,\n стоимость - %.2f", item.year, item.colour,
                    item.screenSize, item.procFriquancy, item.procCores, item.ram, item.usbQuantity, item.operationSystem, item.price));
            System.out.println();
            System.out.println("===================================================================================");
            System.out.println("===================================================================================");
            System.out.println();

        }
    }

    public static ArrayList<NoteBook> getResultIntYear(ArrayList<NoteBook> set, int userValue) {
        ArrayList<NoteBook> setResult = new ArrayList<>();
        for (NoteBook item: set) {
            if (item.year <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<NoteBook> getResultIntScreen(ArrayList<NoteBook> set, int userValue) {
        ArrayList<NoteBook> setResult = new ArrayList<>();
        for (NoteBook item: set) {
            if (item.screenSize <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<NoteBook> getResultIntFreaquncy(ArrayList<NoteBook> set, int userValue) {
        ArrayList<NoteBook> setResult = new ArrayList<>();
        for (NoteBook item: set) {
            if (item.procFriquancy <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<NoteBook> getResultIntCore(ArrayList<NoteBook> set, int userValue) {
        ArrayList<NoteBook> setResult = new ArrayList<>();
        for (NoteBook item: set) {
            if (item.procCores <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<NoteBook> getResultIntRam(ArrayList<NoteBook> set, int userValue) {
        ArrayList<NoteBook> setResult = new ArrayList<>();
        for (NoteBook item: set) {
            if (item.ram <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }
    public static ArrayList<NoteBook> getResultIntUSB(ArrayList<NoteBook> set, int userValue) {
        ArrayList<NoteBook> setResult = new ArrayList<>();
        for (NoteBook item: set) {
            if (item.usbQuantity <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }
    public static ArrayList<NoteBook> getResultDouble(ArrayList<NoteBook> set, double userValue) {
        ArrayList<NoteBook> setCollection = new ArrayList<>();
        ArrayList<NoteBook> setResult = new ArrayList<>();
        for (NoteBook item: set) {
            if (item.price <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<NoteBook> getResultStr(ArrayList<NoteBook> set, String userValue) {
        ArrayList<NoteBook> setResult = new ArrayList<>();
        for (NoteBook item: set) {
            if (item.colour.equals(userValue) || item.operationSystem.equals(userValue)) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }
}


