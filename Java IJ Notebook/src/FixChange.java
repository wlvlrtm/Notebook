import Stack.LinkedStack;

public class FixChange {
    private String exp; // 수식
    private String result = ""; // 결과값

    public String ChangeToPostfix (String exp) {
        String symbol;
        LinkedStack linkedStack = new LinkedStack();
        this.exp = exp;

        System.out.println(this.exp);

        int i = 0;
        while (i < this.exp.length()) {
            symbol = exp.substring(i, i+1);
            switch (symbol) {
                case "(": case "{": case "[": case " ": // 좌측 괄호 무시
                    break;
                case "*": case "/": case "+": case "-": // 연산자 처리
                    linkedStack.push(symbol);  // 연산차 push
                    break;
                case ")": case "}": case "]":   // 우측 괄호 처리
                    this.result += linkedStack.pop();    // pop
                    break;
                default:    // 피 연산자 처리
                    this.result += symbol;
                    break;
            }
            i++;
        }

        while (!linkedStack.isEmpty()) {    // 수식이 끝났는데 스택이 비어있지 않을 경우,
            this.result += linkedStack.pop();    // 스택에 남은 연산자 모두 pop
        }
        return this.result;  // 결과 반환
    }


    public void EvalPostFix(String exp) {
        String num = "";            // 피연산자
        String temp = "";           // 슬라이싱 된 수식 값 저장
        boolean isError = false;    // 에러 발생 여부 카운트
        int oprCount = 0;           // 연산자 개수 카운트
        int stcCount = 0;           // 스택 개수 카운트
        int num1;                   // 피연산자(좌)
        int num2;                   // 피연산자(우)


        LinkedStack linkedStack = new LinkedStack();    // 새로운 스택 생성

        this.exp = exp; // 수식 할당

        System.out.println("후위 표기 수식: " + this.exp);    // 후위 표기 수식 출력

        int i = 0;
        while (i < this.exp.length() && !isError) {
            temp = this.exp.substring(i, i+1);  // 수식 슬라이싱

            switch (temp) {
                case "+":
                    oprCount++; // 연산자 개수 +1

                    if (linkedStack.size() >= 2) {  // 스택에 피연산자가 최소 2개 이상 있을 경우,
                        num2 = Integer.parseInt(linkedStack.pop()); // 피연산자(우) pop
                        num1 = Integer.parseInt(linkedStack.pop()); // 피연산자(좌) pop
                        num = Integer.toString(num1 + num2);    // num = num1 + num2
                        linkedStack.push(num);  // 연산 결과 push
                        num = "";   // num 변수 초기화
                        //System.out.println("peek (+): " + linkedStack.peek());
                    }
                    else {
                        isError = true;
                        this.result = "잘못된 수식 : 피연산자가 모자랍니다.";
                    }
                    break;
                case "-":
                    oprCount++; // 연산자 개수 +1

                    if (linkedStack.size() >= 2) {
                        num2 = Integer.parseInt(linkedStack.pop()); // 피연산자(우) pop
                        num1 = Integer.parseInt(linkedStack.pop()); // 피연산자(좌) pop
                        num = Integer.toString(num1 - num2);    // num = num1 + num2
                        linkedStack.push(num);  // 연산 결과 push
                        num = "";   // num 변수 초기화
                        //System.out.println("peek (-): " + linkedStack.peek());
                    }
                    else {
                        isError = true;
                        this.result = "잘못된 수식 : 피연산자가 모자랍니다.";
                    }
                    break;
                case "*":
                    oprCount++; // 연산자 개수 +1

                    if (linkedStack.size() >= 2) {
                        num2 = Integer.parseInt(linkedStack.pop()); // 피연산자(우) pop
                        num1 = Integer.parseInt(linkedStack.pop()); // 피연산자(좌) pop
                        num = Integer.toString(num1 * num2);    // num = num1 + num2
                        linkedStack.push(num);  // 연산 결과 push
                        num = "";   // num 변수 초기화
                        //System.out.println("peek (*): " + linkedStack.peek());
                    }
                    else {
                        isError = true;
                        this.result = "잘못된 수식 : 피연산자가 모자랍니다.";
                    }
                    break;
                case "/":
                    oprCount++; // 연산자 개수 +1

                    if (linkedStack.size() >= 2) {
                        num2 = Integer.parseInt(linkedStack.pop()); // 피연산자(우) pop
                        num1 = Integer.parseInt(linkedStack.pop()); // 피연산자(좌) pop
                        num = Integer.toString(num1 / num2);    // num = num1 + num2
                        linkedStack.push(num);  // 연산 결과 push
                        num = "";   // num 변수 초기화
                        //System.out.println("peek (/): " + linkedStack.peek());
                    }
                    else {
                        isError = true;
                        this.result = "잘못된 수식 : 피연산자가 모자랍니다.";
                    }
                    break;
                case " ":
                    if (!num.equals("")) {  // num 변수가 공백이 아닐 때 temp 변수가 공백이면,
                        linkedStack.push(num);  // 피연산자를 스택에 push
                        stcCount++;     // 피연산자 개수 +1
                        num = "";   // num 변수 초기화
                    }
                    break;
                default:
                    if (temp.charAt(0) >= 48 && temp.charAt(0) <= 57) { // 피연산자 발견 시,
                        num += temp;    // 피연산자 저장
                    }
                    else {  // 연산자, 피연산자 모두 해당되지 않을 경우,
                        isError = true;
                        this.result = "잘못된 수식 : 정의되지 않은 연산자입니다.";
                    }
                    break;
            }
            i++;
        }

        //System.out.println("stcCount: " + stcCount);
        //System.out.println("oprCount: " + oprCount);


        if (!isError && oprCount < stcCount-1) {    // 에러가 발생하지 않았고, 피연산자가 연산자보다 많을 경우,
            this.result = "잘못된 수식 : 피연산자가 남습니다.";
        }
        else if (!isError && this.result.equals("")) {  // 에러가 발생하지 않았고, result 변수가 공백일 경우,
            this.result = "결과 = " + linkedStack.peek();   // 스택의 top peek
        }

        System.out.println(this.result);    // 결과 출력
        this.result = "";   // result 변수 초기화
    }
}