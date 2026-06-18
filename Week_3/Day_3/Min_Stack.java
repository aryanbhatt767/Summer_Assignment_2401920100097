class MinStack {
     Stack<Integer> st=new Stack<>(); // regular stack
        Stack<Integer> minStack=new Stack<>(); // holds minimum el

    public MinStack() {
       

    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty()||minStack.peek()>val )
        minStack.push(val); 

        else
        minStack.add(minStack.peek());
        
    }
    
    public void pop() {
        if(st.isEmpty())
        return;
        st.pop();
        minStack.pop();
        
    }
    
    public int top() {
        if(st.isEmpty())
        return -1;

        return st.peek();
        
    }
    
    public int getMin() {

        if(minStack.isEmpty())
        return -1;

        return minStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */