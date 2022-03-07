import java.util.Scanner;

public class SearchAndReturnBoolean {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size of an Array : ");
        int n = in.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<nums.length; i++) {
            System.out.print("Enter Element For Index " + i + ": ");
            nums[i] = in.nextInt();
        }

        System.out.print("Which Element You Would Like To Search : ");
        int target = in.nextInt();

        System.out.println(linearSearch(nums, target));

    }

    static boolean linearSearch(int[] nums, int target) {
        if(nums.length == 0) {
            return false;
        }

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == target) {
                return true;
            }
        }

        //If after searching in whole Array, Element not found i.e. not present, so just return false
        return false;
    }
}
