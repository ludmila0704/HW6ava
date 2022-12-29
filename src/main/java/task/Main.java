package task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Notebook> noteArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();

        Notebook notebook1 = new Notebook("Lenovo", 25256, 14.2, "2520х1680", 6, 500,
                "черный", " Intel Core i5 7200H", 1.99);

        Notebook notebook2 = new Notebook("Huawei MateBook", 104256, 13, "1920х1080", 16, 1024,
                "красный", " Intel Core i9 12900H", 1.99);
        Notebook notebook3 = new Notebook("Huawei MateBook D 15 BOD-WDI9", 39990, 15.6, "1920х1080", 8, 256,
                "серый", " Intel Core i3 1115G4", 1.56);
        Notebook notebook4 = new Notebook("Ноутбук Acer Aspire 1 A114-33-P7VD", 30990, 14, "1366х768", 4, 128,
                "серебристый", " Intel Core i3 1115G4", 1.9);

        Collections.addAll(noteArrayList, notebook3, notebook1, notebook2, notebook4);
        notebook1.setWifi(true);

        for (Notebook note : noteArrayList) {

            // note.printInfo();
            //  note.wifi();
        }
        if (filter(noteArrayList) == 0) System.out.println("Не найдено значений, соответствующих введенным параметрам");


        if (filterColor(noteArrayList) == 0)
            System.out.println("Не найдено значений, соответствующих желаемым параметрам");
    }


    private static int filter(ArrayList<Notebook> list) {
        System.out.println("Введите минимальный объем оперативной памяти для фильтрации ноутбуков: ");
        int flag = 0;
        String inputString = scanner.nextLine();
        for (Notebook note : noteArrayList) {

            if (note.getCapacityRAM() >= (Integer.parseInt(inputString))) {
                System.out.print(++flag + ". ");
                note.printInfo();
                System.out.println();

            }
        }
        return flag;
    }

    private static int filterColor(ArrayList<Notebook> list) {
        System.out.println("Введите желаемый цвет ноутбука (на русском): ");
        int flg = 0;
        String inputString = scanner.nextLine();
        for (Notebook note : noteArrayList) {

            //int ram=note.getCapacityRAM();
            if (note.getColor().equals(inputString)) {
                System.out.print(++flg + ". ");
                note.printInfo();
                System.out.println();
            }
        }
        return flg;
    }
}