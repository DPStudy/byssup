package timer;

import board.Board;

public class Timer{

	private static Timer timer = new Timer();
	private static int sleepTime = 3000;
	
	private  Timer() {
		// TODO Auto-generated constructor stub
	}
	

	public static void tick(Board board) {
		// TODO Auto-generated method stub
		
		while(true){
			try {
				Thread.sleep(sleepTime);
				board.applyPattern();
				board.draw();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
	public static Timer getTimer(){
		return timer;
	}
	

}
