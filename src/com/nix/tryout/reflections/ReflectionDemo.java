package com.nix.tryout.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectionDemo {

    public static void main(String... args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        ClassToBeReflected classtoBeRefl = new ClassToBeReflected(13, "Nitin Ram");

        Map<String, Object> classReflectionMap = new HashMap<>();
        classReflectionMap.put("userid", 11);
        classReflectionMap.put("username", "Nitin Ramachandran");

        System.out.println("Initial Value : " + classtoBeRefl);
        System.out.println("Count : " + classtoBeRefl.getClass().getDeclaredMethods().length);
        Object[] obj = {"Siddhant", 2801};

        Method meth = classtoBeRefl.getClass().getDeclaredMethod("voidMethod");
        meth.setAccessible(true);
        Integer result = (Integer) meth.invoke(classtoBeRefl);
        System.out.println(classtoBeRefl + " Result : " + result);

//        for (Method meth : classtoBeRefl.getClass().getDeclaredMethods()) {
       //     System.out.println(meth.getName());
 //       }
  //      ReflectThem.performReflectionOnMethod(classtoBeRefl, "updateString", "Ritika", 321);
  //      System.out.println("Changed method : " + ReflectThem.performReflectionOnMethod(classtoBeRefl, "updateString", "Ritika", 321));
/*        try {
            System.out.println("Changed Value : " + ReflectThem.performReflectionOnVariables(classtoBeRefl, classReflectionMap));

        } catch (NoSuchFieldException e) {
            System.out.println("No Such Exception : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception : " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Illegal Access Exception : " + e.getMessage());
        }*/
    }
}
