import java.util.ArrayList;
public class Graph 
{
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int [][] adjencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList)
    {
        this.nodeList = nodeList;
        adjencyMatrix = new int[nodeList.size()][nodeList.size()];

    }

    public void addUndirectedEdge(int i, int j)
    {
        adjencyMatrix[i][j] = 1;
        adjencyMatrix[j][i] = 1;
    }

    public String toString() 
    {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) 
        {
          s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) 
        {
          s.append(nodeList.get(i).name + ": ");
          for (int j : adjencyMatrix[i]) 
          {
            s.append((j) + " ");
          }
          s.append("\n");
        }
        return s.toString();
      }
}
