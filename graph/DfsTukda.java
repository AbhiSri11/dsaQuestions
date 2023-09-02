package com.graph;

import java.util.ArrayList;

public class DfsTukda {
    // egde class
    static class edge{
        int src;
        int des;
        public edge(int s,int d){
            this.src = s;
            this.des = d;
        }
    }
    public static void dfs(ArrayList<Introduction.edge>[] graph, int curr, boolean[] vis){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            if(vis[graph[curr].get(i).des] ==false){
                dfs(graph,graph[curr].get(i).des,vis);
            }
        }
    }

    // main class
    public static void main(String[] args) {
        int v =7;
        ArrayList<Introduction.edge>[] graph = new ArrayList[v];

        createGraph(graph);

        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++){
            if(vis[i]==false){
                dfs(graph,0,vis);
            }
        }

    }
    // graph banane ke liye
    public static void createGraph(ArrayList<Introduction.edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Introduction.edge>();
        }
        /*  1---3
           /    | \
          0     |  5---6
           \    | /
            2---4
         */
        graph[0].add(new Introduction.edge(0,1));
        graph[0].add(new Introduction.edge(0,2));

        graph[1].add(new Introduction.edge(1,0));
        graph[1].add(new Introduction.edge(1,3));

        graph[2].add(new Introduction.edge(2,0));
        graph[2].add(new Introduction.edge(2,4));

        graph[3].add(new Introduction.edge(3,1));
        graph[3].add(new Introduction.edge(3,4));
        graph[3].add(new Introduction.edge(3,5));

        graph[4].add(new Introduction.edge(4,2));
        graph[4].add(new Introduction.edge(4,3));
        graph[4].add(new Introduction.edge(4,5));

        graph[5].add(new Introduction.edge(5,3));
        graph[5].add(new Introduction.edge(5,4));
        graph[5].add(new Introduction.edge(5,6));

        graph[6].add(new Introduction.edge(6,5));
    }
}
