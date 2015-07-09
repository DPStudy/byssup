package point;

import cell.Cell;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	
	public void initCell(Cell[][] cells){
		try{
			cells[y][x].setAlive(true);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
