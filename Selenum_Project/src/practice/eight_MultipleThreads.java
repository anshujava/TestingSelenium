package practice;

public class eight_MultipleThreads {

	static Thread t1 = new Thread(){
        public void run(){
           for(int i = 1;i <= 10;i++)
           {
        	   try {
				sleep (998);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
               System.out.println(i);
           }           
        }
    };
    static Thread t2 = new Thread(){
        public void run(){
           for(int i = 11;i <= 20;i++)
           {
        	   try {
				sleep (1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
               System.out.println(i);
           }           
        }
    };
    public static void main(String[] args){
    	 t1.start();
         t2.start();
    }


}
