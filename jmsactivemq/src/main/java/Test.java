package main.java;

public class Test {
	
	 public static long calculateHourGlassSum(final int [][] input,int row,int col,int hourGlassWidth){
         long sum =0;
         for(int arr_i=row; arr_i < row+hourGlassWidth; arr_i++){
            for(int arr_j=col-hourGlassWidth+1; arr_j <= col; arr_j++){
                sum = sum + input[arr_i][arr_j];
            }
         }
         
         return (sum - input[row+1][col-hourGlassWidth+1]-input[row+1][col]);
     }
    
	  public static long getMaxHourGlass(final int [][] input,int hourGlassWidth){
	        long maxPositiveSum = Integer.MIN_VALUE;
	        long maxNegativeSum = Integer.MIN_VALUE;
	         for(int arr_i=0; arr_i <= input.length - hourGlassWidth; arr_i++){
	            for(int arr_j=hourGlassWidth -1; arr_j < input[arr_i].length; arr_j++){
	                long hourGlassSum = calculateHourGlassSum(input,arr_i,arr_j,hourGlassWidth);
	                if(hourGlassSum > maxPositiveSum && hourGlassSum >= 0)
	                    maxPositiveSum = hourGlassSum;
	                if(hourGlassSum > maxNegativeSum && hourGlassSum < 0)
	                    maxNegativeSum = hourGlassSum;
	            }
	        }
	        return (maxPositiveSum > (maxNegativeSum)?maxPositiveSum :maxNegativeSum );
	    } 

    public static void main(String[] args) {
        /**Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }*/
        int arr[][] ={
           { 0, -4 ,-6, 0 ,-7, -6},{-1, -2 ,-6, -8, -3, -1},
{-8 ,-4 ,-2 ,-8 ,-8 ,-6},
{-3, -1, -2, -5, -7, -4},
{-3 ,-5, -3 ,-6 ,-6 ,-6},
{-3 ,-6, 0, -8 ,-6, -7}
        };
        System.out.println(getMaxHourGlass(arr,3));
    }

}
