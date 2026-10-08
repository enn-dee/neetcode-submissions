class Solution {

    public String encode(List<String> strs) {

    String ans = "";

    for (String str : strs) {
        ans += str.length() + "#" + str;
    }

    return ans;
}

    public List<String> decode(String str) {

    List<String> ans = new ArrayList<>();

    int i = 0;

    while (i < str.length()) {

        int j = i;

        // Find #
        while (str.charAt(j) != '#') {
            j++;
        }

        // Get length
        int length = Integer.parseInt(str.substring(i, j));

        // Move past #
        j++;

        // Get actual string
        String word = str.substring(j, j + length);

        ans.add(word);

        // Move to next encoded string
        i = j + length;
    }

    return ans;
}
}
