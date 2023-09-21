package Area_a;

public class Area {
	public double circle(double x) {
		x=(3.14*x*x);
		return x;
	}
	public double triangle(double x,double y) {
		x=x*y/2;
		return x;
	}
	public double rectangle(double x,double y) {
		x=x*y;
		return x;
	}
	public double square(double x) {
		x=x*x;
		return x;
	}

}
