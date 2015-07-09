package pattern;

import cell.Cell;

public class NormalPattern implements Pattern{

	final private int UP = -1, DOWN = 1;
	final private int LEFT = -1, RIGHT = 1;
	
	@Override
	public void set(Cell[][] cells) {
		// TODO Auto-generated method stub

		int height = cells.length;
		int width = cells[0].length;
		
		for(int i=0; i <height; i++){
			for(int j=0; j < width; j++){
				int neighbors = 0;
				
				if (i + UP >= 0)
					if(cells[i + UP][j].isAlive())
						neighbors++;

				if (i + UP >= 0 && j + RIGHT < width)
					if (cells[i + UP][j + RIGHT].isAlive())
						neighbors++;
							
				if (j + RIGHT < width)
					if (cells[i][j + RIGHT].isAlive())
						neighbors++;

				if (i + DOWN < height && j + RIGHT < width)
					if (cells[i + DOWN][j + RIGHT].isAlive())
						neighbors++; 
							
				if (i + DOWN < height)
					if (cells[i + DOWN][j].isAlive())
						neighbors++;

				if (i + DOWN < height && j + LEFT >= 0)
					if (cells[i + DOWN][j + LEFT].isAlive())
						neighbors++;				

				if (j + LEFT >= 0)
					if (cells[i][j + LEFT].isAlive())
						neighbors++;

				if (i + UP >= 0 && j + LEFT >= 0)
					if (cells[i + UP][j + LEFT].isAlive())
						neighbors++;

				cells[i][j].setNeighbors(neighbors);			
			}
		}
		
	}

	@Override
	public void apply(Cell[][] cells) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				int neighborCount = cells[i][j].getNeighbors();

				if (cells[i][j].isAlive()) {
					if (neighborCount <= 1 || neighborCount >= 4){
						cells[i][j].setAlive(false);
					}
					
				}else{
					if (neighborCount == 3){
						cells[i][j].setAlive(true);
					}	
					
				}
			}
		} 		
	}

}
