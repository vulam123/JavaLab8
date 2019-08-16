
public final class XPoly {
	public static final double sum(double ...x) {
		double sum = 0;
		for(double a:x) {
			sum+= a;
		}
		return sum;
	}
	public static final double min(double ...x) {
		double min = 100000;
		for(double a:x) {
			if(a<min) {
				min = a;
			}
		}
		return min;
	}
	public static final double max(double ...x) {
		double max = -100000;
		for(double a:x) {
			if(a>max) {
				max = a;
			}
		}
		return max;
	}
}
