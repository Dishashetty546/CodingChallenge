Graph_node = {
    'S': [('G', 10), ('A', 1)],
    'A': [('B', 2), ('C', 1)],
    'B': [('D', 5)],
    'C': [('D', 3), ('G', 4)],
    'D': [('G', 2)],
}

# to get all the neighbours of node v
def get_neighbours(v):
    return Graph_node.get(v, [])

# initialize all the heuristic data values of n
def h(n):
    H_dist = {
        'S': 5,
        'A': 3,
        'B': 4,
        'C': 2,
        'D': 6,
        'G': 0,
    }
    return H_dist.get(n, float('inf'))

# actual logical part
def astaralgo(start_node, stop_node):
    open_set = set([start_node])
    closed_set = set()
    g = {start_node: 0}
    parent = {start_node: start_node}
    
    while open_set:
        n = None

        for v in open_set:
            if n is None or g[v] + h(v) < g[n] + h(n):
                n = v
        
        if n is None:
            print("Path does not exist")
            return None

        if n == stop_node:
            path = []
            while parent[n] != n:
                path.append(n)
                n = parent[n]
            path.append(start_node)
            path.reverse()
            print("Path found: {}".format(path))
            return path

        for (m, weight) in get_neighbours(n):
            if m not in open_set and m not in closed_set:
                open_set.add(m)
                parent[m] = n
                g[m] = g[n] + weight
            else:
                if g[m] > g[n] + weight:
                    g[m] = g[n] + weight
                    parent[m] = n
                    if m in closed_set:
                        closed_set.remove(m)
                        open_set.add(m)
        
        open_set.remove(n)
        closed_set.add(n)
    
    print("Path does not exist")
    return None

astaralgo('S', 'G')
