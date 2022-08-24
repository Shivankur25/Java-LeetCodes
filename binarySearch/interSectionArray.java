
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class interSectionArray {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 2, 1 };
    int[] nums2 = { 2, 2 };
    System.out.println(Arrays.toString(intersection(nums1, nums2)));
  }
  // static int[] intersection(int[] nums1, int[] nums2) {
  // ArrayList<Integer> list = new ArrayList<>();
  // for(int i = 0 ;i<nums1.length ; i++){
  // for(int j = 0 ; j<nums2.length ;j++){
  // if(nums1[i]==nums2[j] && list.contains(nums1[i])==false){
  // list.add(nums1[i]);
  // }
  // }
  // }
  // int[] arr = new int[list.size()];

  // for (int i = 0; i < list.size(); i++){
  // arr[i] = list.get(i);
  // }
  // return arr;
  // }

  static int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
          int [] output = new int[set1.size()];
          int index = 0;
          for (int s : set1)
            if (set2.contains(s)) output[index++] = s;
            
          return Arrays.copyOf(output, index);
        }

  static int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<Integer>();
    for (Integer n : nums1)
      set1.add(n);
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (Integer n : nums2)
      set2.add(n);

    if (set1.size() < set2.size())
      return set_intersection(set1, set2);
    else
      return set_intersection(set2, set1);

  }
}
