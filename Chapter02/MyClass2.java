package Chapter02;

public class MyClass2 {

//    메소드 오버러드
//    동일한 메소드 명 ==> 다른 매개변수, 다른 return

    public int plus(int x,int y) {
        return x+y;
    }

    public int plus(int x,int y, int z) {
        return x+y+z;
    }

    public String plus(String x, String y) {
        return x+y;
    }




}
