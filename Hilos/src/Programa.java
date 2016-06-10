
public class Programa {

	public static void main(String[] args) throws InterruptedException {
		Hilo hilo=new Hilo();
		hilo.start();
		
		
		Thread thread=new Thread(new Ejecucion());
		thread.start();
		
		Thread thread1=new Thread(new Runnable()
				{
					public void run(){
								for(int i =0;i<1000;i++){
								System.out.println(i);
								try{
									Thread.sleep(1000);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
							}
						}
				});
		thread1.start();
		
		System.out.println("Fin Programa.");
		

	}

}
