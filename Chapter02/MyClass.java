package Chapter02;

public class MyClass {
//    메소드 생성
//    public 리턴타입 메소드명 (매개변수 명) {
//        구현
//    }

    public void noReturn() {

    }

    public void intReturn(int value) {
        System.out.println(value);
    }

    public int intReturn2() {
        return 1234;
    }

    public void method4(int x,int y) {
        System.out.println(x+y+"method4 실행 ");
    }


    public int method5(int x,int y) {
        System.out.println(y+"m5 실행");
        return x*y;
    }








}
