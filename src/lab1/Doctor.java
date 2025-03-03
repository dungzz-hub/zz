/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Asus
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Doctor {

    private static int idCounter = 1;
    private int id;
    private String name;
    private Date dateOfBirth;
    private String specialization;
    private int availability;
    private String email;
    private String mobile;

    public Doctor(String name, String dateOfBirth, String specialization, int availability, String email, String mobile) throws ParseException {
        this.id = idCounter++;
        this.name = name;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.specialization = specialization;
        this.availability = availability;
        this.email = email;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Doctor ID: " + id + ", Name: " + name + ", DOB: " + sdf.format(dateOfBirth)
                + ", Specialization: " + specialization + ", Availability: " + availability
                + ", Email: " + email + ", Mobile: " + mobile;
    }
}
