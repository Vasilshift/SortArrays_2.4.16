import java.util.ArrayList;
public class rt {
    public static void main(String[] args) {
        int[] a1 = {2,4,6,8};
        int[] a2 = {1,3,7,9};
        System.out.print(mergeArrays(a1, a2));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int c = a1.length+a2.length;

        int[] a3 = new int[c];
        a3 =
        int ix1 = 0;
        int ix2 = 0;
        for(int i = 0; i < c; i++){
            if(a2[i] < a1[i]) {
                a3[i] = a2[ix1];
                //ix1++;
            } else {
                a3[i] = a1[i];
                //ix2++;
            }

        }

        return a3;
    }



}
