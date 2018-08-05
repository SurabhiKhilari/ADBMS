package HRD;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Random;

public class KMeans {

    public static int CLUSTERS = 3; 

    private static int findmin(double[] array,int size) {
        int i,min=-1;
        double val=99999;
        for(i=0;i<size;i++){
            if(array[i] < val){
                val= array[i];
                min=i;
            }
        }
        return min;
    }
    
    @SuppressWarnings("empty-statement")
    public static int[] kmeans(int[][] data,int length,int rowlen,int cluster_count) 
    {
        CLUSTERS=cluster_count;
        int[][] centroids = new int[CLUSTERS][length-1]; 
        int[][] old_centroids =new int[CLUSTERS][length-1];
        int i, j, k;
        double val;
        boolean centroid_equal = false;
        int[] clusters = new int[rowlen];
        Random rand = new Random();
        
        for(i=0;i<CLUSTERS;i++)
            for(j=0;j<length-1;j++){
                centroids[i][j]=data[i+2][j];
                old_centroids[i][j]=data[i+6][j];
            }
                
        centroids[0][0]=6400;
        centroids[0][1]=5313;
        centroids[0][2]=5*500;
        centroids[0][3]=1000;
        centroids[0][4]=1000;
        centroids[0][5]=5000;
                
        centroids[1][0]=3700;
        centroids[1][1]=3516;
        centroids[1][2]=2*500;
        centroids[1][3]=1000;
        centroids[1][4]=1000;
        centroids[1][5]=2500;
        
        centroids[2][0]=1800;
        centroids[2][1]=1596;
        centroids[2][2]=0;
        centroids[2][3]=1000;
        centroids[2][4]=0;
        centroids[2][5]=0;
      
        System.out.println("\n\nK Means Algorithm - "); 
        
        double[] distance= new double[CLUSTERS];
        int cluster_no;
        do
        { 
            for(i = 1; i< rowlen; i++) 
            {
                for(k=0;k<CLUSTERS;k++){
                    distance[k]=0;
                    val=0;
                    for(j=0;j<(length-1);j++)
                    {  
                        val+=pow(centroids[k][j] - data[i][j+1],2);
                    }
                    distance[k]=sqrt(val);
                }
                
                cluster_no=findmin(distance,CLUSTERS);
                clusters[data[i][0]]=cluster_no;
            }
            System.out.println("old_centroids==centroids ->>>"+(old_centroids==centroids));
            
            centroids=calculate_new_centroids(centroids,clusters,data,rowlen,length,CLUSTERS);
            if (old_centroids==centroids){
                centroid_equal=true;}
            old_centroids=centroids;
        }while(!centroid_equal);

        System.out.println("\n\nFinal Centroid :"); 
        for(i = 0; i< CLUSTERS; i++){
            System.out.println("\n Cluster no. "+i);
            for(j=0;j<length-1;j++) {
                System.out.printf(" " + centroids[i][j]);
            }
        }
        System.out.println();
        
        return clusters;
    } 

    private static int[][] calculate_new_centroids(int[][] centroids, int[] clusters, int[][] data,int rowlen,int length, int cluster_no) {
        int i,j,k,clust_no;
        int[][] count=new int[cluster_no][length-1];
        int[] num = new int[cluster_no];
       
        for(i=0;i<cluster_no;i++) {
            num[i]=0;
            for(j=0;j<(length-1);j++)
                count[i][j]=0;
        }
        for(j=1;j<rowlen;j++){
            clust_no=clusters[data[j][0]];
            num[clust_no]+=1;
            for(k=0;k<(length-1);k++)
                count[clust_no][k] += data[j][k+1];
        }
        
        for(i=0;i<cluster_no;i++) {
            if(num[i]!=0)
                for (j = 0; j < (length-1); j++) {
                    count[i][j]/=num[i];
                }
            centroids[i]=count[i];
        }
        return centroids;
    }
}
