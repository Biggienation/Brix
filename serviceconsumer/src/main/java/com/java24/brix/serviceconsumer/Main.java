package com.java24.brix.serviceconsumer;

import com.java24.brix.service.Calculator;
import com.java24.brix.service.Description;

import java.util.Arrays;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        Calculator calculator;

        ServiceLoader<Calculator> calculators = ServiceLoader.load(Calculator.class);
        calculator = calculators.findFirst().get();
        var annotation = calculator.getClass().getAnnotation(Description.class);
        // gets the annotation of the object, if there is none, then it returns null.
        if (annotation != null) {
            System.out.println(annotation.value());
        }

        // Calculator.class.getAnnotation() - can be used to get the annotations on the class
        System.out.println(calculator.add(1,2));

        try {
           var method = calculator.getClass().getMethod("add", int.class, int.class);
            Arrays.stream(method.getAnnotations())
                    .map(a -> a.annotationType()
                            .getName()).forEach(System.out::println);
            // method.invoke
        } catch (NoSuchMethodException e) {
            System.out.println("No such method found");
        }
        // This line of code looks for a method on the object that has the name "add" and the parameters "int.class".
        // If it doesn't, it throws an exception


    }
}
