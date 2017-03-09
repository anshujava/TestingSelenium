package practice;

public class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
    public static void main(String args[]) throws Exception
    {
       displayNumbers();
    }
    public static void displayNumbers() throws CustomException
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("i= "+i);
            if(i==6)
            {
              throw new CustomException("Hey Anshu My Exception Occurred");
            }
        }
    }
}
