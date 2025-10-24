import java.util.*;

class  Solution {
  boolean isBeatiful(int n) {
    int d, i, m = 0;
    ;
    int p[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    while (n > 0) {
      d = n % 10;
      n = n / 10;
     //counts each number, adds it to thier index numbner, for 
     //example,
     //p[4] adds 1 to the 4th place
      p[d]++;
    }
     //checka if allk of the values are correct ie, 0 times or n 
     //number is n times, if all true m becomes 10
    for (i = 0; i < 10; i++) {
      if ((p[i] == i) || (p[i] == 0))
        m++;
    }//returns if it is a beatiful number
    if (m == 10)
      return true;
    else
      return false;
  }
   // checks the closest larger beatiful nuymber, through increment 
   //of 1 eah time
  public int nextBeautifulNumber(int n) {
    Solution ob = new Solution();
    int i = n + 1;
    while (!ob.isBeatiful(i)) {
      i++;
    }
    return i;
  }
//main class for input and output
  public static void main(String[] args) {
    Solution ob = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    System.out.println(ob.nextBeautifulNumber(n));

  }
}