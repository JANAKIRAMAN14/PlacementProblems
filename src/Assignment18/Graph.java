package Assignment18;

import java.util.*;

public class Graph {
    List<List<Integer>> adjlist ;
    int num_vertices;
    Graph(int num_vertices){
        this.num_vertices = num_vertices;
        adjlist = new ArrayList<>();
        for(int i = 0 ; i < num_vertices ; i++){
            adjlist.add(new ArrayList<>());
        }
    }
    void addEdge(int source , int destination){
        adjlist.get(source).add(destination);
        adjlist.get(destination).add(source);
    }
    void removeEdge (int source , int destination){
        adjlist.get(source).remove(source);
        adjlist.get(destination).add(source);
    }
    void print() {
        for (int i = 0; i < num_vertices; i++) {
            System.out.print(i+"-->");
            for (Integer neigbour : adjlist.get(i)){
                System.out.print(neigbour + ",");
            }
            System.out.println();
        }
    }
    void bfs(int startvertex){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans  = new ArrayList<>();

        queue.offer(startvertex);
        visited.add(startvertex);
        while (!queue.isEmpty()){
            int cur = queue.poll();
            ans.add(cur);
            for(Integer neigbour : adjlist.get(cur)){
                if(!visited.contains(neigbour)) {
                    queue.offer(neigbour);
                    visited.add(neigbour);
                }
            }
        }
        System.out.println(ans.toString());
    }
    void dfs(int startvertex){
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        List<Integer> ans  = new ArrayList<>();

        st.push(startvertex);


        while (!st.isEmpty()){
            int cur = st.pop();
            if(!visited.contains(cur)){
                ans.add(cur);
                visited.add(cur);
            }

            for(Integer neigbour : adjlist.get(cur)){
                if(!visited.contains(neigbour)){
                    st.push(neigbour);
                }
            }
        }
        System.out.println(ans.toString());
    }
    void dfsIterative(int start){
        Set<Integer> visted = new HashSet<>();
        List<Integer> ans  = new ArrayList<>();
        dfsRecursive(start,visted,ans);
        System.out.println(ans.toString());
    }
    void dfsRecursive(int start , Set<Integer> visted,  List<Integer> ans){

        visted.add(start);
        ans.add(start);
        for(Integer i : adjlist.get(start)){
            if(!visted.contains(i))
                dfsRecursive(i,visted,ans);
        }

    }
    public static void main(String[] args) {
        Graph graph2list = new Graph(5);
        graph2list.addEdge(0,1);
        graph2list.addEdge(0,2);
        graph2list.addEdge(1,4);
        graph2list.addEdge(2,3);
        graph2list.addEdge(3,4);

        // graph2list.print();
        graph2list.dfsIterative(0);
    }
}
