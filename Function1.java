import java.text.DecimalFormat;
public class Function1 extends Function
{
	@Override
	public double fnValue(double x)
	{
		if(x <= 0.0)
		{
			return Double.MAX_VALUE;
		}
		else
		{
			return ((.8 * Math.PI * Math.pow(x, 2)) + (800 / x));
		}
	}
	
	@Override
	public String toString()
	{
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}
	
	@Override
	public String answerString(double cost, double radius, double height, double z)
	{
		DecimalFormat df = new DecimalFormat("#,###,###.##");
	    return "Minimum cost is $" + df.format(cost) + " with height = " + df.format(height) + "cm and radius = " + df.format(radius) + "cm";
	}
	
	@Override
	public double getXVal(double x)
	{
		return x;
	}
	
	@Override
	public double getYVal(double x)
	{
		return 2000 / (Math.PI * Math.pow(x, 2));
	}
	
	@Override
	public double getZVal(double x)
	{
		return -1;
	}
}
