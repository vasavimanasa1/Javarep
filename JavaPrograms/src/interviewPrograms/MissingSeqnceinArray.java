package interviewPrograms;

public class MissingSeqnceinArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,4};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
System.out.println("Sum of all integers in array::"+sum);
int sum1=0;
for(int j=1;j<=4;j++)
{
	sum1=sum1+j;
}
System.out.println("sum1 is::"+sum1);
int p=sum1-sum;
System.out.println("missing num is::"+p);
	}

}
