package lifegame;

import java.util.ArrayList;
import java.util.List;

import point.Point;
import timer.Timer;
import board.Board;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		List<Point> points = new ArrayList<Point>();
		points.add(new Point(2, 5));
		points.add(new Point(1, 3));
		points.add(new Point(2, 4));
		points.add(new Point(2, 7));
		points.add(new Point(3, 6));
		
		Board board = Board.getBoard();
		board.init(points);
		
		Timer timer = Timer.getTimer();
		timer.tick(board);
		
	}
}
