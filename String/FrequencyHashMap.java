import java.util.HashMap;

class FrequencyHashMap{
    public static void main(String[] args) {
        String Name = "abcdefaxddifklr";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count character frequencies in O(N)
        for (char ch : Name.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print results
        System.out.println("Character frequencies:");
        for (char ch : freqMap.keySet()) {
            System.out.println(ch + " - " + freqMap.get(ch));
        }
    }
}
