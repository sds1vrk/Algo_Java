package MID.Chapter05;

public class StringBufferExam {

//    String : 자기 자신이 변하지 않는 불편 클래스
//    StringBuffer : 자기 자신이 변하는 클래스 (자기자신을 return함)

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str=sb.toString();
        System.out.println(str);

        StringBuffer sb2=new StringBuffer();

        //            메소드 체이닝 : 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식
        StringBuffer sb3=sb2.append("hello");

        if(sb2==sb3) {
            System.out.println("sb2==sb3");
        }

        String str2=new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);



    }

}
