package com.company;


public class Main {
    public static void main(String[] args) {

        String oldString = "<i>іваіваів</i><І>апппп</І>";
        String newString =  oldString.replace("<i>","<курсив>").replace("</i>","</конец курсива>").replace("<I>","<курсив>").replace("</I>","</конец курсива>");

        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);
    }
}