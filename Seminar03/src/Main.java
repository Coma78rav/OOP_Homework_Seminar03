package Seminar03.src;

/*
Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
*— Модифицировать класс Контроллер, добавив в него созданный сервис;
*— Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
 */

import java.util.*;

import Seminar03.src.StudentGroup;
import Seminar03.src.StudentGroupIterator;

public class Main {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup("P-23120");

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);


        studentGroup.addStudent(van);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(alexey);

        StudentGroup studentGroup1 = new StudentGroup("P-23120");
        StudentGroup studentGroup2 = new StudentGroup("T-23120");
        StudentGroup studentGroup3 = new StudentGroup("T-23121");
        StudentGroup studentGroup4 = new StudentGroup("A-23120");
        StudentGroup studentGroup5 = new StudentGroup("A-23121");
        StudentGroup studentGroup6 = new StudentGroup("A-23122");


        Stream Programmers = new Stream();
        Stream Testers = new Stream();
        Stream Analitics = new Stream();

        Programmers.addGroups(studentGroup1);
        Testers.addGroups(studentGroup2);
        Testers.addGroups(studentGroup3);
        Analitics.addGroups(studentGroup4);
        Analitics.addGroups(studentGroup5);
        Analitics.addGroups(studentGroup6);

        System.out.println("Programmers: " + Programmers);
        System.out.println("Testers: " + Testers);
        System.out.println("Analitics: " + Analitics);

        ArrayList<Stream> arrayList = new ArrayList<Stream>(List.of(Analitics, Programmers, Testers ));
        System.out.println(arrayList);

        Collections.sort(arrayList, new StreamComparator());

        System.out.println(arrayList);
    }

}