package Java.Programers.day01;
import java.util.*;
public class pro1_PocketMon {

    public int solution(int[] nums) {

        int size=nums.length/2;

        Set<Integer>test1=new HashSet<>();
        for (int i:nums) {
            test1.add(i);
        }

        int answer = 0;

        if (test1.size()==size) {
            answer=size;
        }
        else if (test1.size()>size){
            answer=size;
        }
        else {
            answer=test1.size();
        }




        return answer;
    }

    public static void main(String[] args) {




    }


}
