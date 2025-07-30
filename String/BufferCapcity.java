public class BufferCapcity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); 
        System.out.println("Initial Capacity: " + sb.capacity()); // Output: 16
        
        sb.append("123456789ABCDEF12"); 
        System.out.println("Capacity after adding 'Hello World': " + sb.capacity()); // अब भी 14
        
        sb.append(" Java Programming"); 
        System.out.println("Capacity after adding more text: " + sb.capacity()); // अब बढ़ गई (16 * 2 + 2 = 34)
    }
}
