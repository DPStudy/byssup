package cell;

public class NormalCell implements Cell {


	private int neighbors;
	private boolean isAlive;
	
	public NormalCell() {
		this.neighbors = 0;
		this.isAlive = false;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setNeighbors(int neighbors) {
		this.neighbors = neighbors; 
	}

	
	public int getNeighbors() {
		return neighbors;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	


}
