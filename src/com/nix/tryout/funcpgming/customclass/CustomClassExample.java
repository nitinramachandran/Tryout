package com.nix.tryout.funcpgming.customclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomClassExample {

    public static void main(String... args) {
        List<Course> courses = FactoryClass.getCourses();

        // allMatch, noneMatch and anyMatch
  //      System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 90));
  //      System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() > 90));
        Comparator<Course> compareByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
        Comparator<Course> compareByReview = Comparator.comparing(Course::getReviewScore).reversed();
        Comparator<Course> compareByCourseName = Comparator.comparing(Course::getName);

        Comparator<Course> compareByReviewAndStudents = Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();
        Predicate<Course> predicateByReviewAndStudentsNumber = course -> course.getReviewScore() > 90 && course.getNoOfStudents() > 10000;

        var courseMap = CourseService.getCourseAsMap(FactoryClass.getCourses());
        System.out.print(courseMap);

        System.out.println("Sum of students : " +
                CourseService.getSumOfStudentsForPredicate(predicateByReviewAndStudentsNumber,
                        FactoryClass.getCourses()));

/*        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore() > 80)
                        .collect(Collectors.toList()));*/
    }
}
