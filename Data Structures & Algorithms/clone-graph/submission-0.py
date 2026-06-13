"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node:
            return None

        visited =  {}
        visited[node] = Node(node.val)
        q = deque([node])

        while q:#bfs
            cur = q.popleft()
            for n in cur.neighbors:
                if n not in visited:#handle cycles
                    visited[n] = Node(n.val)
                    q.append(n)
                visited[cur].neighbors.append(visited[n])#append each neighbor for each node
        return visited[node]        