package Arrays;

public class A9 {
public static void main(String args[]) {
int [][]x=new int[4][4];
if(x.length==4)
{System.out.println("enter four values");
}
if(x.length==4)
{ int k=0;
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
x[i][j]=Integer.parseInt(args[k]);
k++;
}
}
System.out.println("given array is");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(x[i][j]+"");
}
System.out.println();
}
System.out.println("reverse array is");
for(int i=1;i>=0;i--)
{
	for(int j=1;j>=0;j--)
	{
	System.out.print(x[i][j]+"");
	}
	System.out.println();
}
}
}
}
