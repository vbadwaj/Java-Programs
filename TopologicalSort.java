class Solution
{
    static int pos;
    static int[] sol;
    static boolean[] visited;
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        visited=new boolean[V];
        sol=new int[V];
        pos=V-1;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                DFS(i,adj);
            }
        }
        return sol;
    }
    static void DFS(int curr, ArrayList<ArrayList<Integer>> adj){
        visited[curr]=true;
        for(int k=0;k<adj.get(curr).size();k++){
            if(!visited[adj.get(curr).get(k)]){
                DFS(adj.get(curr).get(k),adj);
            }
        }
        sol[pos--]=curr;
    }
}
