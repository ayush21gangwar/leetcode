class prblm_204 {
    public int countPrimes(int n) {
        int arr[] = new int[n];
for (int i=2; i <n; i++)
{
for(int j=i+i;j<n;j=j+i)
{
arr[j]=1;
}

    }
    int result=0;
    for(int i=2;i<arr.length;i++)
    {
        if(arr[i]==0)
        {
            result++;
        }
    }
      return result;
    }
}
