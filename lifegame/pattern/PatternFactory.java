package pattern;

public class PatternFactory {

	private PatternFactory(){
	
	}
	
	public static Pattern create(){
		return new NormalPattern();
	}
	
}
