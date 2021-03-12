public class Suite2 {
  
  public static String game(long n) {
    String ans;
    if(n%2==0) ans="["+String.valueOf(n*n/2)+"]";
    else ans="["+String.valueOf(n*n)+", 2]";
    return ans;
  }
}