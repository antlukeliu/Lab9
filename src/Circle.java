import java.math.RoundingMode;
import java.math.BigDecimal;

public class Circle {
	private double radius;


	public Circle(double rad){
		radius = rad;
	}
	
	public double getCircumference(){
		return 2*Math.PI*radius;
	}
	
	public String getFormattedCircumference(){
		return formatNumber(getCircumference());
	}
	
	public double getArea(){
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public String getFormattedArea(){
		return formatNumber(getArea());
	}
	
	private String formatNumber(double x){
		BigDecimal xBig = new BigDecimal(x);
		BigDecimal xBigConverted = xBig.setScale(2, RoundingMode.CEILING);
		String value =  xBigConverted.toString();
		return value;
	}
}
