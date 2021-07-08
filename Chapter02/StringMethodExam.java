package Chapter02;

public class StringMethodExam {

    public static void main(String[] args) {


//    String str=new String("hello");
        String str="hello";
//        공백도 문자
        System.out.println(str.length());
//        concat 결합
        System.out.println(str.concat(" world"));
        System.out.println(str);

//        참조하는거 변경
        str=str.concat(" world");
        System.out.println(str);

        System.out.println(str.substring(0));
//        3번 인덱스부터 6번 인덱스까지
        System.out.println(str.substring(3,7));


    }





}
