
public class RoomCarpet {

	private RoomDimension dim;
	private double costOfSquareFoot;
	
	public RoomCarpet(RoomDimension dim, double cost) {
		this.dim = dim;
		this.costOfSquareFoot = cost;
	}
	
	public double CostOfCarpet() {
		return (this.dim.getArea() * this.costOfSquareFoot);
	}
}
