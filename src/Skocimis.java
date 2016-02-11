import java.util.Scanner;
public class Skocimis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int a=0,b=0,c=0;
		int wrong = 0;
		int jump = 0 , spac = 0;
		String num,str="";
		
		System.out.println("Enter number interger (0-100) fomat is (10 20 30): ");
		num=scan.nextLine();
		for(int i = 0 ; i < num.length() ;i++){
			if(num.substring(i,i+1).equals(" ")){
				spac++; str=""; 
			}
			else { 
				str += num.substring(i,i+1); 
				if(spac == 0)a=Integer.parseInt(str);
				else if(spac == 1)b=Integer.parseInt(str); 
				else if(spac == 2)c=Integer.parseInt(str);
			}
		}
		if(a<0||a>99){
			System.out.println("Number error JingJO NO.1-");
			wrong=1;
		}else if(b<a||b>99){
			System.out.println("Number error JingJO NO.2-");
			wrong=1;
		}else if(b>c||c>99){
			System.out.println("Number error JingJO NO.3-");
			wrong=1;
		}
		if(0<a&&a<b&&b<c&&c<100&&wrong==0){
			jump = ((b-a)>=(c-b))?(b-a):(c-b);
			System.out.println(jump-1);
		}
	}

}
