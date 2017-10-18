
# UNSOLVED 745C or 744A
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

visited = [0]*n

def dfs(u):
    """
        Checks if there not exists a path between "u" and a government
    """
    visited[u - 1] = 1
    #print u
    flag = True
    if graph.get(u) != None:
        for v in graph[u]:
            if v in govs:
                return False
            elif visited[v - 1] == 0:
                flag = flag and dfs(v)

    return flag


for i in xrange(n):
    node = []
    if graph.get(i + 1):
        node = graph[i + 1]

    for j in xrange(n):
        if i == j or j in node:
            continue
        else:
            if graph.get(i + 1):
                graph[i + 1].append(j + 1)
            else:
                graph[i + 1] = [j + 1]

print dfs(1)


print graph
