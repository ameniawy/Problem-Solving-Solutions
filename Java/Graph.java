import java.util.*;
import java.io.*;
public class Graph {// in the first line we will take the number of nodes and  edges
	static ArrayList<Integer>[] graph;
	static boolean []visited;
	
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nodes= Integer.parseInt(st.nextToken());
		int edges= Integer.parseInt(st.nextToken());
		graph = new ArrayList[nodes];
		
		for(int i=0;i<nodes;i++)
			graph[i]=new ArrayList<Integer>();
		
		for(int i=0;i<edges;i++){
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			graph[Integer.parseInt(st2.nextToken())].add(Integer.parseInt(st2.nextToken()));
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
			
		
	}


