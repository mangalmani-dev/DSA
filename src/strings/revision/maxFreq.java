package strings.revision;

public class maxFreq {
    public static void main(String[] args) {
        String s = "aabbbcccddddeee";
         int [] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int)ch-97;
            freq[idx]++;
        }
        // now max freq
        int maxfreq = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            maxfreq = Math.max(maxfreq,freq[i]);
        }

        // to get the max value
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==maxfreq){
                char ch = (char)(i+97);
                System.out.println(ch);
            }
        }
    }
}
