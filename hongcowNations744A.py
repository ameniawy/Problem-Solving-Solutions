
n, m, k = map(int, raw_input().split())
govs = map(int, raw_input().split())
graph = {}
for _ in xrange(m):
    i, j = map(int, raw_input().split())
    if graph.get(i) != None:
        graph[i].append(j)
    else:
        graph[i] = [j]
    if graph.get(j) != None:
        graph[j].append(i)
    else:
        graph[j] = [i]
st = []
visited = [False] * n

def dfs():
    u = st.pop()
    visited[u - 1] = True



print graph
