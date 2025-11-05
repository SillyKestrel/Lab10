

import java.util.Scanner;

class Student {
    String name;
    int score;

    // TODO A1: Add a constructor that sets name and score
    Student(String n, int s){
        name = n;
        score = s;
    }
    // TODO A2: Add a method printInfo()
    //   - Print: "<name> scored <score>"
    void printInfo(){
        System.out.println(name + " scored " + score);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int score;
        int students;

        // TODO B1: Ask how many students
        System.out.print("How Many Students? ");
        students=sc.nextInt();
        // TODO B2: Use a for loop that many times
        //   - Ask for student name
        //   - Ask for student score
        //   - Create a Student object
        //   - Call printInfo() to display info
        for (int i = 0; i<students; i++){
            System.out.print("Enter Student Name: ");
            name=sc.nextLine();
            name=sc.nextLine();
            System.out.print("Enter Score: ");
            score=sc.nextInt();
            Student stu = new Student(name, score);
            stu.printInfo();
        }
    }
}
