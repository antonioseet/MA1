
public class RoomDimension {

	private double width;
	private double length;
	
	public RoomDimension(double w, double len) {
		this.width = w;
		this.length = len;
	}
	
	public double getArea() {
		return (this.width * this.length);
	}
	
}
