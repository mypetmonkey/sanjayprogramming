package com.programming.sanjaysir;

public class ExecuteWithoutFinally {
	public static void main(String[] args) {
		 System.out.println('A'+'B');
		try{
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
         System.exit(0);	
         System.out.println("yes");
        
		}
	}

}
