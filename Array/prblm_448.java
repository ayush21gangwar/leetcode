class prblm_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean arr[]=new boolean[nums.length];
List list=new ArrayList<>();
for(int i=0;i<nums.length;i++)
{
arr[nums[i]-1]=true;
}
for(int i=0;i<arr.length;i++)
{
if(arr[i]==false)
{
list.add(i+1);
}
}
return list;
    }
}