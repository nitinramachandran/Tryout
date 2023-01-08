package com.nix.tryout.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class ReflectThem {
    /**
     * This method can be used to make changes to an object's private members.
     * @param objectName An instance of the original class
     * @param mapOfValues Map key will be member variable name and map value the corresponding value
     * @return Returns the Object with the changed values
     * @throws NoSuchFieldException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     */
    public static Object performReflectionOnVariables(Object objectName, Map<String, Object> mapOfValues)
            throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {

        for(Map.Entry<String, Object> entry : mapOfValues.entrySet()) {
            Field field = objectName.getClass().getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(objectName, entry.getValue());
        }
        return objectName;
    }

    public static Object performReflectionOnMethod(Object object, String methodName, Object... parameters)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

      Object returnValue = null;
      Method method = object.getClass().getDeclaredMethod(methodName);
      method.setAccessible(true);
      return method.invoke(object, parameters);
    }
}
