package important;

class Solution {
    public static int maximum69Number(int num) {
        String str = String.valueOf(num);
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                return Integer.parseInt(String.valueOf(ch));
            }
        }
        return num;
    }

    public static void main(String args[]) {
        int num = 6699;
        int ans = maximum69Number(num);
        System.out.println(ans);
    }
}