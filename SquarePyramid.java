
public class SquarePyramid extends SquarePrism{
	private double x1,x2,y1,y2;
	private double normalHeight;
	private double slantHeight;
	
	
	SquarePyramid(double x1,double x2,double y1,double y2,double normalHeight,double slantHeight) {
		super(x1,y1,x2,y2, slantHeight);
		this.x1=x1;this.x2=x2;this.y1=y1;this.y2=y2;
		this.normalHeight=normalHeight;this.slantHeight=slantHeight;
		
		
	}
	public double getSlantHeight() {
		return slantHeight;
	}
	@Override
	public double getArea() {
		return Math.round(super.getBaseArea()+slantHeight*((getDistance(x1,y1,x1,y2)+getDistance(x1,y1,x2,y1)))*1000.0)/1000.0;
		
	}
	@Override
	public double getVolume() {
		return Math.round((normalHeight*super.getBaseArea())/3.0*1000.0)/1000.0;
		
	}
	@Override
	public String toString() {
		return "Type of shape: Square Pyramid\n\t"+"coordinates of upper left vertex: "+x1+","+y1+"\n\tcoordinates of lower right vertex: "+
	x2+","+y2+"\n\tSide of a square: "+getDistance(x1,y1,x1,y2)+"\n\tnormal height: "+getNormalHeight()+"\n\tSlant Height: "+getSlantHeight()+
	"\n\tSurface Height: "+getArea()+"\n\tVolume: "+getVolume()+"\n";
		
	}
	


}
