package Arrays;

public class A10 {
public static void main(String args[])
{
	int a=args.length;
	int i,j,max=0;
	int ar[][]=new int[3][3];
	if(a<9)
	System.out.println("enter 9 numbers in the array");
	if(a==9)
	{
	int k=0;
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ar[i][j]=Integer.parseInt(args[k]);
	k++;
	}
	}
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	if(max<ar[i][j])
		max=ar[i][j];
	}
	}
	System.out.println("biggest number in an array is:"+max);
	}
}
}