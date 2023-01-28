package com.nix.tryout.jsonxml;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonPlayMain {

    public static void main(String[] args) throws IOException {

        List<Vehicle> cars = new ArrayList<>();

        Vehicle v1 = new Car("Skoda", "Kushaq");
        v1.setWheels(4);
        v1.setEngineType("Turbo Charged");
        v1.setFuelType(FuelType.DIESEL);
        cars.add(v1);

        Vehicle v2 = new Car("Toyota", "Corolla");
        v2.setWheels(4);
        v2.setEngineType("Quadrajet");
        v2.setFuelType(FuelType.DIESEL);
        cars.add(v2);

        Vehicle v3 = new Car("Skoda", "Rapid");
        v3.setWheels(4);
        v3.setEngineType("non-Turbo");
        v3.setFuelType(FuelType.PETROL);
        cars.add(v3);

        Vehicle v4 = new Car("BMW", "M3");
        v4.setWheels(4);
        v4.setEngineType("Turbo Charged");
        v4.setFuelType(FuelType.DIESEL);
        cars.add(v4);

        FileWriterUtil.writeFileAsJSON("generated_files", "Vehicle_json_file.txt", cars);

        Student s1 = new Student();
        s1.setAge(15);
        s1.setStudentName("Ram");
        s1.setSubjects(List.of(new Subject("s1", "English"), new Subject("s2", "Biology"), new Subject("s3", "Maths")));

        Student s2 = new Student();
        s2.setAge(14);
        s2.setStudentName("Sam");
        s2.setSubjects(List.of(new Subject("s1", "French"), new Subject("s2", "Physics"), new Subject("s3", "Maths")));

        Student s3 = new Student();
        s3.setAge(15);
        s3.setStudentName("Jamie");
        s3.setSubjects(List.of(new Subject("s1", "English"), new Subject("s2", "Biology"), new Subject("s3", "Chemistry")));

        Student s4 = new Student();
        s4.setAge(16);
        s4.setStudentName("Lisa");
        s4.setSubjects(List.of(new Subject("s1", "English"), new Subject("s3", "Maths")));

        FileWriterUtil.writeFileAsJSON("generated_files", "Student_json_file.txt", List.of(s1, s2, s3, s4));

    }
}