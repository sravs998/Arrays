package Arrays;
import java.util.Arrays;
public class A7 {
public static void main(String[]args) {
int[] x= {12,23,34,45,12,23,67,87};
int[] temp=new int[8];
int j=0;
Arrays.sort(x);
for(int i=0;i<x.length-1;i++)
{
	if(x[i]!=x[i+1])
	{
		temp[j++]=x[i];
	}
}
temp[j++]=x[x.length-1];
for(int i=0;i<j;i++)
{
	x[i]=temp[i];
	}
for(int i=0;i<j;i++)
{
	System.out.println(x[i]);
}
}
}
