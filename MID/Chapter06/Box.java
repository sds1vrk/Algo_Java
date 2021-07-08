package MID.Chapter06;

public class Box<E> {

//    Generic
//    가상의 타입 E로 설정 ==> 꺼낼떄는 String, int, Object 등으로 꺼낼수 있음.

//    private Object obj;
    private E obj;
//    특정 E (Generic을 이용하여 사용) ==> 아직 자료 type형태가 일정하지 않을때 사용
//    Object 타입에 모든 것을 넣을 수 있음
//    String, int, Object 등
    public void setObj(E obj) {
        this.obj=obj;
    }

    public E getObj() {
        return obj;
    }

}
