package main.java;

import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter your information to build your CV:");

        System.out.println("Please enter your name: ");
        String name = myInput.nextLine();

        System.out.println("Please enter your age: ");
        int age = myInput.nextInt();

        System.out.println("Please enter your gender: ");
        String gender = myInput.next();
        myInput.nextLine();

        System.out.println("Please enter your education: ");
        String education = myInput.nextLine();

        System.out.println("Please enter your Email: ");
        String email = myInput.nextLine();


        System.out.println("Please enter your profession: ");
        String profession = myInput.nextLine();

        System.out.println("Please enter your company: ");
        String company = myInput.nextLine();

        System.out.println(cvExample (name, age, gender, education, email, profession, company));

    }
    public static String cvExample(String name, int age, String gender, String education, String email,  String profession, String company) {
        return "My name is " + name + ". I am " + age + " years old, and I am a " +gender+ ".\nMy education is " + education + " and my email address is " + email + ".\nI work as a " + profession + " at " + company + ".";
    }

}
