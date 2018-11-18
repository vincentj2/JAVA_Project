
public class SquarePrism extends Square {
	private double x1,x2,y1,y2;
	private double normalHeight;
	
	public void setSquarePrism(double x1,double y1,double x2,double y2,double normalHeight) {
		this.x1=x1; this.x2=x2;this.y1=y1;this.y2=y2;
		this.normalHeight=normalHeight;
	}
	public double getBaseArea() {
		return super.getArea();
	}
	
	public double getNormalHeight() {
		return normalHeight;
	}
	
	public double getlateralSurface() {
		return Math.round(2.0*normalHeight*(getDistance(x1,y2,x2,y2)+getDistance(x1,y1,x1,y2))*1000.0)/1000.0;
	}
	
	@Override
	public double getArea() {
		return Math.round(getlateralSurface()+2.0*super.getArea()*1000.0)/1000.0;
	}
	public double getVolume() {
		return Math.round(super.getArea()*normalHeight*1000.0)/1000.0;
	}
	@Override
	public String toString() {
		return "Type of shape: Square Prism\n\t"+"coordinates of upper left vertex: "+x1+","+x2+
				"\n\tcoordinates of lower right vertex: "+x2+","+y2+"\n\tSide of a square: "+getDistance(x1, y1, x1, y2)+
				"\n\tNormal Height: "+getNormalHeight()+"\n\tLateral Surface Area: "+getlateralSurface()+"\n\tSurface Area: "+getArea()+
				"\n\tVolume: "+getVolume()+"\n";
		
	}	
}
