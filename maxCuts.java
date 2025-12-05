public class Main
{
    public static int maxCuts(int n, int a, int b, int c){
        //base condition 
        if (n==0) return 0;
        if (n<0) return -1;
        
        //logic where n is total, n-a becomes total minus a cm
        
        int resA = maxCuts(n-a, a, b, c);
        int resB = maxCuts(n-b, a, b, c);
        int resC = maxCuts(n-c, a, b, c);
        
        int result = Math.max(resA, Math.max(resB, resC));
        if (result == -1) return -1;
        
        return result+1;
    }
	public static void main(String[] args) {
	    int N=13;
	    int a =5;
	    int b=3;
	    int c=2;
	    int ans = maxCuts(N, a, b, c);
	    System.out.println(ans);

	}
}
