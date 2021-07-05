package Chater02;

import javax.lang.model.element.VariableElement;

public class VaraibleScopleExam {

     int globalScope=10;
     static int staticValue;

    public void scopeTest(int value) {
        int localScope=20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
        System.out.println(value2);
    }


    public static void main(String[] args) {

//        main 메소드가 static이기 때문에 globalScope를 사용할 수 없다.
//        static을 사용하면 인스턴스를 안해도 사용 가능
//        System.out.println(globalScope);

        System.out.println(staticValue);

//        객체 생성하고
        VaraibleScopleExam v1=new VaraibleScopleExam();
        System.out.println(v1.globalScope);

        VaraibleScopleExam v2=new VaraibleScopleExam();
        v1.globalScope=10;
        v2.globalScope=20;

        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

//        static 값은 하나밖에 없어서 마지막 값만 변경됨
        v1.staticValue=50;
        v2.staticValue=100;

        System.out.println(v1.staticValue);
        System.out.println(v2.staticValue);












    }

}
