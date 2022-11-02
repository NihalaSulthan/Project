package Array;


class MultiThreadex5 extends Thread{  
	  public void run(){  
	   System.out.println("running...");  
	  }  
	 public static void main(String args[]){  
		 MultiThreadex5 t1=new MultiThreadex5();  
		 MultiThreadex5 t2=new MultiThreadex5();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	   
	  t1.start();  
	  t2.start();  
	  
	  t1.setName("Nihala");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}  