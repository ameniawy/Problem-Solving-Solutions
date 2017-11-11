import java.util.*;
public class BFS {
	static ArrayList<Integer>graph[];
	static int n;
	static boolean visited[]= new boolean[n];
	
	static int src;
	static int distance[]= new int[n];
	
	
	public static void bfs(){//traversing the graph using bfs
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(0);
		visited[0]=true;
		int u =0;
		while(!q.isEmpty()){
			u= q.remove();
			System.out.println(u);
		
			for(int i=0;i<graph[u].size();i++){
				int v= graph[u].get(i);
				if(!visited[v]){
					visited[v]=true;
					q.add(v);
				}
			
			}
		}
	}
	
	public static void shortest(int src){//finding shortest path for un-weighted graph
		Arrays.fill(distance,-1);
		Queue<Integer> q=new LinkedList<Integer>();
		
		distance[src]=0;
		int u=0;
		while(!q.isEmpty()){
			u= q.remove();
		}
		for(int i=0;i<graph[u].size();i++){
			int v= graph[u].get(i);
			if(distance[v]==-1){
				distance[v]=distance[u]+1;
				q.add(v);
			}
		
		
		
		}
	}
	
}
