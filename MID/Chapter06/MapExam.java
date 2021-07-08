package MID.Chapter06;
import java.util.*;

public class MapExam {
//    Key, value
//    중복 안됨
    public static void main(String[] args) {

        Map<String,String>map=new HashMap<>();
        map.put("sds","test1");
        map.put("kim","test2");
        map.put("sjw","test3");

        map.put("sds","kang");

        System.out.println(map.size());
        System.out.println(map.get("sds"));

//        데이터를 모두 다 꺼낼때
//        Set 자료구조 이용
//        ==> Iterator 이용

        Set<String> keys=map.keySet();
        Iterator<String> iter=keys.iterator();

        while(iter.hasNext()) {
            String key=iter.next();
            String value=map.get(key);
            System.out.println(key+":"+value);
        }






    }
}
