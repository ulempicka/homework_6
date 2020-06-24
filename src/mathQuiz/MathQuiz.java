package mathQuiz;

import java.util.Scanner;

public class MathQuiz {
    Scanner scanner = new Scanner(System.in);

    boolean question1(){
        System.out.println("Podaj wynik mnożenia 3x5:");
        int multiplication = scanner.nextInt();
        return multiplication == 15;
    }

    boolean question2(){
        System.out.println("Podaj ile wynosi pole kwadratu o boku 12:");
        int square = scanner.nextInt();
        return square == 144;
    }

    boolean question3(){
        System.out.println("Podaj ile wynosi pierwiastek kwadratowy z liczby 15129:");
        int radical = scanner.nextInt();
        return radical == 123;
    }

    void isResultCorrect (boolean result){
        System.out.println("Czy Twój wynik był poprawny? " + result);
    }

    int scoreUp(int score, boolean result){
        if (result){
            score++;
        }
        return score;
    }

    void finalScore(int score){
        System.out.println("Twój wynik to: " + score + "/3 pkt");
    }

}
