package MID.Chapter06;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class setExam {
// Set은 중복 허용 안함, 순서 없음

    public static void main(String[] args) {
        Set<String>set1=new HashSet<>();
        boolean flag1=set1.add("sds");
        boolean flag2=set1.add("kim");
        boolean flag3=set1.add("sds");

//        size
//        중복을 허용안하기 때문에 size는 2
        System.out.println(set1.size());

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

//        꺼낼떄는 Iterator 인터페이스 이용
//        1. Iterator 선언
//        2. while(iter.hasNext())
//        3. next로 꺼냄
        Iterator<String> iter=set1.iterator();
//        데이터가 있는 동안만 꺼낸다
        while(iter.hasNext()) {
            String str=iter.next();
            System.out.println(str);
        }

//        Iterator 외에 forEach를 이용하여 자료를 꺼냄
        Set<String> test1=new HashSet<>();
        test1.add("a");
        test1.add("b");
        test1.add("c");

        for (String test:test1) {
            System.out.println(test);
        }

        String list1[]=new String[]{"2,3,4","4444"};

        for (String test:list1) {
            System.out.println(test);
        }





    }
}
