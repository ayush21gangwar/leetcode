class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         int count =0;
         Arrays.sort(boxTypes, (a, b) -> a[1] - b[1]);
 for(int i=boxTypes.length-1;i>=0;i--){
        int units = boxTypes[i][1];
           int  boxes=  boxTypes[i][0];
            System.out.println(units);
             if(boxes <= truckSize && truckSize>0){
                count += boxes * units;
                truckSize -= boxes;
             }
            else{
                 if(boxes > truckSize && truckSize>0){
                count += truckSize*units;
                truckSize -= boxes;
         }
            }
        }
        return count;
    }
}