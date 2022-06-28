class Solution {
    public int findLucky(int[] arr) {
        int size=arr.length;
int n=-1;
for(int i=0;i<size;i++)
{
int num=0;
for(int j=0;j<size;j++)
{
if(arr[i]==arr[j])
{
num=num+1;
}
}
if(num==arr[i])
{
if(n<arr[i])
{
n=arr[i];
}
}
}
return n;
    }
}