package Chapter02;

public class Car {
//    타입 필드명
    String name;
    int number;


//   생성자
//    this는 현재 객체, 자기 자신을 나타낸다.
    public Car (String name) {
        this.name=name;
    }

//    기본 생성자
//    생성자가 위에 따로 지정되었으면 기본 생성자 생성
    public Car() {
//        this.name="none";
//        this.number=0;

//        this(생성자)
//        자신의 생성자를 호출 (밑에 있는)
        this("이름없음",0);

    }

    public Car(String name, int number) {
        this.name=name;
        this.number=number;
    }









}
