// Write a Java program to find the largest of three numbers using nested if-else statements.
public class Largest
{
	public static void main(String[] args) {
	    int firstnum=17;
	    int secondnum=9;
	    int thirdnum=47;
	    if (firstnum > secondnum && firstnum > thirdnum)
	    {
	        System.out.println("first Number is largest "+firstnum);
	    }
	    else if(secondnum>firstnum && secondnum > thirdnum)
	    {
	        System.out.println("Second Number is largest "+secondnum);
	    }
	    else
	    {
	        System.out.println("third Number is largest "+thirdnum);
	    }
    
	}
}
