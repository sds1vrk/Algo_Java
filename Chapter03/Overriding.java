package Chapter03;

// 오버러아딩이란 부모가 가지고 있는 메소드와 똑같은 모양의 메소드를 자식이 가지고 있는 것
// 즉 오버라이딩이란 메소드를 재정의 하는것

public class Overriding extends Car{

    public void run() {


//        Super를 이용하면 부모의 run메소드를 사용할 수 있다.
        super.run();
        System.out.println("Bus의 Run 메소드");
    }

}
