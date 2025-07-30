package pk1;

/* Java default Access Modifiers */
   class DefaultCls {
     // define deault method
     /* अगर आप class में modifiers define नहीं करते हैं तो वह property / 
     method as a default treat की जाती है। default modifiers सिर्फ same package में access
      किया जा सकता है। किसी दूसरे package में default modifiers को access नहीं कर सकते हैं। 
      यह private से थोड़ी ज्यादा accessibility provide कराता है लेकिन protected, और public से कम। */
     void myMethod() {
    System.out.println("Default method in packageA");
  }  
}
