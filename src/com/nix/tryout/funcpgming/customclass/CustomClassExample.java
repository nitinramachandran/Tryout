package com.nix.tryout.funcpgming.customclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomClassExample {

    public static void main(String... args) {
        List<Course> courses = List.of(
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

        // allMatch, noneMatch and anyMatch
  //      System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 90));
  //      System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() > 90));
        Comparator<Course> compareByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
        Comparator<Course> compareByReview = Comparator.comparing(Course::getReviewScore).reversed();
        Comparator<Course> compareByCourseName = Comparator.comparing(Course::getName);

        Comparator<Course> compareByReviewAndStudents = Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();
        Predicate<Course> predicateByReviewAndStudentsNumber = course -> course.getReviewScore() > 90 && course.getNoOfStudents() > 10000;

        var courseMap = courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory));
        System.out.print(courseMap);
/*        System.out.println("Value : " + courses.stream()
                .filter(predicateByReviewAndStudentsNumber)
                .mapToInt(Course::getNoOfStudents)
                .sum()
        );*/

/*        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore() > 80)
                        .collect(Collectors.toList()));*/
    }
}
