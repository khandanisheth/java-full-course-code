package DSAjava.Stack;

class Op {
    int top1, top2, arr[], size;

    Op(int x) {
        size = x;
        arr = new int[x];
        top1 = -1;
        top2 = x;
    }

    void push1(int x) {
        if (top1 + 1 < top2) {  // ✅ Corrected condition
            arr[++top1] = x;
            System.out.println(top1);
        } else {
            System.out.println("Stack1 Overflow");
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {  // ✅ Corrected condition
            arr[--top2] = x;
            System.out.println(top2);
        } else {
            System.out.println("Stack2 Overflow");
        }
    }

    int pop1() {
        if (top1 >= 0) {
            System.out.println(top1);
            return arr[top1--];
        } else {
            System.out.println("Stack1 Empty");
            return -1;
        }
    }

    int pop2() {
        if (top2 < size) {
            System.out.println(top2);
            return arr[top2++];
        } else {
            System.out.println("Stack2 Empty");
            return -1;
        }
    }
}

public class ImplementTwoStacksOneArray {
    public static void main(String[] args) {
        Op ts = new Op(10);

        ts.push1(10);
        ts.push1(20);
        ts.push1(100);
        ts.push1(200);
   
        ts.push2(30);
        ts.push2(40);
        ts.push2(300);
        ts.push2(400);
        ts.push2(3000);
        ts.push2(4000);

        System.out.println("Popped from Stack1: " + ts.pop1());  // ✅ 20
        System.out.println("Popped from Stack2: " + ts.pop2());  // ✅ 40
    }
}
