class Solution {
    public int minimumPushes(String word) {
          var res = 0;
    var cnt = 0;
    var freq = new int[26];

    for (var c : word.toCharArray())
      freq[c - 'a']++;

    Arrays.sort(freq);

    for (var i = 25; i >= 0; i--)
      if (freq[i] > 0)   
        res += freq[i] * (cnt++ / 8 + 1);     
    
    return res;
  }
}
