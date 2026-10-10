class Solution {
    public boolean isPalindrome(String s) {

        String testStr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        char[] test = testStr.toCharArray();
        int n = test.length;

        if(test == null || n == 0) return true;
        int left = 0;
        int right = n-1;
        while(left < right)
        {            
            if(test[left] == test[right]) 
            {
                left++;
                right--;
            }
            else{
                return false;
            }
           
        }

    return true;
    }
}
