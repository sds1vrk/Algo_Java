package Chater01;

public class ArrayWithFor {

    public static void main(String[] args) {

        int [] array=new int[100];

        for (int i=0;i<array.length;i++) {
            array[i]=i+1;
        }

        int hap=0;
        for (int i=0;i<array.length;i++) {
            hap+=array[i];
        }

        System.out.println(hap);
    }
}
