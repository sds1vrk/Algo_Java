package MID.Chapter05;

public class MathExam {

    public static void main(String[] args) {

        int value=Math.max(5,10);
        System.out.println(value);

        int minValue=Math.min(5,10);
        System.out.println(minValue);

        System.out.println(Math.abs(-10));

        int rand=(int)(Math.random()*10)+1;
        System.out.println(rand);

        System.out.println(Math.sqrt(25));

        System.out.println("2의 10승 = " + Math.pow(2, 10));
        System.out.println("16의 1/2승 = : " + Math.pow(16, 0.5));
        System.out.println("log200 = " + Math.log10(200));



    }
}
