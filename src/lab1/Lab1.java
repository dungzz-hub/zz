/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Doctor> doctors = new ArrayList<>();

        while (true) {
            System.out.println("1. Create Doctor");
            System.out.println("2. View All Doctors");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter DOB (dd/MM/yyyy): ");
                        String dob = scanner.nextLine();
                        System.out.print("Enter specialization: ");
                        String specialization = scanner.nextLine();
                        System.out.print("Enter availability (0-3): ");
                        int availability = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter mobile (000-000-0000): ");
                        String mobile = scanner.nextLine();

                        doctors.add(new Doctor(name, dob, specialization, availability, email, mobile));
                        System.out.println("Doctor added successfully!");
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use dd/MM/yyyy.");
                    }
                    break;
                case 2:
                    for (Doctor doctor : doctors) {
                        System.out.println(doctor);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

