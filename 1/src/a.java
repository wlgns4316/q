import java.util.Scanner;

public class a
{
	public static void main(String[] args)
	{
		System.out.println("?Է?");
		String a,c,p,q;
		int b,i,j,k,x=0,y,z,r;
		Scanner s=new Scanner(System.in);
		a=s.next();
		b=s.nextInt();
		for(i=1;i<=b;i++)
		{
			r=0;
			c=s.next();
			z=c.length();
			for(j=0;j<z;j++)
			{
				for(k=0;k<a.length();k++)
				{
					r=0;
					y=j+k;
					if(y>=z)
						y=y-z;
					p=a.substring(k,k+1);
					q=c.substring(y,y+1);
					if(!(p.equals(q)))
					{
						r=1;
						break;
					}
				}
				if(r==1)
					continue;
				else
				{
					x++;
					break;
				}
			}
		}
		System.out.print(x);
	}
}