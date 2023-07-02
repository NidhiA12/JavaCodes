// Write a Java program to calculate the average of a list of numbers using a do-while loop points

public class Average
{
	public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6};
         
        float sum = 0;
         
      
        int i=0;
        do
      {
            sum += nums[i];
            i++;
        }
          while(i < nums.length);
         
        
        float average = (sum / nums.length); 
         
        System.out.println("Average : "+average);
	}
}
