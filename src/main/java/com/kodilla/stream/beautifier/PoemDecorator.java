package com.kodilla.stream.beautifier;

public class PoemDecorator {
    public void decorate(String textToBeautify, TextModifier textModifier) {
        String result = textModifier.process(textToBeautify);
        System.out.println(result);
    }
}
