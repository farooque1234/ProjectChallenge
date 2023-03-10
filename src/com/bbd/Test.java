package com.bbd;



class MultiThread extends Thread{
	
	public void run() {
		
		for(int i=0; i<2; i++) {
			try {
				Thread.sleep(300);
	      System.out.println("running thread name: "+this.currentThread().getName());
	      
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(i);
		}			
	}
	public static void main(String[] args) {
		MultiThread thread1=new MultiThread();
		MultiThread thread2=new MultiThread();
		MultiThread thread3=new MultiThread();	
	
		thread1.start();
		try {
			System.out.println("running thread name: "+Thread.currentThread().getName());
			thread1.join();
		}catch(Exception e) {
			
			System.out.println(e);
		}
	
		thread2.start();
		try {
			System.out.println("running thread name: "+Thread.currentThread().getName());
			thread2.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		thread3.start();
		}
	}
	


		


