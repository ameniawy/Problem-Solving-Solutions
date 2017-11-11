import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class IsItATree {
	static ArrayList<Integer>[] graph;
	static boolean []visited;
	
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nodes = Integer.parseInt(st.nextToken());
		int edges = Integer.parseInt(st.nextToken());
		graph = new ArrayList[nodes];
		
		for(int i=0;i<nodes;i++)
			graph[i]=new ArrayList<Integer>();
		
		visited= new boolean[nodes];
		
		for(int i=0;i<edges;i++){
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int x =Integer.parseInt(st2.nextToken())-1; int y =Integer.parseInt(st2.nextToken())-1;
			graph[x].add(y);
			graph[y].add(x);
			
		}
		
		if(nodes!=edges+1){
			System.out.println("NO");
		}
		else{
			dfs(0);
			if(isit())
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
		
	}
	public static void dfs(int node){
		visited[node] = true;
		for(int i=0;i<graph[node].size();i++){
			int destination= graph[node].get(i);
			if(!visited[destination])
				dfs(destination);
			}		
		}
	
	public static boolean isit(){
		for(int i=0;i<visited.length;i++){
			if(!visited[i]){
				return false;
			}
			
		}
		return true;
	}

}
