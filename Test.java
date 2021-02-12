/**
 * NO EXTERNAL LIBRARIES OR PACKAGES SHOULD BE IMPORTED
 * Test your code inside of this class as I will be using an 
 * autograder with your WiggleSort functions.
 *
 * @author 
 * 
 * Test inputs: 
 * 1,3,2,2,3,1
 * 3,5,2,1,6,4
 */
public class Test {
    public static void main(String[] args) {
        int nums[] = {1,5,1,1,6,4}; //replace these numbers to test

        System.out.println("Nums before wiggle sort: ");
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]);
        }

        System.out.println("\nNums after wiggle sort: ");
        int test[] = WiggleSort.wiggleSort(nums); //Calls wigglesort
        for(int i=0; i< test.length; i++){
            System.out.print(test[i]);
        }
    }
}
