import java.util.Arrays;
import java.util.HashSet;

public class fairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(Arrays.toString(candySwap(aliceSizes, bobSizes)));
    }
    static  int[] candySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        HashSet<Integer> setbob = new HashSet<>();
        for(int x : aliceSizes){
            sumA += x;
        }
        for(int x : bobSizes){
            setbob.add(x);
            sumB += x;
        }
        int delta = (sumB - sumA)/2; 
       
        for(int x : aliceSizes){
            if(setbob.contains(x+delta))
                return new int[]{x,x+delta};
        }
        throw null;
        // formula used = SA - x +y =SB -y+x SA=sum of alice..
        // y=x+(Sb-Sa)/2
        // for every candy x that alice has if bob has candy y =x+(Sb-Sa)/2
        
    }
}
