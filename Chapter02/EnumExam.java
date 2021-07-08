package Chapter02;


// 특정값만 가져와서 사용하고 싶을때 Enum 클래스 사용
public class EnumExam {
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";

    public static void main(String[] args) {

        String gender1;
        gender1=EnumExam.MALE;
        gender1=EnumExam.FEMALE;

        gender1="boy";

        Gender gender2;
        gender2=Gender.FEMALE;
        gender2=Gender.MALE;

//        gender2="boy";

    }

}


enum  Gender{
    MALE,FEMALE;
}