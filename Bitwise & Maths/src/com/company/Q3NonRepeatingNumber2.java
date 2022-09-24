//Must check Q2
//Question :
//In an array, only one element is there which is not havin pair i.e. only positive value of that is present
// and rest of the elements are having pairs i.e. both positive as well as negative value of that is present
//Find that one element which is unique

package com.company;
public class Q3NonRepeatingNumber2 {
    public static void main(String[] args) {
        int[] nums = {-1, 3, 2, -2, 4, -4, 10, 1, -3};
        System.out.println(uniqueElm(nums));                 //10
    }

    private static int uniqueElm(int[] nums) {
        int unique = 0;

        for(int n : nums) {
            unique += n;

            //     0 +(-1) +3 +2 +(-2) +4 +(-4) +10 +1 +(-3)
            // ==> 0 -1 +3 +2 -2 +4 -4 +10 +1 -3
            // ==> 10
        }

        return unique;
    }

}
