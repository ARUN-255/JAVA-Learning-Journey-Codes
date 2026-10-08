package ObjectOrientedProgramming;

public class JaggedArrayDemo3 {
    public static void main(String[] args) {

        //Jagged array

        int nums [][] = new int[3][]; 

        //defining numbers separately each and every index

        nums[0] = new int [3];
        nums[1] = new int [4];
        nums[2] = new int [2];

        for(int i = 0 ; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                nums [i][j] = (int)(Math.random()*10);
            }
        }

        for(int n[] : nums){
            for(int m: n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
    }
}
