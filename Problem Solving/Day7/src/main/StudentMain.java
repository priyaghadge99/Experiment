package main;

import beans.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q2.	Define a structure called student that will describe the following information
//	Name
//	Div
//	%obtain
//Using student, declare an array marksheet with 10 elements and write a program to read the information
// about all the 10 students and print a division  wise list containing names of student with their % obtain
public class StudentMain {
    public static String name1;
    public static String div;
    public static String percentageStr;
    public static void main(String[] args) {
        ArrayList marksheet = new ArrayList<>(10);

        Student student1 = new Student("PRIYA", "A", 90);
        Student student2 = new Student("PRIYA", "B", 90);
        Student student3 = new Student("PRIYA", "C", 90);
        ArrayList<Student> studentArrayList = new ArrayList<>(10);

            studentArrayList.add( student1);
            studentArrayList.add( student2);
            studentArrayList.add( student3);

        System.out.println(studentArrayList);
        //output --[beans.Student@1b6d3586, beans.Student@1b6d3586, beans.Student@1b6d3586]


        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String name = studentArrayList.get(i).getName();
            String div = studentArrayList.get(i).getDiv();
            float percentage = studentArrayList.get(i).getPercentage();
            String percentageStr = Integer.toString((int) percentage);

            list.add(name);
            list.add(percentageStr);
//            System.out.println(name);
        }
//to read the information about all the 10 students
        for (int i = 0; i < 3; i++) {   //+ sign to appends
            System.out.println(studentArrayList.get(i).getName() + " ,  " + studentArrayList.get(i).getDiv() + " , " + studentArrayList.get(i).getPercentage());


        }

        List<List<String> >listoflist =  new ArrayList<>();
        for (int i=0;i<3;i++) {
            for (int j=0;j<3-i;j++)
            if ((studentArrayList.get(i).getDiv())==studentArrayList.get(j).getDiv()) {
             name1 = studentArrayList.get(i).getName();
             div = studentArrayList.get(i).getDiv();
            float percentage = studentArrayList.get(i).getPercentage();
             percentageStr = Integer.toString((int) percentage);

                System.out.println(div);
            list.add(name1);
            list.add(percentageStr);
        }
        }
        System.out.println(list);

        //print division vise list
        for (int i = 0; i < 3; i++) {
//            System.out.println("List - " + student1.getDiv() + "  " + list.get(i));
        }




    }
}
