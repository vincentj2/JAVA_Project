import java.util.Scanner;

public class TestShapes {

	public static void main(String[] args) {
		
		Scanner inputNum = new Scanner(System.in);
		int ipNum;
		
		System.out.println("Choose the Shapes\n");
		System.out.println("1. Equilateral Triangle \t2. Square\t3. Equilateral Trianglar Prism\n4. Square Prism \t5. Equilateral Trianglar Pyramid\t6. Square Pyramid");
		
		 while (!inputNum.hasNextInt()) {
	            inputNum.next();
	            System.out.println("\nEnter only a number.\n");
	        }
		 while(inputNum.nextInt()>6) {
			 System.out.println("Enter a number between 1 to 6\n");
			 inputNum.next();
		 }
	        ipNum = inputNum.nextInt();

	        if(ipNum==1) {//���ﰢ��
	        	
	        }
	        else if(ipNum==2) {//�簢��
	        	
	        }
	        else if(ipNum==3) {//���ﰢ���
	        	
	        }
	        else if(ipNum==4) {//�簢���
	        	
	        }
	        else if(ipNum==5) {//���ﰢ��
	        	
	        }
	        else {//�簢��
	        	
	        }
	       
		
	}

}
