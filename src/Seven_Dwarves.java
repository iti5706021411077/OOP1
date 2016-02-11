 import java.util.Scanner; 
 public class Seven_Dwarves {  
	 public static void main(String[] args) { 	
		int a1,a2,a3,a4,a5,a6,a7,a8,a9; 	
		int sum=0,over=0;  	
		 
		Scanner scan=new Scanner(System.in); 	
		System.out.println("Enter Number 9 Number : ");
		do{ 			
			a1=scan.nextInt(); 		
			if(a1>99||a1<0) 	
				System.out.println("number 1. Error!"); 	
		}while(a1>99||a1<0); 
			
		do{ 			 
			a2=scan.nextInt(); 		
			if(a2>99||a2<0) 
				System.out.println("number 2. Error!"); 	
		}while(a2>99||a2<0); 	
			
		do{ 
			a3=scan.nextInt(); 		
			if(a3>99||a3<0) 	
				System.out.println("number 3. Error!"); 
		}while(a3>99||a3<0); 	
			
		do{ 		
			a4=scan.nextInt(); 
			if(a4>99||a4<0) 	
				System.out.println("number 4. Error!"); 	
		}while(a4>99||a4<0); 	
			
		do{ 	
			a5=scan.nextInt(); 	
			if(a5>99||a5<0) 
					System.out.println("number 5. Error!"); 
		}while(a5>99||a5<0); 
			
		do{ 	
			a6=scan.nextInt(); 
			if(a6>99||a6<0) 	
				System.out.println("number 6. Error!"); 
		}while(a6>99||a6<0); 	
			
		do{ 		
			a7=scan.nextInt(); 	
			if(a7>99||a7<0) 	
				System.out.println("number 7. Error!"); 	
		}while(a7>99||a7<0); 	
						
		do{ 		
			a8=scan.nextInt(); 
			if(a8>99||a8<0) 
				System.out.println("number 8. Error!"); 	
		}while(a8>99||a8<0); 
			
		do{ 		
			a9=scan.nextInt(); 	
			if(a9>99||a9<0) 	
				System.out.println("number 9. Error!"); 
		}while(a9>99||a9<0); 	
					
		sum=a1+a2+a3+a4+a5+a6+a7+a8+a9; 	
		over=sum-100;  	
			
		if(a1+a2==over)a1=a2=0; 	
		else if(a1+a3==over)a1=a3=0; 	
		else if(a1+a4==over)a1=a4=0; 		
		else if(a1+a5==over)a1=a5=0; 		
		else if(a1+a6==over)a1=a6=0; 		
		else if(a1+a7==over)a1=a7=0; 		
		else if(a1+a8==over)a1=a8=0; 		
		else if(a1+a9==over)a1=a9=0; 		 		
		else if(a2+a3==over)a2=a3=0; 		
		else if(a2+a4==over)a2=a4=0; 		
		else if(a2+a5==over)a2=a5=0; 		
		else if(a2+a6==over)a2=a6=0; 		
		else if(a2+a7==over)a2=a7=0; 		
		else if(a2+a8==over)a2=a8=0; 		
		else if(a2+a9==over)a2=a9=0; 		 		
		else if(a3+a4==over)a3=a4=0; 		
		else if(a3+a5==over)a3=a5=0; 		
		else if(a3+a6==over)a3=a6=0; 		
		else if(a3+a7==over)a3=a7=0; 		
		else if(a3+a8==over)a3=a8=0; 		
		else if(a3+a9==over)a3=a9=0; 		 	
		else if(a4+a5==over)a4=a5=0; 	
		else if(a4+a6==over)a4=a6=0; 	
		else if(a4+a7==over)a4=a7=0; 	
		else if(a4+a8==over)a4=a8=0; 	
		else if(a4+a9==over)a4=a9=0; 		
		else if(a5+a6==over)a5=a6=0; 		
		else if(a5+a7==over)a5=a7=0; 		
		else if(a5+a8==over)a5=a8=0; 		
		else if(a5+a9==over)a5=a9=0; 		
		else if(a6+a7==over)a6=a7=0; 		
		else if(a6+a8==over)a6=a8=0; 		
		else if(a6+a9==over)a6=a9=0; 		
		else if(a7+a8==over)a7=a8=0; 		
		else if(a7+a9==over)a7=a9=0; 		
		else if(a8+a9==over)a8=a9=0; 				
		else { 	
			System.out.println("Your Enter number Error"); 		
			a1=a2=a3=a4=a5=a6=a7=a8=a9=0; 
		} 		 	
			if (a1!=0)	System.out.println(a1); 
			if (a2!=0)	System.out.println(a2); 	
			if (a3!=0)	System.out.println(a3); 	
			if (a4!=0)	System.out.println(a4); 	
			if (a5!=0)	System.out.println(a5); 	
			if (a6!=0)	System.out.println(a6); 	
			if (a7!=0)	System.out.println(a7); 
			if (a8!=0)	System.out.println(a8); 	
			if (a9!=0)	System.out.println(a9); 	
	} 	 
}