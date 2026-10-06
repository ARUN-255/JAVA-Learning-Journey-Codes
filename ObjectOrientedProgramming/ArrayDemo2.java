package ObjectOrientedProgramming;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //Multiple Arrays - Multi-Dimensional Array
    int nums[][] = new int[3][4];
        //Giving random values using Math function in java

    for(int i=0; i<3; i++)
            {

            for(int j=0; j<4; j++)
                {
                    nums[i][j] = (int)(Math.random()*10);
            }
           
        }
        //Using Nested-Loop for printing the values in arrays that is from 1 to ....
        for(int i=0; i<3; i++)
            {

            for(int j=0; j<4; j++)
                {
                    System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //Using Enhanced-For Loop for printing
        for(int n[] : nums){
            
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
