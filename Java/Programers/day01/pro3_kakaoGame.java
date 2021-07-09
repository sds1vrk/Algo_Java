package Java.Programers.day01;

// 스택을 이용한 게임
import java.util.*;

public class pro3_kakaoGame {


//    2차원 배열 ==> ArrayList로 변환
    public static List<List<Integer>> convertArrayToList(int[][] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < nums[i].length; j++) {
                list.add(nums[i][j]);
            }
            result.add(list);
        }

        return result;
    }

        public int solution(int[][] board, int[] moves) {

            Stack<Integer>list=new Stack<Integer>();

            List<List<Integer>> result = new ArrayList<List<Integer>>();
            result=convertArrayToList(board);


//          2차원 ArrayList 출력
//            for (int i=0;i<result.size();i++) {
//                for (int j=0;j<result.get(i).size();j++) {
//                    System.out.println(result.get(i).get(j));
//                }
//            }
//            System.out.println(result);

//            System.out.println(result.get(0).get(0));
//            System.out.println(result.get(1).get(0));
//            System.out.println(result.get(2).get(0));
//            System.out.println(result.get(3).get(0));
//            System.out.println(result.get(4).get(0));

            int answer = 0;


            for (int i=0;i<moves.length;i++) {
                int move=moves[i]-1;
//                System.out.println(result);
                int value=result.get(0).get(move);
//                System.out.println("value"+value);

                if (value==0) {
//                  0이면 더 파고 든다. move를 1 내려서
                    int p=1;
//                    System.out.println(result.get(p).get(move));
                    while (result.get(p).get(move)==0) {

                        if (p==result.size()-1) {
//                            System.out.println("here");
                            break;
                        }

                        p+=1;

                    }

                    if (result.get(p).get(move)!=0){
//                        System.out.println("bb");

                        int k=result.get(p).get(move);

                        if (!(list.isEmpty()) && list.peek()==k) {
                            list.pop();
                            answer+=2;

                        }
                        else {
                            list.add(k);
                        }

//                        System.out.println("p"+(result.get(p).get(move)));
                        result.get(p).set(move,0);

                    }
                    else {
                        continue;
                    }



//                    list.add(value);

                }else {

                    if (!(list.isEmpty()) && list.peek()==value) {
                        list.pop();
                        answer+=2;

                    }
                    else {
                        list.add(value);
                    }

                    result.get(0).set(move,0);
                }



            }


//            System.out.println(list);
//            System.out.println(answer);



            return answer;
        }

    public static void main(String[] args) {
        pro3_kakaoGame p3= new pro3_kakaoGame();
        int [][]a={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int []b={1,5,3,5,1,2,1,4};
        p3.solution(a,b);


    }


}
