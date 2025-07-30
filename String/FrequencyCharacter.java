class FrequencyCharacter{
        public static void main(String[] args) {
        String Name = "abcdefaxddifklr";
        char[] fName = new char[Name.length()];
        
        char o = '0';  // '0' as character
        int c;
        
        for(int i = 0; i < Name.length(); i++) {
            c = 1;
            for(int j = i + 1; j < Name.length(); j++) {
                if(Name.charAt(i) == Name.charAt(j)) {
                    c++;
                    fName[j] = o;  // Mark duplicates as '0'
                }
            }
            
            if(fName[i] != o) {
                fName[i] = (char)(c + '0'); // Convert int to char
            }
        }

        // Print results
        System.out.println("Character frequencies:");
        for(int i = 0; i < Name.length(); i++) {
            if(fName[i] != o) {
                System.out.println(Name.charAt(i) + " - " + fName[i]);
            }
        }
    }
}
