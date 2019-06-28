package Arrays;

public class A3 {
public static void main(String []args) {
int[] x= {23,34,45,56,78,89,90};
int i,count=0;
int search=Integer.parseInt(args[0]);
for(i=0;i<x.length;i++)
{
if (x[i]==search)
{
	count++;
	System.out.println(i);
}
}
if(count==0)
	System.out.println("-1");
}
}
