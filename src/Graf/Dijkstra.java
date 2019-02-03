package Graf;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
    private LinkedList<Vertex>[] listAdjacent;
    private int n;

    private boolean[] visitedTab;
    private int[] distanceTab;
    private int[] sourceTab;

    private PriorityQueue<Vertex> priorityQueue;

    public Dijkstra(int n,LinkedList<Vertex>[] list){
        this.listAdjacent=list;
        this.n=n;
        this.visitedTab=new boolean[n];
        this.distanceTab=new int[n];
        this.sourceTab=new int[n];
        this.priorityQueue=new PriorityQueue<> (n,new VertexComparator ());


    }
    public void calculateMinPath(int source){
        for (int i = 0; i < n; i++) {
            distanceTab[i]=Integer.MAX_VALUE;
            sourceTab[i]=-1;
//           visitedTab[i]=false;
        }
        distanceTab[source]=0;
        sourceTab[source]=source;

        priorityQueue.add(new Vertex (source,distanceTab[source]));
        while (!priorityQueue.isEmpty ()){
            // S - source
            Vertex vS = priorityQueue.poll ();
            int idS =vS.getId ();
            int wS=vS.getWeight ();

            if(visitedTab[idS]){
                continue;
            }
            visitedTab[idS]=true;
            // D-destination

            for(Vertex vD:listAdjacent[idS]){
                int idD=vD.getId ();
                int wD=vD.getWeight ();

                if(!visitedTab[idD]&&(wS+wD<distanceTab[idD])){
                    distanceTab[idD]= wS +wD;
                    sourceTab[idD]=idS;
                    priorityQueue.add(new Vertex (idD,distanceTab[idD]));
                }

            }
        }
    }
    private void print(){
        System.out.println ("Distance:");
        for (int i = 0; i < n; i++) {
            System.out.print (distanceTab[i]+" ");
        }
        System.out.println ("\n\n");

        System.out.println ("Source:");
        for (int i = 0; i < n; i++) {
            System.out.print (sourceTab[i]+" ");
        }
    }
    public static void run(){
        Scanner scanner=new Scanner (System.in);
        int vNum; //ilość wierzchołków
        int eNum; //ilość krawędzi
        System.out.println ("Podaj ilość wierzchołków:");
        vNum=scanner.nextInt ();

        System.out.println ("Podaj ilośc krawędzi:");
        eNum=scanner.nextInt ();

        LinkedList<Vertex>[] list=new LinkedList[vNum];
        for (int i = 0; i < vNum; i++) {
            list[i] = new LinkedList<> ();
        }
        System.out.println ("Podaj wierzchołek_1 wierzchołek_2 waga:");
        for (int i = 0; i < eNum; i++) {
            int source =scanner.nextInt ();
            int destination = scanner.nextInt ();
            int weight=scanner.nextInt ();

            list[source].add (new Vertex (destination,weight));
        }
        Dijkstra dijkstra =new Dijkstra (vNum,list);
        dijkstra.calculateMinPath (0);
        dijkstra.print ();

    }
//    6
//    8
//    0 1 10
//    0 2 15
//    1 3 12
//    1 5 15
//    2 4 10
//    3 4 2
//    3 5 1
//    5 4 5

}
