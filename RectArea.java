class Result {

    /*
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h) {
        int i=0;
        int maxarea=0;
        int currarea=0;
        int top=0;
        Stack<Integer> stack=new Stack<Integer>();
        while(i<h.size()){
            if(stack.isEmpty() || h.get(stack.peek())<=h.get(i)){
                //System.out.println(i+" "+"if");
                stack.push(i++);
            }
            else{
                top=stack.pop();
                int width=0;
                if(stack.isEmpty())width=i;
                else width=i-stack.peek()-1;
                //System.out.println(i+" "+"else"+" "+stack.peek());
                currarea=h.get(top)*width;
                maxarea=Math.max(maxarea,currarea);
            }
        }
        while(!stack.isEmpty()){
            top=stack.pop();
            int width=0;
            if(stack.isEmpty())width=i;
            else width=i-stack.peek()-1;
              //System.out.println(i+" "+"else"+" "+stack.peek());
            currarea=h.get(top)*width;
            maxarea=Math.max(maxarea,currarea);
        }
        return maxarea;

    }

}
