class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer[]> finalAnsList = new ArrayList();
        Arrays.sort(intervals,new CustomSort());
        int currentX, currentY;
        currentX = intervals[0][0];
        currentY = intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            int tempX = intervals[i][0];
            int tempY = intervals[i][1];
            boolean isIntersecting = areIntervalsIntersecting(currentX,currentY,tempX,tempY);
            System.out.println(isIntersecting);
            if(isIntersecting) 
            {
                currentX = Math.min(currentX,tempX);
                currentY = Math.max(currentY,tempY);
            }
            else
            {
                finalAnsList.add(new Integer[]{currentX,currentY});
                currentX = tempX;
                currentY = tempY;
            }
        }
        finalAnsList.add(new Integer[]{currentX,currentY});
        int[][] finalAnsArray = new int[finalAnsList.size()][2];
        for(int i=0;i<finalAnsList.size();i++)
        {
            Integer[] returnedArrayFromFinalAnsList = finalAnsList.get(i);
            finalAnsArray[i][0] = returnedArrayFromFinalAnsList[0];
            finalAnsArray[i][1] = returnedArrayFromFinalAnsList[1];
        }
        return finalAnsArray;
    }
    private boolean areIntervalsIntersecting(int start1, int end1, int start2, int end2)
    {
        if(end1>=start2)
        {
            return true;
        }   
        else 
        {
            return false;
        }
    }
}
class CustomSort implements Comparator<int[]>{
    public int compare(int[] array1, int[] array2)
    {
        if(array1[0]>array2[0])
        return 1;
        else if(array1[0]== array2[0])
        return 0;
        else return -1;
    }
    
}