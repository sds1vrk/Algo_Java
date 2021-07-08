package Chapter02;

public class ReferenceDataType {

    int i=4;

//    new -> 메모리에 올린다. (인스턴스, 레퍼런스 변수)
    String str=new String("hello");


    public static void main(String[] args) {
//        String 클래스
//        문자열을 표현하는 자바에서 가장 많이 사용하는 클래스
//        new 연산자를 이용하지 않고 인스턴스를 만들 수 있다.
//        new 연산자를 이용해도 가능
        String str1="hello";
        String str2="hello";
//        ==> 같은 인스턴스
//        ==> a

//
        String str3=new String("hello");
        String str4=new String("hello");
//        ==> 다른 인스턴스

        if (str1==str2) {
            System.out.println("같은 Reference");
        }

        if (str1==str3) {
            System.out.println("같은 레퍼런스");
        }

//        단지 문자열 비교하려면 equals 메소드 사용
        if (str1.equals(str3)) {
            System.out.println("같은 글자");
        }

        System.out.println(str1);
//        Substring 3번 인덱스부터 나머지
        System.out.println(str1.substring(3));









    }




}
