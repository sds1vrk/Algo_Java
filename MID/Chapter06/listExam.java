package MID.Chapter06;
import java.util.*;
public class listExam {
//    List는 저장공간이 필요에 따라 자유로 늘어남
    public static void main(String[] args) {

        List<String>list=new ArrayList<>();
        list.add("kim");
        list.add("sds");
        list.add("kim");

        System.out.println(list.size());

//        list는 for문을 이용하고 인덱스를 이용하여 꺼냄
        for (int i=0;i<list.size();i++) {
            String str=list.get(i);
            System.out.println(str);
        }



    }
}
