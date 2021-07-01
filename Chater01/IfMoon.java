package Chater01;

public class IfMoon {
    public static void main(String[] args) {

        int x=50;
        int y=60;

        if (x<y) {
            System.out.println("x는 y보다 작음");
        }

        if (x==y) {
            System.out.println("x는 y와 같음");
        }
        else if(x<y) {
            System.out.println("x가 더 작음");
        }
        else {
            System.out.println("x가 더 큼");
        }


//        논리 연산자
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;

        System.out.println(b1&&b2);
        System.out.println(b1&&b3);
        System.out.println(b1||b3);

        int score=88;
        if (score<=100 && score>=70) {
            System.out.println("성공");
        }
        else {
            System.out.println("실패");
        }

//        배타적 논리연산자
        System.out.println(b1^b3^b2);
        System.out.println(b1^b2^b2);

//        삼항 연산자
        int bb = (5>4) ? 50 :40; // 5가 4보다 크다면 50을, 아니라면 40을 넣어줌
        System.out.println(bb);









    }
}
