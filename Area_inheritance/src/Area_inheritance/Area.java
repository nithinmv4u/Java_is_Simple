package Area_inheritance;

public class Area {
	double circle(double x){
		x=(3.14*x*x);
		return x;
	}
	double triangle(double x,double y) {
		x=x*y/2;
		return x;
	}
	double rectangle(double x,double y) {
		x=x*y;
		return x;
	}
	double square(double x) {
		x=x*x;
		return x;
	}


}
