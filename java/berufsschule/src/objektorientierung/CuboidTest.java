package objektorientierung;

public class CuboidTest {
	public static void main(String[] args) {
		Cuboid cuboid1 = new Cuboid();
		
		cuboid1.setLength(36);
		cuboid1.setWidth(24);
		cuboid1.setHeight(36);
		
		System.out.print("Surface: ");
		cuboid1.calcSurface();
		System.out.println("Edge Length: " + cuboid1.calcEdgeLength());
		System.out.println("Volume: " + cuboid1.calcVolume());
	}

}
