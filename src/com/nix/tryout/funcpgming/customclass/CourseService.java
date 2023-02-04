package com.nix.tryout.funcpgming.customclass;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Bunch of services around courses
 */
public class CourseService {

    /**
     * Returns a map of categories as key and value as a list of courses under the category
     * @param courses
     * @return
     */
    public static Map<String, List<Course>> getCourseAsMap(List<Course> courses) {
        return courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory));
    }

    public static int getSumOfStudentsForPredicate(Predicate<Course> predicate, List<Course> courses) {
        return courses.stream()
                .filter(predicate)
                .mapToInt(Course::getNoOfStudents)
                .sum();
    }


}