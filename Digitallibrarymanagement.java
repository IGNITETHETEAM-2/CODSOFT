import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

class Student {

private String name;

private int roll_Number;

public Student(String name, int roll_Number) { this.name = name; this.roll_Number = roll_Number;

}

public String get_User_Name() { return name; }

public int get_Roll_Number() { return roll_Number;

}

}

public class student_Managment {

private List<Student> students;

public student_Managment() {
students = new ArrayList<>();

}

public void add_student(String name, int roll_Number) {

Student student = new Student(name, roll_Number); students.add(student);

}

public void display_Now() {

System.out.println("This Is Students Record");

for (Student student: students) {

System.out.println("Your Name Is :" + student.get_User_Name() + "Roll Number Is:" + student.get_Roll_Number()); }

}

public static void main(String[] args) {

Scanner scn = new

Scanner(System.in);
student_Managment system = new student_Managment();

while (true) {

System.out.println("This is A Student Managment System");

System.out.println("1. Add Student Name");

System.out.println("2. Display Name Of Student");

System.out.println("3.Exit Now This Page");

System.out.print("Enter Your Choice Now Plese :");

int choices = scn.nextInt();

switch (choices) {

case 1:

System.out.println("Enter A Student Name Is :");

String get_User_Name = scn.next();

System.out.println("Enter A

Student Roll Number Is :");

int get_Roll_Number = scn.nextInt();

system.add_student(get_User_Name,ge t_Roll_Number);

break;

case 2:

system.display_Now(); break;
case 3:

System.out.println("Exiting

This program");

System.exit(0);

default:

System.out.println("Sorry

Invlid Choice Please Try Again Later");

}

}

}

}
