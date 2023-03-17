class Solution 
{
    public int search(int[] A, int target) 
    {
      int start = 0;
		  int end = A.length - 1;
        
      while(start <= end){
        int mid = start + (end - start) / 2;
        if(target == A[mid])
				  return mid;
			  else if(target < A[mid])
           end = mid - 1;
        else 
           start = mid + 1;
        }
        return -1;
    }
}
