package MID.Chapter05;

public class StringExam {

    public static void main(String[] args) {

        String str1="hello world";
        String str2=str1.substring(5);

        System.out.println(str1);
        System.out.println(str2);

        String str3=str1+str2;
        System.out.println(str3);

//        실제 계산은 이렇게 실행됨
        String str4=new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

//        +연산은 좋지 않음 ==> 계속적으로 new연산을 통해서 선언하기 때문에
//        문자열을 반복문안에서 피하고 StringBuffer를 이용하여야 한다.
        String str5="";
        for(int i=0;i<100;i++) {
            str5=str5+"*";
        }
        System.out.println(str5);

//        이 방법이 훨씬 효율적
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<100;i++) {
            sb.append("*");
        }
        String str6=sb.toString();
        System.out.println(str6);


    }
}
