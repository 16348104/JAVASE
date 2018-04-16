package NCR.jbcz.Base100;

import sun.text.resources.FormatData_in_ID;

/**
 * Created by dell on 2018/4/15.
 * 比较两个数组arr1={2,4,6,8,10}arr2={3,5,7,9,11,13,15,17}的长度,然后用长度短的数组覆盖长度长的数组的前几项,再覆盖后的数组中的元素打印出来.
 */
public class exam16 {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 8, 10};
        int arr2[] = {3, 5, 7, 9, 11, 13, 15, 17};
        if (arr1.length< arr2.length) {
            System.arraycopy(arr1,0,arr2,0,arr1.length);
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]+"　");
            }
        } else {
            System.arraycopy(arr2,0,arr1,0,arr2.length);
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]+" ");
            }

        }
    }
}
