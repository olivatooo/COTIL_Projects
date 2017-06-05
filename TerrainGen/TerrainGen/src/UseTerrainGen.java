
public class UseTerrainGen {
	
	public static void main(String args[])
	{
	 TerrainGen a = new TerrainGen();
	 a.main();
	 a.makeBase();
	 a.makeElevation();
	 a.fullfillCaverns();
	 a.makeChisel();
	 a.makeCarve(2);
	 a.printWorld();
	}
}
