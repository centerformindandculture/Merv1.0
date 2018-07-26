package merv_1_0_3;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Random;
import org.graphstream.algorithm.generator.BarabasiAlbertGenerator;
import org.graphstream.algorithm.generator.BaseGenerator;
import org.graphstream.algorithm.generator.RandomGenerator;
import org.graphstream.algorithm.generator.WattsStrogatzGenerator;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;






























































public class SocialNetwork
{
  public static String[] NETWORK_TYPE_LIST = { "Small World", "Preferential Attachment", "Random", "Ego" };
  public static int SMALL_WORLD = 0;
  public static int PREF_ATTACH = 1;
  public static int RANDOM = 2;
  public static int EGO = 3;
  
  public static String[] WEIGHT_TYPE_LIST = { "Constant", "Uniform" };
  public static int CONSTANT = 0;
  public static int UNIFORM = 1;
  

  public String networkType;
  

  public double[] networkParams;
  

  public String weightType;
  

  public double[] weightParams;
  

  public Graph graph;
  
  public BaseGenerator gen;
  
  double[][] network;
  

  public SocialNetwork()
  {
    networkType = NETWORK_TYPE_LIST[SMALL_WORLD];
    graph = new SingleGraph("Default Network - Small World");
    


    networkParams = new double[3];
    networkParams[0] = 20.0D;
    networkParams[1] = 2.0D;
    networkParams[2] = 0.5D;
    
    int numberOfNodes = (int)networkParams[0];
    int nearestNeighborConnectivity = (int)networkParams[1];
    double probabilityOfConnect = networkParams[2];
    
    gen = new WattsStrogatzGenerator(numberOfNodes, nearestNeighborConnectivity, probabilityOfConnect);
    
    gen.addSink(graph);
    gen.begin();
    while (gen.nextEvents()) {}
    gen.end();
    
    for (Edge e : graph.getEachEdge()) {
      e.setAttribute("weight", new Object[] { Double.valueOf(Math.random()) });
    }
    
    network = new double[graph.getNodeCount()][graph.getNodeCount()];
    Iterator localIterator2;
    for (??? = graph.getEachNode().iterator(); ???.hasNext(); 
        localIterator2.hasNext())
    {
      Node n = (Node)???.next();
      localIterator2 = n.getEachEdge().iterator(); continue;Edge e = (Edge)localIterator2.next();
      int x = Integer.parseInt(n.getId());
      int y = Integer.parseInt(e.getOpposite(n).getId());
      network[x][y] = Double.parseDouble(e.getAttribute("weight").toString());
    }
  }
  


  public SocialNetwork(String graphType, double[] netParams, long randomSeed)
  {
    int typeIndex = 0;
    for (int i = 0; i < NETWORK_TYPE_LIST.length; i++)
    {
      if (graphType.equals(NETWORK_TYPE_LIST[i]))
      {
        typeIndex = i; }
    }
    int i;
    if (typeIndex == EGO)
    {
      networkType = NETWORK_TYPE_LIST[EGO];
      int numberOfNodes = (int)netParams[0];
      EgoNetwork enet = new EgoNetwork(numberOfNodes);
      
      graph = new SingleGraph(networkType);
      network = enet.getNetworkAsMatrix();
      for (int i = 0; i < network.length; i++)
      {
        graph.addNode(i);
      }
      for (int i = 0; i < network.length; i++)
      {
        for (int j = 0; j < network[0].length; j++)
        {
          if (network[i][j] > 0.0D)
          {
            graph.addEdge(i + "-" + j, i, j, true);
          }
        }
        for (Edge e : graph.getEachEdge()) {
          Node node0 = e.getNode0();
          Node node1 = e.getNode1();
          int row = Integer.parseInt(node0.getId());
          int col = Integer.parseInt(node1.getId());
          e.setAttribute("weight", new Object[] { Double.valueOf(network[row][col]) });
        }
        
      }
    }
    else if (typeIndex == SMALL_WORLD)
    {
      networkType = NETWORK_TYPE_LIST[SMALL_WORLD];
      graph = new SingleGraph(networkType);
      int numberOfNodes = (int)netParams[0];
      int nearestNeighborConnectivity = (int)netParams[1];
      double probabilityOfConnect = netParams[2];
      
      gen = new WattsStrogatzGenerator(numberOfNodes, nearestNeighborConnectivity, probabilityOfConnect);
      gen.setRandomSeed(randomSeed);
      gen.addSink(graph);
      
      while (gen.nextEvents()) {}
      gen.end();
      
      network = new double[graph.getNodeCount()][graph.getNodeCount()];
    }
    else if (typeIndex == PREF_ATTACH)
    {
      networkType = NETWORK_TYPE_LIST[PREF_ATTACH];
      graph = new SingleGraph(networkType);
      
      int numberOfNodes = (int)netParams[0];
      int maxLinksPerStep = (int)netParams[1];
      
      gen = new BarabasiAlbertGenerator(maxLinksPerStep);
      gen.setRandomSeed(randomSeed);
      
      gen.addSink(graph);
      gen.begin();
      
      for (int i = 0; i < numberOfNodes; i++) {
        gen.nextEvents();
      }
      
      gen.end();


    }
    else if (typeIndex == RANDOM)
    {
      networkType = NETWORK_TYPE_LIST[RANDOM];
      graph = new SingleGraph(networkType);
      
      int numberOfNodes = (int)netParams[0];
      int avgDegree = (int)netParams[1];
      
      gen = new RandomGenerator(avgDegree);
      gen.setRandomSeed(randomSeed);
      gen.addSink(graph);
      gen.begin();
      for (i = 0; i < numberOfNodes; i++) {
        gen.nextEvents();
      }
      gen.end();
      network = new double[graph.getNodeCount()][graph.getNodeCount()];
    }
    
    int nodeNum = 0;
    for (Node n : graph.getEachNode()) {
      n.setAttribute("ui.label", new Object[] { nodeNum });
      nodeNum++;
    }
  }
  
  public void setWeights(String wType, double[] wParams, long randomSeed)
  {
    if (networkType.equals(NETWORK_TYPE_LIST[3]))
    {

      return;
    }
    int weightIndex = 0;
    for (int i = 0; i < WEIGHT_TYPE_LIST.length; i++)
    {
      if (wType.equals(WEIGHT_TYPE_LIST[i]))
      {
        weightIndex = i;
      }
    }
    Random rand = new Random(randomSeed);
    network = new double[graph.getNodeCount()][graph.getNodeCount()];
    if (weightIndex == CONSTANT)
    {
      double constantValue = wParams[0];
      for (Edge e : graph.getEachEdge()) {
        e.setAttribute("weight", new Object[] { Double.valueOf(constantValue) });
      }
      
    }
    else if (weightIndex == UNIFORM)
    {
      double minValue = wParams[0];
      double maxValue = wParams[1];
      for (Edge e : graph.getEachEdge()) {
        double randValue = minValue + rand.nextDouble() * (maxValue - minValue);
        e.setAttribute("weight", new Object[] { Double.valueOf(randValue) });
      }
    }
    

    for (Iterator localIterator1 = graph.getEachNode().iterator(); localIterator1.hasNext(); 
        ???.hasNext())
    {
      Node n = (Node)localIterator1.next();
      ??? = n.getEachEdge().iterator(); continue;Edge e = (Edge)???.next();
      int x = Integer.parseInt(n.getId());
      int y = Integer.parseInt(e.getOpposite(n).getId());
      network[x][y] = Double.parseDouble(e.getAttribute("weight").toString());
    }
  }
  


  public void display()
  {
    graph.display();
  }
  
  public void printWeightMatrix()
  {
    for (int i = 0; i < network.length; i++)
    {
      for (int j = 0; j < network[0].length; j++)
      {
        System.out.print(network[i][j] + ", ");
      }
      System.out.println();
    }
  }
}
