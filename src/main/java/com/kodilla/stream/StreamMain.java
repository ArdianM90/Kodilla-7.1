package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.TextModifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        //wersja 1
        //System.out.println("Welcome to module 7 - Stream");

        //wersja 2
        //SaySomething saySomething = new SaySomething();
        //saySomething.say();

        //wersja 3
        //Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //processor.execute(executeSaySomething);

        //wersja 4 - lambda
        //Processor processor = new Processor();
        //Executor codeToExecute = () -> System.out.println("This is an example text.");
        //processor.execute(codeToExecute);
        //przykład kalkulatora lambda
        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        //wersja 5 - referencje do metod
        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        */

        //ZADANIE
        PoemDecorator myDecorator = new PoemDecorator();
        myDecorator.decorate("Pierwszy tekst", (textToBeautify) -> "===="+textToBeautify+"====");
        myDecorator.decorate("Drugi tekst", (textToBeautify) -> textToBeautify.toUpperCase());
        myDecorator.decorate("Pierwszy tekst", (textToBeautify) -> textToBeautify.replace("Pierwszy", "Trzeci"));
    }
}