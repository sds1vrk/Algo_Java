package Chapter02;

public class MethodOveroLoadExam {
//    메소드 오버로딩
//    매개변수의 유형과 개수가 다르게 하여 같은 이름의 메소드를 여러개 가질수 있게 하는 기술
//    이름은 같지만 매개변수가 다른 메소드 (여러개 선언 가능)


    //    메소드 오버러드
//    동일한 메소드 명 ==> 다른 매개변수, 다른 return


    public static void main(String[] args) {
        MyClass2 mo=new MyClass2();

        System.out.println(mo.plus(4,5));
        System.out.println(mo.plus(1,2,3));
        System.out.println(mo.plus("2","3"));



    }






}
