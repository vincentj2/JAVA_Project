
public class EquilateralTrianglarPrism extends EquilateralTriangle {
	private double x1,x2,x3,y1,y2,y3;
	private double normalHeight;
	
	EquilateralTrianglarPrism(double x1,double y1,double x2,double y2,double x3, double y3,double normalHeight)
	{
		 super(x1, y1, x2, y2, x3, y3);
		 this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2; this.x3 = x3 ; this.y3 = y3;
		 this.normalHeight = normalHeight;
	}
	public double getNormalHeight() {
		return normalHeight;
	}
	public double getBaseArea() {
		return super.getArea();
	}
	@Override
	public double getArea() {
		return Math.round((2.0*super.getArea()+normalHeight*(getDistance(x1,y1,x2,y2)+getDistance(x1,y1,x3,y3)+getDistance(x2,y2,x3,y3)))*1000.0)/1000.0; 
	}
	
	public double getVolume() {
		return Math.round(super.getArea()*normalHeight*1000.0)/1000.0;
	}
	
	@Override
	public String toString() {
		return "Type of shape: Equilateral Triangular Prism\n\t"+"coordinates of Vertex 1: "+x1+","+y1+"\n\tcoordinates of Vertex 2: "
				+x2+","+y2+"\n\tcoordinates of Vertex 3: "+x3+","+y3+"\n\tLength of side 1: "+getDistance(x1,y1,x2,y2)
				+"\n\tLength of side 2: "+getDistance(x1,y1,x3,y3)+"\n\tLength of side 3: "+getDistance(x2,y2,x3,y3)+
				"\n\tNormal Height: "+getNormalHeight()+"\n\tSurface Area : "+getArea()+"\n\tVolume : "+getVolume()+"\n";
	}
}