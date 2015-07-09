package cell;

public interface Cell {

	public boolean isAlive();
	public void setAlive(boolean isAlive);
	public void setNeighbors(int neighbors);
	public int getNeighbors();
	
}
