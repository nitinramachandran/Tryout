package com.nix.tryout.funcpgming.customclass;

import java.util.List;

public class FactoryClass {

    /**
     * Returns a list of Courses
     * @return
     */
    public static List<Course>getCourses() {
        return List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("React JS", "Javascript", 93, 23000),
                new Course("Python", "Language", 87, 17500),
                new Course("Angular JS", "Javascript", 84, 16000),
                new Course("AWS", "Cloud", 83, 25000),
                new Course("Azure", "Cloud", 83, 26000),
                new Course("Docker", "DevOps", 92, 18000),
                new Course("Kubernetes", "DevOps", 78, 18000),
                new Course("Java", "Language", 84, 45000)
        );
    }

    /**
     * Returns a list of numbers
     * @return
     */
    public static List<Integer> getNumberList() {
        return List.of(12, 2, 3, 7, 4, 6, 17, 25);
    }

    /**
     * Returns a list of names
     * @return
     */
    public static List<String> getNameList() {
        return List.of("Nitin", "Ritika", "Siddhant", "Sathwick", "Vibha", "Saachi", "Kaaku");
    }
}
