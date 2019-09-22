//Java Program to print all possible pairs
class PP
{
	static boolean check1(int arr[],int b)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == b)
            {
                return false;
            }
        }
        return true;
    }
	static void perm(int arr[],int brr[],int po,int start,int end)
	{
		if(start>=po)
		{
			for(int i=0;i<po;i++)
			{
				System.out.print(arr[i]+" ");
							
			}
			System.out.println();	
		}
		else{
		for(int i=start;(i<end)&&(check1(brr,i));i++)
		{
			int temp1=arr[start];
			int temp2=arr[i];
			arr[start]=arr[i];
			arr[i]=temp1;
			brr[i]=start;
			perm(arr,brr,po,start+1,end);
			arr[start]=temp1;
			arr[i]=temp2;
			brr[i]=-1;
		}
	}
	}
	public static void main(String[] args) {
		int arr[]={1,2,2,3,4};
		int brr[]= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=-1;
		}
		for(int i=1;i<=arr.length;i++)
		{
			System.out.println("Combinations of "+i+" Elements");
			perm(arr,brr,i,0,arr.length);
		}		
	}
}