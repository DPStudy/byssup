package board;

import java.util.List;

import pattern.Pattern;
import pattern.PatternFactory;
import point.Point;
import cell.Cell;
import cell.CellFactory;
import drawer.Drawer;

public class Board {

	private static Board board = new Board();
	private int width;
	private int height;
	private Cell[][] cells;
	private Pattern pattern = PatternFactory.create(); 
	private Drawer drawer = new Drawer();
	
	private Board() {
		this.width = 10;
		this.height = 10;
		this.cells = new Cell[this.height][this.width];
		
		for(int i=0; i < this.height; i++)
			for(int j=0; j < this.width; j++)
				this.cells[i][j] = CellFactory.createCell();
	}
	
	
	public static Board getBoard(){
		return board;
	}
	
	public void draw(){
		drawer.draw(cells);
	}

	
	public void init(List<Point> points){
		for(Point point : points){
			point.initCell(cells);
		}
	}
	
	public void applyPattern() {
		// TODO Auto-generated method stub

		pattern.set(cells);
		pattern.apply(cells);
	}
	
}
