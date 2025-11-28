class Solution {
    ArrayList<Integer>[] adj;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        adj = new ArrayList[n];
        ans = 0;
        for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();

        for(int[] edge: edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        
        boolean[] visit = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visit[i]){
                dfsDiv(i, visit, k, values);
            }
        }
        return ans;
    }
    int ans;
    public int dfsDiv(int node, boolean[] visit, int k, int[] values){
        visit[node] = true;
        int div = values[node]%k;

        for(int nxt: adj[node]){
            if(!visit[nxt]){
                div += dfsDiv(nxt, visit, k, values);
            }
        }
        div %= k;
        if(div == 0) ans++;
        return div;
    }
}