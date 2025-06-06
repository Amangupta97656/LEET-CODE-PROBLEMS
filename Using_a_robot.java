class Solution {
    public String robotWithString(String s) 
    {
        int freq[]=new int[26];

        for(char a:s.toCharArray())
        {
            freq[a-'a']++;
        }
        
        Stack<Character>stk=new Stack<>();
        int ind=0;
        StringBuilder str=new StringBuilder();

        for(char ch:s.toCharArray())
        {
            stk.add(ch);

            freq[ch-'a']--;

            while(ind<26&&freq[ind]==0)
            {
                ind++;
            }
            
            while(stk.isEmpty()==false&&stk.peek()-'a'<=ind)
            {
               str.append(stk.pop());
            }

        }
        while(stk.isEmpty()==false)
        {
           str.append(stk.pop());
        }
        return str.toString();        
    }
}
class pair {
    int count;
    String str = "";
    public pair(int count, String res) {
        this.count = count;
        this.str = res;
    }
}

2ND METHOD: Simulation of string BRUTE FORCE
class Solution {

    public String getreverse(String res) {
        return new StringBuilder(res).reverse().toString();
    }

    public pair getstr(String str, int ind, char a) {
        StringBuilder temp = new StringBuilder();
        int count = 0;
        for (int i = ind; i >= 0; i--) {
            if (str.charAt(i) == a) {
                count++;
            } else {
                temp.insert(0, str.charAt(i));
            }
        }
        return new pair(count, temp.toString());
    }

    public String robotWithString(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder prev = new StringBuilder();

        for (char a = 'a'; a <= 'z'; a++) {

            if (prev.indexOf(String.valueOf(a)) >= 0 && s.length() > 0) {
                int i = prev.length() - 1;
                int count = 0;
                while (i >= 0 && prev.charAt(i) <= a) {
                    res.append(prev.charAt(i));
                    i--;
                    count++;
                }
                prev.setLength(prev.length() - count); 
            }

            int ind = s.lastIndexOf(a);
            if (ind == -1)
                continue;

            pair p = getstr(s, ind, a);
            int c = p.count;
            prev.append(p.str);
            while (c-- > 0) {
                res.append(a);
            }
            s = s.substring(ind + 1);
        }

        res.append(new StringBuilder(prev).reverse());
        return res.toString();
    }
}