class Solution {
    public String getEncryptedString(String s, int k) {
    int n = s.length();
    k = k % n;
    return (s+s).substring(k,k+n);
    }
}