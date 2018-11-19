import java.util.Scanner;
import java.lang.Math.*;

public class Operator {
	static void ShapeChoose() {
	Scanner inputNum = new Scanner(System.in);
	int ipNum;
	
	System.out.println("Choose the Shapes\n");
	System.out.println("1. Equilateral Triangle \t2. Square\t3. Equilateral Trianglar Prism\n4. Square Prism \t5. Equilateral Trianglar Pyramid\t6. Square Pyramid");
	
	 while (!inputNum.hasNextInt()) {
            inputNum.next();
            System.out.println("\nEnter only a number.\n");
        }

        ipNum = inputNum.nextInt();
        if(ipNum>6) {
        	System.out.println("Enter a number between 1 to 6\n");
        	ShapeChoose();
        }
/////////////////////////////////////////////////////////////////////////////////////
        if(ipNum==1) {//Á¤»ï°¢Çü
        	System.out.println("===Equilateral Triangle===");	
        	getET();
        }
        else if(ipNum==2) {//»ç°¢Çü
        	System.out.println("===Square===");
        	getSQ();
        }
        else if(ipNum==3) {//Á¤»ï°¢±âµÕ
        	System.out.println("===Equilateral Triangular Prism===");
        }
        else if(ipNum==4) {//»ç°¢±âµÕ
        	System.out.println("===Square Prism===");
        }
        else if(ipNum==5) {//Á¤»ï°¢»Ô
        	System.out.println("===Equilateral Triangular Pyramid===");
        }
        else {//»ç°¢»Ô
        	System.out.println("===Square Pyramid===");
        	
        }
       }
	private static void getET() {
		Scanner inputNum = new Scanner(System.in);
        double[] Num = new double[6];
        boolean flag=true;        
        String input[]= {null,null,null,null,null,null};
        input[0]="Please input x-coordinate of the Vertex 1 of the triangle: ";
        input[1]="Please input y-coordinate of the Vertex 1 of the triangle: ";
        input[2]="Please input x-coordinate of the Vertex 2 of the triangle: ";
        input[3]="Please input y-coordinate of the Vertex 2 of the triangle: ";
        input[4]="Please input x-coordinate of the Vertex 2 of the triangle: ";
        input[5]="Please input y-coordinate of the Vertex 2 of the triangle: ";       
        
        for(int i=0;i<6;i++) {
        	System.out.print(input[i]);
        	while (!inputNum.hasNextDouble()) {
        		inputNum.next();
        		System.out.println("Enter only number");
        	}
        	
        	Num[i]=inputNum.nextDouble();
        }
        System.out.println("\n");        
        double a =(Num[3]-Num[1])/(Num[2]-Num[0]);
        double b =(Num[5]-Num[3])/(Num[4]-Num[2]);
        if(a==b) {
        	System.out.println("Error: the three vertices are collinear. Please enter non-collinear vertices.");
        	getET();  
        	if(flag==true) {
        		flag= false;        	
        	}
        }
        if(flag==true) {
        EquilateralTriangle triangle = new EquilateralTriangle(Num[0],Num[1],Num[2],Num[3],Num[4],Num[5]);
        double c= triangle.getDistance(Num[0],Num[1],Num[2],Num[3]);
        double d= triangle.getDistance(Num[0],Num[1],Num[4],Num[5]);
        double e= triangle.getDistance(Num[2],Num[3],Num[4],Num[5]);
        if(c!=d||c!=e||d!=e) {
        	 System.out.println("Warning: the three sides are not equal, but continue your operation.");
        } 
        System.out.println("\n"+triangle.toString());
        flag=true;
        }
        else{
        	System.out.println("\n");
        }    	
    }
	private static void getSQ() {
		
	}
}