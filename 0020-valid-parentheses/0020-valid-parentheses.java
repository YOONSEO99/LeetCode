class Solution {
    public boolean isValid(String s) {
        // 자바 스택을 사용해서 open은 스택에 쌓고, close는 스택에서 pop(LIFO)했을때 직전이 open이면 true 아니면 false
        Stack<Character> stack = new Stack<>();
        
        // 1. s의 길이가 홀수이면 바로 false -> open되면 반드시 close가 되어야 함
        if(s.length()%2==1){
            return false;
        }else{
            for(int i=0;i<s.length();i++){
                // 2. 문자 하나씩 받아서 비교
                char now = s.charAt(i);
                // 2-1. 문자들이 open 이면 스택에 쌓기
                // 2-2. 문자들이 close면 스택에서 직전 문자를 꺼내서 open인지 확인
                if(now=='('||now=='['||now=='{'){
                    stack.push(now);
                }else if(stack.size()==0){
                    return false;
                    // 3. stack이 비워진 상태에서 pop을 하면 오류가 발생하므로 스택의 크기가 0이면 false 반환
                }else if(now==')'){
                    if(stack.pop()!='('){
                        return false;
                    }
                }else if(now==']'){
                    if(stack.pop()!='['){
                        return false;
                    } 
                }else if(now=='}'){
                    if(stack.pop()!='{'){
                        return false;
                    } 
                }else return true;
            }
        }
        return stack.size()==0;
    }
}