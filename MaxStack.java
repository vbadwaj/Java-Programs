class Result {
    static int val;
    public static List<Integer> getMax(List<String> operations) {
            Stack<Integer> stack=new Stack<>();
        //Stack<Integer> mstack=new Stack<>();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<operations.size();i++){
            
            String[] p=operations.get(i).split(" ");
            int op=Integer.parseInt(p[0]);
            int num=0;
            if(op==1){
                num=Integer.parseInt(p[1]);
               if(stack.isEmpty()){
                   stack.push(num);
                   val=num;
               }
               else if(num>val){
                   stack.push((2*num)-val);
                   val=num;
               }
               else{
                   stack.push(num);
               }
            }
            else if(op==2){
                if(stack.peek()>val){
                    val=(2*val)-stack.pop();
                }
                else stack.pop();        
            }
            else if(op==3){
            arr.add(val);
        }
        }
        return arr;

    }

}
