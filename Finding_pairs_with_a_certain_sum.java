import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner sc= new Scanner(System.in);

int n=sc.nextInt();

int a[]=new int[n];

for(int i=0;i<a.length;i++){



a[i]=sc.nextInt();}

int m=sc.nextInt();

int b[]=new int[m];



for(int j=0;j<b.length;j++){

b[j]=sc.nextInt();}



for(int i=0;i<a.length;i++){

for(int j=0;j<b.length;j++) {



if(a[i]==b[j]&&a[i]%2!=0) {

System.out.print(a[i]+" ");}}}

boolean c=false;

for(int i=0;i<a.length;i++){

for(int j=0;j<a.length;j++){

if(a[i]==b[j]&&a[i]%2!=0) {

c=false;
class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private List<Integer> sortedNums2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.sortedNums2 = new ArrayList<>();
        for (int num : nums2) {
            sortedNums2.add(num);
        }
        Collections.sort(sortedNums2);
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];
        int newVal = oldVal + val;
        nums2[index] = newVal;

        // Remove oldVal from sortedNums2
        int pos = Collections.binarySearch(sortedNums2, oldVal);
        sortedNums2.remove(pos);

        // Insert newVal in correct position to keep list sorted
        int insertPos = Collections.binarySearch(sortedNums2, newVal);
        if (insertPos < 0) insertPos = -insertPos - 1;
        sortedNums2.add(insertPos, newVal);
    }
    
    public int count(int tot) {
        int count = 0;
        for (int num1 : nums1) {
            int complement = tot - num1;
            count += countOccurrences(sortedNums2, complement);
        }
        return count;
    }

    private int countOccurrences(List<Integer> list, int target) {
        // Binary search lower and upper bound
        int left = lowerBound(list, target);
        int right = upperBound(list, target);
        return right - left;
    }

    private int lowerBound(List<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    private int upperBound(List<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}


break;}



else{

c=true;}}}

if(c){

System.out.print("No common odd elements found.");}}}