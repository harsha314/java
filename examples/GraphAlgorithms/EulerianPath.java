package GraphAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EulerianPath {
  private int findStartNode(int n, int[] in, int[] out) {
    int start_nodes = 0, end_nodes = 0;
    int start_node = -1, other_node = -1;
    for (int i = 0; i < n; ++i) {
      if (out[i] == in[i]) {
        if (out[i] > 1)
          other_node = i;
        continue;
      } else if (out[i] - in[i] == 1) {
        ++start_nodes;
        start_node = i;
      } else if (in[i] - out[i] == 1)
        ++end_nodes;
      else
        return -1;
    }
    if (start_nodes == 0 && end_nodes == 0)
      return other_node;
    else if (start_nodes == 1 && end_nodes == 1)
      return start_node;
    return -1;
  }

  public int[] eulerianPath(int n, int[][] edges) {
    int m = edges.length;
    List<Integer>[] adj = new List[n];
    for (int i = 0; i < n; ++i)
      adj[i] = new ArrayList<>();
    int[] in = new int[n];
    int[] out = new int[n];
    for (int[] edge : edges) {
      int u = edge[0], v = edge[1];
      ++in[v];
      ++out[u];
    }
    int startNode = findStartNode(n, in, out);
    if (startNode == -1)
      return new int[0];
    LinkedList<Integer> path = new LinkedList<>();
    dfs(startNode, adj, out, path);
    int[] pathArray = path.stream().mapToInt(Integer::valueOf).toArray();
    return pathArray;
  }

  void dfs(int u, List<Integer>[] adj, int[] out, LinkedList<Integer> path) {
    while (out[u] > 0) {
      out[u] -= 1;
      int v = adj[u].get(out[u]);
      dfs(v, adj, out, path);
    }
    path.addFirst(u);
  }
}
