package com.ss.mar.jb.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lamdas {

    public static void main(String[] args) {
        Words wordsOne = new Words("Hello");
        Words wordsTwo = new Words("from");
        Words wordsThree = new Words("the otherside");
        Words wordsFour = new Words("Hola");
        Words wordsFive = new Words("Earth");
        Words wordsSix = new Words("Adios");
        Words wordsSeven = new Words("Events");
        Words wordsEight = new Words("aca");

        List<Words> words = new ArrayList<>();

        words.add(wordsOne);
        words.add(wordsTwo);
        words.add(wordsThree);
        words.add(wordsFour);
        words.add(wordsFive);
        words.add(wordsSix);
        words.add(wordsSeven);
        words.add(wordsEight);

        //Sort by Length
        System.out.println("=======SORT BY LENGTH========");
        words.sort((w1, w2) -> (w1.getLength() - w2.getLength()));
        words.forEach(word -> System.out.println(word.getStr()));
        System.out.println();

        //Sort reverse length
        System.out.println("=======REVERSE SORT BY LENGTH========");
        words.sort((w1, w2) -> w2.getLength() - w1.getLength());
        words.forEach(word -> System.out.println(word.getStr()));
        System.out.println();


        //Alphabetically
        System.out.println("=======SORT ALPHABETICALLY========");
        words.sort((w1, w2) -> (w1.getStr().charAt(0) - w2.getStr().charAt(0)));
        words.forEach(word -> System.out.println(word.getStr()));
        System.out.println();

        //String that contain 'e' first, then everthing else
        System.out.println("======= START WITH 'e' FIRST========");

        words.sort((w1, w2) -> {

            if (w1.getStr().substring(0, 1).equalsIgnoreCase("e")) {
                return -1;
            } else if (w2.getStr().substring(0, 1).equalsIgnoreCase("e")) {
                return 1;
            }

            return (w1.getStr().compareTo(w2.getStr()));

        });
        words.forEach(word -> System.out.println(word.getStr()));
        System.out.println();


        //redo the previous one but uses utils static method
        System.out.println("======= START WITH 'e' FIRST USES STATIC METHOD========");
        words.sort(LambdaUtils::beginsWithSort);
        words.forEach(word -> System.out.println(word.getStr()));


        //List o string => wwrite a maetof that returns a list of all strings that


        Stream<Words> wordsStream= words.stream();
        Stream<Words> filteredWords = wordsStream.filter( word->{
            return (word.getStr().charAt(0) == 'a' && word.getStr().length()==3);

        });
        System.out.println("======= START WITH 'a' FIRST && 3 LETTERS========");
        filteredWords.forEach(word ->{System.out.println(word.getStr());});
        filteredWords.close();
    }


}
