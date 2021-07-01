package Chater01;
import java.util.Scanner;
public class DoWhileExam {
    public static void main(String[] args) {
//        무조건 한번은 실행
//        입력받은 숫자를 출력, 한번은 무조건 실행

        int value=0;
        Scanner scan=new Scanner(System.in);

        do {
            // 반복할 문장
            value=scan.nextInt();
            System.out.println(value);
        }while(value !=10);
        System.out.println("반복문 종료");

    }
}
