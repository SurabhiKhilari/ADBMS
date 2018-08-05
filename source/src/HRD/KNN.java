package HRD;

import static java.lang.Math.*;
import java.util.*;

public class KNN {
    private static final int k=6;
    
    public static int findMajorityClass(int[] array){
        int[] count=new int[3];
        int i,max=-1,index=-1;
        for(i=0;i<k;i++)
            count[array[i]]++;
        
        for(i=0;i<3;i++)
            if(max<count[i]) {
                max=count[i];
                index=i;
            }
        
        return index;
    }
    
    public static int knn(int[] query,int[][] data,int[] clusters,int rowlen,int lenght){
        int i,j;
        List<Result> resultList = new ArrayList<Result>();
        
        for(i=0;i<rowlen;i++)
        {
            double dist=0.0;
            for(j=1;j<lenght;j++) {
                dist += pow(data[i][j]- query[j],2);
            }
            double distance=sqrt(dist);
            resultList.add(new Result(distance, clusters[data[i][0]]));
        }
                
        Collections.sort(resultList, new DistanceComparator());
        int[] ss = new int[k];
        for(int x = 0; x < k; x++){
            //System.out.println(resultList.get(x).Cluster_no+ " .... " + resultList.get(x).Distance);
            ss[x] = resultList.get(x).Cluster_no;
        }
        int majClass = findMajorityClass(ss);
        System.out.println("Class of new instance is: "+majClass);
        
        return majClass;
    }
}

class Result {	
    double Distance;
    int Cluster_no;
    public Result(double distance, int cluster_no){
        this.Distance = distance;
        this.Cluster_no = cluster_no;	    	    
    }
}

class DistanceComparator implements Comparator<Result> {
    @Override
    public int compare(Result a, Result b) {
        return a.Distance < b.Distance ? -1 : a.Distance == b.Distance ? 0 : 1;
    }
}
