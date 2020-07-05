/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ade;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author hp
 */
public class Ade {
  
    public static HashMap<String,Integer> mapCache=new HashMap<String,Integer>();
    public static HashMap<String,Integer> mapDataBase=new HashMap<String,Integer>();
     public static int i=0;
     public static void createMapCache(String a[],int b[])
     {
        for(i=0;i<a.length;i++)
        {
         mapCache.put(a[i],b[i]);
        }
     }
     public static void createMapSyabse(String a[],int b[])
     {
        for(i=0;i<a.length;i++)
        {
         mapDataBase.put(a[i],b[i]);
        }
        
      }
     
     public static LinkedList<Integer> getTransactionNumberCache(String instanceID,Integer maxTransactionNumber)
     {
       LinkedList<Integer> transactionNumbersCache= new LinkedList<Integer>();
        for(int j=0;j<maxTransactionNumber;j++)
            transactionNumbersCache.add(j);
        
       return transactionNumbersCache;
     }
     
     public static LinkedList<Integer> getTransactionNumberDatabase(String instanceID,Integer maxTransactionNumber)
     {
          LinkedList<Integer> transactionNumbersDatabase= new LinkedList<Integer>();
        for(int j=0;j<maxTransactionNumber;j++)
            transactionNumbersDatabase.add(j);
        
        return transactionNumbersDatabase;
      
     }
      public static void CompareNumbers(LinkedList<Integer> transactionnumberscache,LinkedList<Integer> transactionnumbersdatabase )
      {
          for (Integer i : transactionnumberscache )
            if( transactionnumbersdatabase.contains(i) )
            {
                System.out.println(true);
            }
          
      }
     
     
     public static void display(HashMap <String,Integer> mapValue)
     {
       for(Map.Entry m:mapValue.entrySet())
       {
           System.out.println(m.getKey()+" "+m.getValue());
       }
     }
       
      public static void main(String[] args) {
      System.out.println("Adesh"); 
      String InstanceIDs[]=new String[]{"A","B","C"};
      int maxTransactionNumberSybase[]=new int[]{10,10,10};
      int maxTransactionNumberCache[]=new int[]{11,11,11};
     
      createMapCache(InstanceIDs,maxTransactionNumberCache);
      createMapSyabse(InstanceIDs,maxTransactionNumberSybase);
      
      for (int k=0;k<InstanceIDs.length;k++)
      {
      LinkedList<Integer> TransactionNumbersCache=getTransactionNumberCache(InstanceIDs[k],mapCache.get(InstanceIDs[k]));
      LinkedList<Integer> TransactionNumbersDatabase=getTransactionNumberCache(InstanceIDs[k],mapDataBase.get(InstanceIDs[k]));
      
      CompareNumbers(TransactionNumbersCache,TransactionNumbersDatabase);
      }
}
      
}