import Stack.LinkedStack;

public class TestPair {
    private String exp;     // Expression
    private String symbol;  // Symbol
    private String openPair;    // open_Pair


    public boolean PairCheck(String exp) {
        LinkedStack linkedStack = new LinkedStack();    // Stack.Stack = null;
        this.exp = exp;

        int i = 0;
        while (i < this.exp.length()) {
            this.symbol = exp.substring(i, i+1);   // exp Slicing
            //System.out.println("symbol: " + this.symbol);

            switch (this.symbol) {
                case "(": case "{": case "[":
                    linkedStack.push(this.symbol);
                    break;

                case ")":
                    this.openPair = linkedStack.pop();
                    //System.out.println("pop ')': " + this.openPair);

                    if (!this.openPair.equals("(")) {
                        return false;
                    }
                    break;

                case "}":
                    this.openPair = linkedStack.pop();
                    //System.out.println("pop '}': " + this.openPair);

                    if (!this.openPair.equals("{")) {
                        return false;
                    }
                    break;

                case "]":
                    this.openPair = linkedStack.pop();
                    //System.out.println("pop ']': " + this.openPair);

                    if(!this.openPair.equals("[")) {
                        return false;
                    }
                    break;

                default:
                    //System.out.println("None");
                    break;
            }
            i++;
        }

        if (linkedStack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "TestPair: " + exp;
    }
}
