class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
        
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){// tiro tudo da primeira queue e adiciono no final da queue q2 
            q2.offer(q1.poll());
        }
        q1.offer(x); // meto o x no inicio do q1
        while(!q2.isEmpty()){// volta a meter tudo o que foi tirado de q1 para q2
            q1.offer(q2.poll());
        }
    }
    
    public int pop() {
        return q1.poll();// retira o elemento mais a cima da qeueu 

        
    }
    
    public int top() {
        return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
