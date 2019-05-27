package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
	// write your code here

        Class<?> cls = FirstClass.class;
        FirstClass obj = new FirstClass();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method: methods) {
            if (method.isAnnotationPresent(ReArgument.class)){
                System.out.println("found method");
                method.setAccessible(true);
                try {
                    method.invoke(obj,method.getAnnotation(ReArgument.class).param1(),method.getAnnotation(ReArgument.class).param2());
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
