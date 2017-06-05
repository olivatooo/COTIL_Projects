import java.awt.Point;


public class Cell extends Point{
	Organism g;
	Cell(int x , int y , Organism g)
	{
		super(x,y);
		this.g=g;
	}
	public Organism getG() {
		return g;
	}
	public void setG(Organism g) {
		this.g = g;
	}
}
