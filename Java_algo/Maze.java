import java.util.*;
import java.io.*;
public class Maze {// in the first line we will take the number of nodes and  edges
	static char[][] graph;
	static boolean [][]visited;
	static char [][]maze;
	static int dx[]={1,0,-1,0};
	static int dy[]={0,1,0,-1};
	static int  maxr;
	static int maxc;
	
	
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
	}
	
	public static boolean dfs(int r, int c){// dfs for maze
		visited[r][c] = true;
		for(int i=0;i<dx.length;i++){
			int newr= r+dx[i];
			int newc= c+dy[i];
			
			if(newr>=0 && newr <maxr && newc>=0 && newc <maxc && !visited[newr][newc] && graph[newr][newc]!= '#'){
				if(graph[newr][newc]=='D')
					return true;
				dfs(newr,newc);
			}
			
			
		}// assume wall is '#' and destination is 'D'
				
		return false;
				
		}
			
		
	}


