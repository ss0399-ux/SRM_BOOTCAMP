public class Main
{
    public boolean palindromeCheck(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<right){
        if (s.charAt(left) != s.charAt(right)){
            return false;
        }
        left++;
        right--;
        }
        return true;
    }
    
	public static void main(String[] args) {
        Main main = new Main();
        String str = "hanah";
        if (main.palindromeCheck(str)){
            System.out.println(str + "is a palindrome");
        }
        else{
            System.out.println(str+ "is not a palindrome");
        }
	}
}
