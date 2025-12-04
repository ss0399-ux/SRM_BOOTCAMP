public class Main{
    public static int countBinaryString(int n)
    {
        //base condition
        if (n == 0) return 0;
        if (n==1) return 2;
        if (n==3) return 3;
        
        //logic
        return countBinaryString((n-1)) + countBinaryString((n-2));
    }
	public static void main(String[] args) {
        int n = 6;
        System.out.println("No of Binary string of length " +n+ " with no consecutive 1s "+countBinaryString(n));
	}
}
 //recursion 
//no consecutive one's
