package Arrays;
import java.util.Arrays;
public class A5 {
public static void main(String[]args) {
	int[] x= {12,9,7,98,16,24};
	int i;
	Arrays.sort(x);
	System.out.println("smallest numbers are:");
	for(i=0;i<2;i++)
	{
		System.out.println(x[i]);
	}
	System.out.println("largest numbers are:");
for(i=x.length-1;i>x.length-3;i--)
{
	System.out.println(x[i]);
	}
}
}
