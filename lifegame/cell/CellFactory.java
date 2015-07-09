package cell;

public class CellFactory {
	
	private CellFactory(){
		
	}
	
	public static Cell createCell(){
		return new NormalCell();
	}
	
}
