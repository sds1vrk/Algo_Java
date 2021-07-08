package Chapter03;

public class SuperTruck extends Car{

    SuperTruck() {
//        super();
//        부모의 생성자가 자동으로 실행됨

        super("car");

        System.out.println("Truck의 기본 생성자입니다.");
    }

}
