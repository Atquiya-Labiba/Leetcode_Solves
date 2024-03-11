public class PeakIndex {
    public static void main(String[] args) {
        int [] arr={0,2,1,0};
        int result=peakindex(arr);
        System.out.println(result);
        
    }

    static int peakindex(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int middle=start+(end-start)/2;
            if(arr[middle]>arr[middle+1]){
                end=middle;
            }
            else {
                start=middle+1;
            }            
        }
        return start;
    }
}
