package merv_1_0_3;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Random;


































































public class EgoNetwork
{
  public static int MALE = 1;
  public static int FEMALE = 0;
  
  public static int SUP = 0;
  public static int SYM = 1;
  public static int ACT = 2;
  
  public static int KIN = 0;
  public static int NOT_KIN = 1;
  
  public static double C_K = 95.3275D;
  public static double C_NK = 93.8275D;
  
  public static double W_MEAN = 0.3217D;
  public static double W_STD = 0.1608D;
  
  public static double S_ALPHA = 4.1D;
  public static double S_BETA = 3.49D;
  public static double S_LAMBDA = 0.0D;
  
  public static double B_ALPHA = 205.48D;
  public static double B_BETA = 8.5264D;
  public static double B_LAMBDA = 0.0D;
  
  public static double E_K_ALPHA = 1.85D;
  public static double E_K_BETA = 2.296D;
  public static double E_K_LAMBDA = 0.0D;
  
  public static double E_NK_MEAN = 0.485D;
  public static double E_NK_STD = 0.17D;
  
  public static double E_K_SUP_L = 0.8582D;
  public static double E_K_SYM_L = 0.6852D;
  
  public static double E_NK_SUP_L = 0.8185D;
  public static double E_NK_SYM_L = 0.7247D;
  
  public static double E_UPPER_BOUND = 1.0D;
  public static double E_LOWER_BOUND = 0.0D;
  
  public static double[] AD_M_SUP_SYM_DIST = { 15.98D, 33.24D, 84.85D };
  public static double[] AD_F_SUP_SYM_DIST = { 16.64D, 41.36D, 55.5D };
  
  public static double[] AD_M_ACT_DIST = { 9.7D, 24.93D, 69.34D };
  public static double[] AD_F_ACT_DIST = { 14.68D, 29.21D, 62.12D };
  
  private int mSize = 400;
  private double[][] ego;
  
  public EgoNetwork()
  {
    ego = new double[mSize][mSize];
    for (int n = 0; n < ego.length; n++)
    {
      int gender = genderBernulli();
      double s_sym = getS();
      double w = getW();
      double s_sup = s_sym * w;
      double bdg = getB();
      
      boolean done = false;
      int i = 0;
      double tot = 0.0D;
      while (!done)
      {
        int layer = selectLayer(i, s_sym, s_sup);
        double sampleFromADDist = Math.random() * 100.0D;
        int a = getA(layer, gender, sampleFromADDist);
        int d = getD(layer, gender, sampleFromADDist);
        double e = getE(d, layer);
        double t = getH(d, e);
        if (t / 2.0D < bdg - tot)
        {
          createRelationship(e, a, gender, n);
          tot += t;
          i++;
        }
        else
        {
          done = true;
        }
      }
    }
  }
  
  public EgoNetwork(int pSize)
  {
    mSize = pSize;
    ego = new double[mSize][mSize];
    for (int n = 0; n < ego.length; n++)
    {
      int gender = genderBernulli();
      double s_sym = getS();
      double w = getW();
      double s_sup = s_sym * w;
      double bdg = getB();
      
      boolean done = false;
      int i = 0;
      double tot = 0.0D;
      while (!done)
      {
        int layer = selectLayer(i, s_sym, s_sup);
        double sampleFromADDist = Math.random() * 100.0D;
        int a = getA(layer, gender, sampleFromADDist);
        int d = getD(layer, gender, sampleFromADDist);
        double e = getE(d, layer);
        double t = getH(d, e);
        if (t / 2.0D < bdg - tot)
        {
          createRelationship(e, a, gender, n);
          tot += t;
          i++;
        }
        else
        {
          done = true;
        }
      }
    }
  }
  
  public void createRelationship(double emotionalCloseness, int alterGender, int myGender, int myId)
  {
    double weight = 0.0D;
    if (alterGender == myGender)
    {
      weight = emotionalCloseness * emotionalCloseness;
    }
    int partnerId = (int)(Math.random() * ego.length);
    while ((partnerId == myId) || (ego[myId][partnerId] != 0.0D))
    {
      partnerId = (int)(Math.random() * ego.length);
    }
    ego[myId][partnerId] = weight;
  }
  
  public static int selectLayer(int curLayer, double maxSymLayer, double maxSupLayer)
  {
    if (curLayer < Math.floor(maxSupLayer))
    {
      return SUP;
    }
    if (curLayer < Math.floor(maxSymLayer))
    {
      return SYM;
    }
    

    return ACT;
  }
  

  public static int genderBernulli()
  {
    double coin = Math.random();
    if (coin > 0.5D)
    {
      return MALE;
    }
    

    return FEMALE;
  }
  

  public static double getS()
  {
    return nextGamma(S_ALPHA, S_BETA, S_LAMBDA);
  }
  
  public static double getW()
  {
    Random rand = new Random();
    return Math.max(0.0D, W_MEAN + W_STD * rand.nextGaussian());
  }
  

  public static double getB()
  {
    return nextGamma(B_ALPHA, B_BETA, B_LAMBDA);
  }
  
  public static int getA(int gender, int layer, double sample)
  {
    if ((layer == SYM) || (layer == SUP))
    {
      if (gender == MALE)
      {
        if (sample <= AD_M_SUP_SYM_DIST[0])
        {
          return MALE;
        }
        if (sample <= AD_M_SUP_SYM_DIST[1])
        {
          return FEMALE;
        }
        if (sample <= AD_M_SUP_SYM_DIST[2])
        {
          return MALE;
        }
        

        return FEMALE;
      }
      


      if (sample <= AD_F_SUP_SYM_DIST[0])
      {
        return MALE;
      }
      if (sample <= AD_F_SUP_SYM_DIST[1])
      {
        return FEMALE;
      }
      if (sample <= AD_F_SUP_SYM_DIST[2])
      {
        return MALE;
      }
      

      return FEMALE;
    }
    



    if (gender == MALE)
    {
      if (sample <= AD_M_ACT_DIST[0])
      {
        return MALE;
      }
      if (sample <= AD_M_ACT_DIST[1])
      {
        return FEMALE;
      }
      if (sample <= AD_M_ACT_DIST[2])
      {
        return MALE;
      }
      

      return FEMALE;
    }
    


    if (sample <= AD_F_ACT_DIST[0])
    {
      return MALE;
    }
    if (sample <= AD_F_ACT_DIST[1])
    {
      return FEMALE;
    }
    if (sample <= AD_F_ACT_DIST[2])
    {
      return MALE;
    }
    

    return FEMALE;
  }
  



  public static int getD(int gender, int layer, double sample)
  {
    if ((layer == SYM) || (layer == SUP))
    {
      if (gender == MALE)
      {
        if (sample <= AD_M_SUP_SYM_DIST[0])
        {
          return KIN;
        }
        if (sample <= AD_M_SUP_SYM_DIST[1])
        {
          return KIN;
        }
        if (sample <= AD_M_SUP_SYM_DIST[2])
        {
          return NOT_KIN;
        }
        

        return NOT_KIN;
      }
      


      if (sample <= AD_F_SUP_SYM_DIST[0])
      {
        return KIN;
      }
      if (sample <= AD_F_SUP_SYM_DIST[1])
      {
        return KIN;
      }
      if (sample <= AD_F_SUP_SYM_DIST[2])
      {
        return NOT_KIN;
      }
      

      return NOT_KIN;
    }
    



    if (gender == MALE)
    {
      if (sample <= AD_M_ACT_DIST[0])
      {
        return KIN;
      }
      if (sample <= AD_M_ACT_DIST[1])
      {
        return KIN;
      }
      if (sample <= AD_M_ACT_DIST[2])
      {
        return NOT_KIN;
      }
      

      return NOT_KIN;
    }
    


    if (sample <= AD_F_ACT_DIST[0])
    {
      return KIN;
    }
    if (sample <= AD_F_ACT_DIST[1])
    {
      return KIN;
    }
    if (sample <= AD_F_ACT_DIST[2])
    {
      return NOT_KIN;
    }
    

    return NOT_KIN;
  }
  




  public static double getE(int kinship, int layer)
  {
    double result = -1.0D;
    Random rand = new Random();
    
    if (kinship == KIN)
    {
      if (layer == SUP)
      {
        while ((result < E_K_SUP_L) || (result > E_UPPER_BOUND))
        {
          result = nextGamma(E_K_ALPHA, E_K_BETA, E_K_LAMBDA);
        }
        
      }
      else if (layer == SYM)
      {
        while ((result < E_K_SYM_L) || (result > E_K_SUP_L))
        {
          result = nextGamma(E_K_ALPHA, E_K_BETA, E_K_LAMBDA);

        }
        
      }
      else
      {
        while ((result < E_LOWER_BOUND) || (result > E_K_SYM_L))
        {
          result = nextGamma(E_K_ALPHA, E_K_BETA, E_K_LAMBDA);
        }
        
      }
      
    }
    else if (layer == SUP)
    {
      while ((result < E_NK_SUP_L) || (result > E_UPPER_BOUND))
      {
        result = E_NK_MEAN + E_NK_STD * rand.nextGaussian();
      }
      
    } else if (layer == SYM)
    {
      while ((result < E_NK_SYM_L) || (result > E_NK_SUP_L))
      {
        result = E_NK_MEAN + E_NK_STD * rand.nextGaussian();
      }
      
    }
    else {
      while ((result < E_LOWER_BOUND) || (result > E_NK_SYM_L))
      {
        result = E_NK_MEAN + E_NK_STD * rand.nextGaussian();
      }
    }
    
    return result;
  }
  
  public static double getH(int kinship, double e)
  {
    if (kinship == KIN)
    {
      return Math.pow(C_K, e) - 0.5D;
    }
    

    return Math.pow(C_NK, e) + 1.0D;
  }
  

  public double[][] getNetworkAsMatrix()
  {
    return ego;
  }
  
  public static double nextGamma(double alpha, double beta, double lambda) {
    double gamma = 0.0D;
    if ((alpha <= 0.0D) || (beta <= 0.0D)) {
      throw new IllegalArgumentException("alpha and beta must be strictly positive.");
    }
    if (alpha < 1.0D)
    {
      boolean flag = false;
      double b = 1.0D + alpha * Math.exp(-1.0D);
      while (!flag) {
        double p = b * Math.random();
        if (p > 1.0D) {
          gamma = -Math.log((b - p) / alpha);
          if (Math.random() <= Math.pow(gamma, alpha - 1.0D)) flag = true;
        }
        else {
          gamma = Math.pow(p, 1.0D / alpha);
          if (Math.random() <= Math.exp(-gamma)) flag = true;
        }
      }
    }
    else if (alpha == 1.0D) {
      gamma = -Math.log(Math.random());
    } else {
      double y = -Math.log(Math.random());
      while (Math.random() > Math.pow(y * Math.exp(1.0D - y), alpha - 1.0D))
        y = -Math.log(Math.random());
      gamma = alpha * y;
    }
    return beta * gamma + lambda;
  }
  
  public static void main(String[] args)
  {
    int netSize = 150;
    EgoNetwork en = new EgoNetwork(netSize);
    double[][] enAsMatrix = en.getNetworkAsMatrix();
    
    DecimalFormat df = new DecimalFormat("#.###");
    for (int i = 0; i < enAsMatrix.length; i++)
    {
      for (int j = 0; j < enAsMatrix[i].length; j++)
      {
        System.out.print(df.format(enAsMatrix[i][j]) + ",");
      }
      System.out.println();
    }
  }
}
