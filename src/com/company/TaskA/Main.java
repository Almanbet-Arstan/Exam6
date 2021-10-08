package com.company.TaskA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "Astan Serikov", 75.8f, 18, "male"));
        students.add(new Student(2L, "Aziret Ramankulov", 80.2f, 18, "male"));
        students.add(new Student(3L, "Maksat Turduev", 72.3f, 18, "male"));
        students.add(new Student(4L, "Ulan Yrymbekov", 89.1f, 18, "male"));
        students.add(new Student(5L, "Amir Amankulov", 95.7f, 17, "male"));
        students.add(new Student(6L, "Marsel Turduev", 68.9f, 18, "male"));
        students.add(new Student(7L, "Shamil Satarov", 97.5f, 23, "male"));
        students.add(new Student(8L, "Askhat Serikov", 97.6f, 26, "male"));
        students.add(new Student(9L, "Shamil Daulyatov", 54.1f, 18, "male"));
        students.add(new Student(10L, "Atai Kanychbekov", 79.9f, 18, "male"));
        List<String> names = getNamesList(students);
        for (String name:names) {
            System.out.println(name);
        }
        System.out.println("===============================");
        List<String> namesBiggerThanMinAge = getNamesListByAge(students, 19);
        for (String name:namesBiggerThanMinAge) {
            System.out.println(name);
        }
        System.out.println("===============================");
        printAnonymously(students);
        System.out.println("===============================");
        List<String> namesFirstLetter = getNamesFirstLetterList(students);
        for (String name:namesFirstLetter) {
            System.out.println(name);
        }
    }
    public static List<String> getNamesList(List<Student> students) {
        return students.stream()
                .map(x -> x.getName())
                .collect(Collectors.toList());
    }
    public static List<String> getNamesListByAge(List<Student> students, int minAge) {
        return students.stream()
                .filter(x -> x.getAge() > minAge)
                .map(x -> x.getName())
                .collect(Collectors.toList());
    }
    public static void printAnonymously(List<Student> students) {
        students.stream()
                .forEach(x -> System.out.println(x));
    }
    public static List<String> getNamesFirstLetterList(List<Student> students) {
        return students.stream()
                .map(x -> x.getName())
                .map(x -> x.substring(0,1) + x.length())
                .collect(Collectors.toList());
    }
}

