package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(" А ");

        ArrayList<String> people = new ArrayList<>();
        while (people.size() < 5) {
            Scanner w = new Scanner(System.in);
            String w1 =w.nextLine();
            people.add(w1);
        }


        getInfo(people);;
        System.out.println("список  Б: ");
        ArrayList<String> students2 = new ArrayList<>();
        while (students2.size() < 5) {
            Scanner scanner = new Scanner(System.in);
            String s2 = scanner.nextLine();
            students2.add(s2);

        }
        getInfo(students2);
        System.out.println("Список С:");
        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(students2);
        Iterator<String> iterator = students2.iterator();
        while (iterator.hasNext()) {
            Iterator<String> iterator1 = people.iterator();
            while (iterator1.hasNext()) {
                String l = iterator1.next();
                listC.add(l);
                iterator1.remove();
                break;
            }
            String s = iterator.next();
            listC.add(s);
        }
        
        getInfo(listC);
        listC.sort(Comparator.comparing(String::length));
        System.out.println("Список С ");
        getInfo(listC);
    }

    public static void getInfo(ArrayList<?> arrayList) {
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
