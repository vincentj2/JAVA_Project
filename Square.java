
public class Square implements Shapes{
	 private double x1, y1, x2, y2;
     private double s;

     Square(double x1, double y1, double x2, double y2){
         this.x1 = x1;
         this.y1 = y1;
         this.x2 = x2;
         this.y2 = y2;
         s = getDistance(x1,y1,x1,y2);
         
     }

     public double getDistance(double x1, double y1, double x2, double y2){
         return Math.round(Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0)) * 1000.0) / 1000.0;
     }
     public double getArea(){
         return Math.round(Math.pow(s,2.0)*1000.0) / 1000.0;
     }

     @Override
     public String toString(){
         return "Type of shape: Square\n"+"\tcoordinates of upper left Vertex 1: "+x1+","+y1
        		 +"\n\tcoordinates of lower right vertex: "+x2+","+y2+"\n\tSide of a square: "+getDistance(x1,y1,x1,y2)+
        		 "\n\tSurface Area: "+getArea()+"\n";
     }
}

