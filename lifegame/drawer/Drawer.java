package drawer;


import cell.Cell;

public class Drawer {

	
	public Drawer() {
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Cell[][] board){
		
		StringBuffer sb = new StringBuffer();
		for(Cell[] row : board){
			for(Cell cell : row){
				if(cell.isAlive()){
					sb.append('O');
				}else{
					sb.append('X');
				}
			}
			sb.append('\n');
		}
		
		System.out.println(sb.toString());
	}
}
