import java.util.Arrays;
import java.util.Scanner;

public class Sort
{
	public static void main(String[] args)
	{
		int a,c,d,i,f,l,m;
		Scanner s=new Scanner(System.in);
		System.out.println("ют╥б");
		a=s.nextInt();
		int[] b=new int[a];
		for(i=0;i<a;i++)
			b[i]=s.nextInt();
		Arrays.sort(b);
		c=s.nextInt();
		for(i=0;i<c;i++)
		{
			f=0;
			l=a-1;
			d=s.nextInt();
			while(f<=l)
			{
				m=(f+l)/2;
				if(d==b[m])
				{
					System.out.println(m+1);
					f=-1;
					break;
				}
				else if(d<b[m])
					l=m-1;
				else
					f=m+1;
			}
			if(f!=-1)
				System.out.println("-1");
		}
		s.close();
	}
}