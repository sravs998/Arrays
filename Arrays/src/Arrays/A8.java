package Arrays;

public class A8 {
public static void main(String args[]) {
int sum=0;
boolean add=true;
int[]x = {10,3,6,1,2,7,9};
for(int i=0;i<x.length;i++) 
{
	if(x[i]!=6&&add==true)
		sum=sum+x[i];
	else if(x[i]==6)
		add=false;
	else if(x[i]==7)
		add=true;
}
System.out.println(+sum);
}
}

