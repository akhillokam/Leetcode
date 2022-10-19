Number of Distinct Substrings in a String O(n^2)
// To store distinct output subStrings 
    HashSet<String> us = new HashSet<String>(); 
  
    // Traverse through the given String and 
    // one by one generate subStrings beginning 
    // from s[i]. 
    for (int i = 0; i < s.length(); ++i) 
    { 
  
        // One by one generate subStrings ending 
        // with s[j] 
        String ss = ""; 
        for (int j = i; j < s.length(); ++j)  
        { 
            ss = ss + s.charAt(j); 
            us.add(ss); 
        } 
    } 
	
	return us.size();
