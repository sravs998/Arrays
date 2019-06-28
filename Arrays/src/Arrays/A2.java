package Arrays;

public class A2 {
public static void main(String[]args) {
int[] x= {1,45,32,4};
int i,max=0,min=99;
for(i=0;i<x.length;i++)
{
if(min>x[i])
	min=x[i];
if(max<x[i])
	max=x[i];
}
System.out.println("Max and min values of the given array are:"+max+" "+min);
}
}
