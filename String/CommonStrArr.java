

public class CommonStrArr {
    public static void main(String[] args) {
        String[] array1 = {"programming", "language", "java"};
        String[] array2 = {"coding", "language", "java", "python"};

        for (String str1 : array1) {
            for (String str2 : array2) {
                if (str1.equals(str2)) {
                    System.out.println(str1);
                    break;
                }
            }
        }
    }
}
