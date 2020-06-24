package mathQuiz;

public class TestMathQuiz {
    public static void main(String[] args) {
        MathQuiz quiz = new MathQuiz();
        int score = 0;

        boolean result1 = quiz.question1();
        quiz.isResultCorrect(result1);
        score = quiz.scoreUp(score,result1);

        boolean result2 = quiz.question2();
        quiz.isResultCorrect(result2);
        score = quiz.scoreUp(score,result2);

        boolean result3 = quiz.question3();
        quiz.isResultCorrect(result3);
        score = quiz.scoreUp(score,result3);

        quiz.finalScore(score);

    }
}
