package practice;

public class fifteen_CustomException extends Exception
{
    public fifteen_CustomException(String message)
    {
        super(message);
    }
    public static void main(String args[]) throws Exception
    {
       displayNumbers();
    }
    public static void displayNumbers() throws fifteen_CustomException
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("i= "+i);
            if(i==6)
            {
              throw new fifteen_CustomException("Hey Anshu My Exception Occurred");
            }
        }
    }
}
