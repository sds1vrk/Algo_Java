package Chapter01;

public class Base01 {


    public static void main(String[] args) {
//        System.out.println("test");
//        Type Name
//        변수의 첫번째 이름은 소문자, 두단어 합성어 일때는 대대문자
//        totalCount
        int count;
        count=10;
        count=20;

        double avg=11.1;

        String name="test1";

//      상수 - 변하지 않는 수
//        final을 붙여준다. 상수는 대문자의 명명 규칙을 사용한다.
//        ex) 원의 넓이

        final int J;
        J=10;
        double circleArea;
        final double PI=3.14159;
        circleArea=3*3*PI;

        System.out.println(circleArea);
//      상수의 합성어는 _로 구분한다.
        final int OIL_PRICE=1450;
        int totalPrice=50*OIL_PRICE;

//    리터럴
        boolean isFun=true;
        System.out.println(isFun);

//      문자 1개를 표현
        char c='f';

        int x=59;

//       L을 넣어줌
        long data=3444999129L;

//       f를 넣어줌
        float f=32.4f;

//       float<double
        double d=3444124124.5;


//       기본형의 타입변환
//        작은 데이터타입 -> 큰 데이터 타입은 상관없이 담을수 있음 (묵시적 형변환)
//        큰 데이터타입 -> 작은 데이터 타입 변환시 오류 (강제적 형변환)

//        묵시적 형변환
        int xx=50000;
        long y=xx;

        long x2=5;
//        에러 발생 : int y2=x2;
//        강제 형변환
        int y2=(int) x2;

//        연산자
        int i1=-5;
//        부호 연산자
        int i2=+i1;
        int i3=-i1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);


//        증감 연산자
        int i4=++i3; // 먼저 더한다음에 i4에 넣어줌
        System.out.println(i4);
        System.out.println(i3);

        int i5=i3++; // 뒤에 붙을때는 먼저 값을 대입하고 i3에 1을 더해줌
        System.out.println(i5);
        System.out.println(i3);


//        산술 연산자
        int i=5;
        int j=2;

        System.out.println(i+j);
//        정수와 정수 나눌떄는 정수로 나옴
//        둘중 하나는 실수라면 실수로 나옴
        System.out.println(i/(double)j);
//      모듈러
        System.out.println(i%j);


//    비교 연산자
        int ii=10;
        int jj=10;

        System.out.println(ii==jj);
        System.out.println(ii!=jj);
        System.out.println(ii<jj);
        System.out.println(ii<=jj);
        System.out.println(ii>=jj);

//        복합 대입 연산자
        i+=10; //i에 10을 넣고 i에 넣음\
        System.out.println(i);
        i-=10;
        System.out.println(i);


//        연산자 우선순위
        int a=5;
        int b=10;
        int cc=15;

        System.out.println((a-b)*cc);
        System.out.println(a>b && b>5);
        System.out.println(a>b || b>5);

//        System.out.println(++a -5); //5+1 -5 ==>1
        System.out.println(a++ -5); // 먼저 a에서 5를 뺸다음에 a에 1을 증가시킴
        System.out.println(a);























    }

}
