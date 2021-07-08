package MID.Chapter05;

public class WrapperExam {
    public static void main(String[] args) {

        int i=5;

//      객체 Wrapper
        Integer i2=new Integer(5);
//      Auto 박싱 : 기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
        Integer i3=5;

        int i4=i3.intValue();
//        오토 언박싱 : int i5 = i2; Integer객체타입의 값을 기본형 int로 자동으로 변환되어 값을 할당한다.
        int i5=i3;



    }
}
