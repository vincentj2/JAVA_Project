
public class EquilateralTriangle implements Shapes{
	 private double x1, y1, x2, y2, x3, y3;
     private double a, b, c,p;

     public void setEquilateralTriangle(double x1, double y1, double x2,double y2, double x3, double y3){
         this.x1 = x1;
         this.y1 = y1;
         this.x2 = x2;
         this.y2 = y2;
         this.x3 = x3;
         this.y3 = y3;
         a = getDistance(x1,y1,x2,y2);
         b = getDistance(x1,y1,x3,y3);
         c = getDistance(x2,y2,x3,y3);        
         p = (a+b+c)/2; 
     }

     public double getDistance(double x1, double y1, double x2, double y2){
         return Math.round(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2))*1000.0)/1000.0;
     }

     public double getArea(){
         return Math.round(Math.sqrt(p*(p-a)*(p-b)*(p-c))*1000.0)/1000.0;
     }

     @Override
     public String toString(){
    	 return "Type of shape: Equilateral Triangle\n"+"\tCoordiantes of Vertex 1 point: "+x1+","+y1+"\n\tCoordiantes of Vertex 2 point: "+x2+","+y2+
    			 "/n/tCoordiantes of Vertex 3 point: "+x3+","+y3+"\n\tLength of side 1: "+getDistance(x1,y1,x2,y2)+"\n\tLength of side 2: "+getDistance(x1,y1,x3,y3)
    			 +"\n\tLength of side 3: "+getDistance(x2,y2,x3,y3)+"\n\tSurface Area: "+getArea()+"\n";
     }
}

