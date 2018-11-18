
public class EquilateralTrianglarPyramid extends EquilateralTrianglarPrism{
	private double x1,x2,x3,y1,y2,y3;
	private double s1,s2,s3,p;
	private double normalHeight;
	private double slantHeight;
	
	
	public void setEquilateralTrianglarPyramid(double x1,double x2,double x3,double y1,double y2,double y3,double normalHeight,double slantHeight) {
		this.x1=x1;this.x2=x2;this.x3=x3;this.y1=y1;this.y2=y2;this.y3=y3;
		this.normalHeight=normalHeight;this.slantHeight=slantHeight;
		s1 = getDistance(x1,y1,x2,y2);
		s2 = getDistance(x1,y1,x3,y3);
		s3 = getDistance(x2,y2,x3,y3);
		p = s1+s2+s3;
	}
	
//	public double getNormalHeight() {
//		return normalHeight;
//	}
	public double getSlantHeight() {
		return slantHeight;
	}
	@Override
	public double getArea() {
		return Math.round(super.getBaseArea()+(slantHeight*p)/2.0*1000.0)/1000.0;
	}
	
	@Override
	public double getVolume() {
		return Math.round((super.getBaseArea()*normalHeight)/3.0*1000.0)/1000.0;
		
	}
	@Override
	public String toString() {
		return "Type of shape: Equilateral Triangular Pyramid\n\t"+"coordinates of Vertex 1: "+x1+","+y1+"\n\tcoordinates of Vertex 2: "+x2+","+y2+
				"\n\tcoordinates of Vertex 3: "+x3+","+y3+"\n\tLength of side 1: "+s1+"\n\tLength of side 2:"+s2+"\n\tLength of side 3: "+s3+
				"Normal Height: "+getNormalHeight()+"\n\tSlant Heignt: "+getSlantHeight()+"\n\tSurface Area: "+getArea()+"\n\tVolume: "+getVolume()+"\n";
	}
	
	
}
