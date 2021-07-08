package MID.Chapter06;

public class BoxExam {

    public static void main(String[] args) {
//        Box box =new Box();
//        box.setObj(new Object());
//        Object obj=box.getObj();
//
//        box.setObj("hello");
////        형변환 필요
//        String str=(String) box.getObj();
//
//        box.setObj(1);
//        int value=(int)box.getObj();

//        Generic
//        꺼낼떄 형변환 필요 없음
        Box<Object>box =new Box();
        box.setObj(new Object());
        Object obj=box.getObj();

        Box<String>box2=new Box<>();
        box2.setObj("hello");
        String str=box2.getObj();

        Box<Integer>box3=new Box<>();
        box3.setObj(4);
        int v2=box3.getObj();







    }
}
