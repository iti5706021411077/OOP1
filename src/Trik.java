import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=1,c=0,l=0;
		int tmp=0;
		String text = null;
		char Char;
		Scanner scan =  new Scanner(System.in);
		do{
		System.out.print("Enter Value 50 character (A or B or C) : "); 
		text=scan.next();
		}while(text.length() > 50 || text.length() < 1 || text.length() == 0);
		for(int i=0;i<text.length();i++)
		{
			Char=text.charAt(i);
			if(Char=='A'|| Char=='a')
			{
				tmp=r;
				r=c;
				c=tmp;
			}
			if(Char=='B'|| Char=='b')
			{
				tmp=c;
				c=l;
				l=tmp;
			}
			if(Char=='C'|| Char=='c')
			{
				tmp=r;
				r=l;
				l=tmp;
			}
		}
		if(r==1)System.out.println("glass 1");
		if(c==1)System.out.println("glass 2");
		if(l==1)System.out.println("glass 3");

	}

}
