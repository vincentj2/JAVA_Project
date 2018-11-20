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
        	getETPrism();
        }
        else if(ipNum==4) {//»ç°¢±âµÕ
        	System.out.println("===Square Prism===");
        	getSQPrism();
        }
        else if(ipNum==5) {//Á¤»ï°¢»Ô
        	System.out.println("===Equilateral Triangular Pyramid===");
        	getETPyramid();
        }
        else {//»ç°¢»Ô
        	System.out.println("===Square Pyramid===");
        	getSQPyramid();        	
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
        	flag=false;
        }
        if(flag==false) {
        	getET();
        }
        else{
        EquilateralTriangle triangle = new EquilateralTriangle(Num[0],Num[1],Num[2],Num[3],Num[4],Num[5]);
        double c= triangle.getDistance(Num[0],Num[1],Num[2],Num[3]);
        double d= triangle.getDistance(Num[0],Num[1],Num[4],Num[5]);
        double e= triangle.getDistance(Num[2],Num[3],Num[4],Num[5]);
        if(c!=d||c!=e||d!=e) {
        	 System.out.println("Warning: the three sides are not equal, but continue your operation.");
        } 
        System.out.println("\n"+triangle.toString());
        ShapeChoose();
        }
    }
	private static void getSQ() {
		Scanner inputNum = new Scanner(System.in);
        double[] Num = new double[4];
        boolean flag=true;        
        String input[]= {null,null,null,null};
        input[0]="Please input x-coordinate of the Upper Left of the Square: ";
        input[1]="Please input y-coordinate of the Upper Left of the Square: ";
        input[2]="Please input x-coordinate of the Lower Right of the Square: ";
        input[3]="Please input y-coordinate of the Lower Right of the Square: ";
       
        for(int i=0;i<4;i++) {
        	System.out.print(input[i]);
        	while (!inputNum.hasNextDouble()) {
        		inputNum.next();
        		System.out.println("Enter only number");
        	}
        	
        	Num[i]=inputNum.nextDouble();        	
        }
        System.out.println("\n");
        if(Num[0]==Num[2]&&Num[1]==Num[3]) {
        	System.out.println("Error: vertex (x1, y1) and (x2, y2) are same. Please enter two different vertices");
        	flag=false;
        }
        else if(Num[2]<=Num[0]) {
        	System.out.println("Error: x-coordinate of upper left vertex should be less than x-coordinate of lower right vertex.\n" + 
        			"Please enter valid coordinates\r\n");
        	flag=false;
        }
        else if(Num[1]<=Num[3]) {
        	System.out.println("Error: y-coordinate of upper left vertex should be less than y-coordinate of lower right vertex.\n" + 
        			"Please enter valid coordinates\r\n");
        	flag=false;
        }        
        if(flag==false) {
        	getSQ();
        }
        else {
        	Square square = new Square(Num[0],Num[1],Num[2],Num[3]);
        	System.out.println("\n");
        	System.out.println(square.toString());
        	ShapeChoose();
        }
    }
	private static void getETPrism() {
		Scanner inputNum = new Scanner(System.in);
        double[] Num = new double[6];
        double height;
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
        	System.out.println("Error: the three vertices are collinear. Please enter non-collinear vertices.\n");
        	flag=false;
        }
        if(flag==false) {
        	getETPrism();
        }
        else{
        EquilateralTriangle triangle = new EquilateralTriangle(Num[0],Num[1],Num[2],Num[3],Num[4],Num[5]);
        double c= triangle.getDistance(Num[0],Num[1],Num[2],Num[3]);
        double d= triangle.getDistance(Num[0],Num[1],Num[4],Num[5]);
        double e= triangle.getDistance(Num[2],Num[3],Num[4],Num[5]);
        	if(c!=d||c!=e||d!=e) {
        		System.out.println("Warning: the three sides are not equal, but continue your operation.\n");
        	} 
        
        System.out.print("Please enter normal height: ");
        height= inputNum.nextDouble();
        while(height<=0.0) {
        	System.out.println("\nError: Normal height should be positive\n");
        	System.out.print("Please enter positive value for normal height: \n");
        	height= inputNum.nextDouble();
        }
        EquilateralTrianglarPrism ETP = new EquilateralTrianglarPrism(Num[0],Num[1],Num[2],Num[3],Num[4],Num[5],height);
        System.out.println("\n");
        System.out.println(ETP.toString());
        ShapeChoose();
        }
	}
	private static void getSQPrism() {
		Scanner inputNum = new Scanner(System.in);
        double[] Num = new double[4];
        boolean flag=true; 
        double height;
        String input[]= {null,null,null,null};
        input[0]="Please input x-coordinate of the Upper Left of the Square: ";
        input[1]="Please input y-coordinate of the Upper Left of the Square: ";
        input[2]="Please input x-coordinate of the Lower Right of the Square: ";
        input[3]="Please input y-coordinate of the Lower Right of the Square: ";
       
        for(int i=0;i<4;i++) {
        	System.out.print(input[i]);
        	while (!inputNum.hasNextDouble()) {
        		inputNum.next();
        		System.out.println("Enter only number");
        	}
        	
        	Num[i]=inputNum.nextDouble();        	
        }
        System.out.println("\n");
        if(Num[0]==Num[2]&&Num[1]==Num[3]) {
        	System.out.println("Error: vertex (x1, y1) and (x2, y2) are same. Please enter two different vertices");
        	flag=false;
        }
        else if(Num[2]<=Num[0]) {
        	System.out.println("Error: x-coordinate of upper left vertex should be less than x-coordinate of lower right vertex.\n" + 
        			"Please re-enter valid coordinates\r\n");
        	flag=false;
        }
        else if(Num[1]<=Num[3]) {
        	System.out.println("Error: y-coordinate of upper left vertex should be less than y-coordinate of lower right vertex.\n" + 
        			"Please enter valid coordinates\r\n");
        	flag=false;
        }        
        if(flag==false) {
        	getSQPrism();
        }
        else {
        	System.out.print("Please input Normal Height: ");
        	  height= inputNum.nextDouble();
              while(height<=0.0) {
              	System.out.println("\nError: Normal height should be positive\n");
              	System.out.print("Please enter positive value for normal height: \n");
              	height= inputNum.nextDouble();
              }
        	SquarePrism square = new SquarePrism(Num[0],Num[1],Num[2],Num[3],height);
        	System.out.println("\n");
        	System.out.println(square.toString());
        	ShapeChoose();
        }		
	}
	
	private static void getETPyramid() {
		Scanner inputNum = new Scanner(System.in);
        double[] Num = new double[6];
        double height,sHeight;
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
        	System.out.println("Error: the three vertices are collinear. Please enter non-collinear vertices.\n");
        	flag=false;
        }
        if(flag==false) {
        	getETPyramid();
        }
        else{
        EquilateralTriangle triangle = new EquilateralTriangle(Num[0],Num[1],Num[2],Num[3],Num[4],Num[5]);
        double c= triangle.getDistance(Num[0],Num[1],Num[2],Num[3]);
        double d= triangle.getDistance(Num[0],Num[1],Num[4],Num[5]);
        double e= triangle.getDistance(Num[2],Num[3],Num[4],Num[5]);
        	if(c!=d||c!=e||d!=e) {
        		System.out.println("Warning: the three sides are not equal, but continue your operation.\n");
        	} 
        
        System.out.print("Please input Normal Height: ");
        height= inputNum.nextDouble();
        while(height<=0.0) {
        	System.out.println("Error: Normal height should be positive");
        	System.out.print("Please input positive value for height: ");
        	height= inputNum.nextDouble();
        }
        System.out.print("\nPlease input Slant Height: ");
        sHeight=inputNum.nextDouble();
        while(sHeight<=height) {
        	System.out.println("Error: Slant Height should be larger than normal Height");
        	System.out.print("Please input correct Slant Height: ");
        	sHeight= inputNum.nextDouble();
        }
        EquilateralTrianglarPyramid ETPyramid = new EquilateralTrianglarPyramid(Num[0],Num[2],Num[4],Num[1],Num[3],Num[5],height,sHeight);
        System.out.println("\n");
        System.out.println(ETPyramid.toString());
        ShapeChoose();
        }
	}
	private static void getSQPyramid() {
		Scanner inputNum = new Scanner(System.in);
        double[] Num = new double[4];
        boolean flag=true; 
        double height,sHeight;
        String input[]= {null,null,null,null};
        input[0]="Please input x-coordinate of the Upper Left of the Square: ";
        input[1]="Please input y-coordinate of the Upper Left of the Square: ";
        input[2]="Please input x-coordinate of the Lower Right of the Square: ";
        input[3]="Please input y-coordinate of the Lower Right of the Square: ";
       
        for(int i=0;i<4;i++) {
        	System.out.print(input[i]);
        	while (!inputNum.hasNextDouble()) {
        		inputNum.next();
        		System.out.println("Enter only number");
        	}
        	
        	Num[i]=inputNum.nextDouble();        	
        }
        System.out.println("\n");
        if(Num[0]==Num[2]&&Num[1]==Num[3]) {
        	System.out.println("Error: vertex (x1, y1) and (x2, y2) are same. Please enter two different vertices");
        	flag=false;
        }
        else if(Num[2]<=Num[0]) {
        	System.out.println("Error: x-coordinate of upper left vertex should be less than x-coordinate of lower right vertex.\n" + 
        			"Please re-enter valid coordinates\r\n");
        	flag=false;
        }
        else if(Num[1]<=Num[3]) {
        	System.out.println("Error: y-coordinate of upper left vertex should be less than y-coordinate of lower right vertex.\n" + 
        			"Please enter valid coordinates\r\n");
        	flag=false;
        }        
        if(flag==false) {
        	getSQPyramid();
        }
        else {
        	System.out.print("Please input Normal Height: ");
        	  height= inputNum.nextDouble();
              while(height<=0.0) {
              	System.out.println("Error: Normal height should be positive");
              	System.out.print("Please enter positive value for normal height: ");
              	height= inputNum.nextDouble();
              }
              System.out.print("\nPlease input Slant Height: ");
              sHeight=inputNum.nextDouble();
              while(sHeight<=height) {
              	System.out.println("Error: Slant Height should be larger than normal Height");
              	System.out.print("Please input correct Slant Height: ");
              	sHeight= inputNum.nextDouble();
              }
        	SquarePyramid squarepyramid = new SquarePyramid(Num[0],Num[1],Num[2],Num[3],height,sHeight);
        	System.out.println("\n");
        	System.out.println(squarepyramid.toString());
        	ShapeChoose();
        }		
	}
	
	
}