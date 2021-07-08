package MID.Chapter05;

import java.util.Objects;

public class Student {

    String name;
    String number;
    int birthYear;

//  Object와 오버라이딩

//    * 재정의해서 사용
//    Alt + Insert
    //    equals : 객체가 가진 값을 비교할때 사용
    //    toString : 객체가 가진 값을 문자열로 반환
    //    HashCode : 객체의 해시코드 값 반환


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void main(String[] args) {
        Student st=new Student();
        st.name="sds";
        st.number="1234";
        st.birthYear=1990;

        Student st2=new Student();
        st2.name="sds";
        st2.number="1234";
        st2.birthYear=1990;


        if (st.equals(st2)){
            System.out.println("s1==s2");
        }
        else {
            System.out.println("s1!=s2");
        }

        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());


        System.out.println(st.toString());


    }

}
