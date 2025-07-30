package pk1;

public class protecteddsame {
    public static void main(String args[]) {  
        protectedd b = new protectedd();
        b.myMethod();
    }
}


/* 
 * protected access modifiers को आप class के data member, method और constructor पर apply कर सकते हैं
 *  , class पर नहीं। मतलब किसी class को आप protected declare नहीं कर सकते हैं।
 * 
 * protected access modifiers , same package में accessible तो होगा ही साथ ही इसे Inheritance के
 *  through किसी दूसरे package में भी access कर सकते हैं। इसके लिए protected keyword की ही use 
 * किया जाता है। हालाँकि Inheritance को आप आगे detail में पढ़ेंगे।
 */