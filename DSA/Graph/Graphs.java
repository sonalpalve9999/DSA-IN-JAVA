package DSA.Graph;
import java.util.*;
public class Graphs {
      private LinkedList<Integer> adj[];
  public Graphs(int v){
    adj = new LinkedList[v];
    for(int i = 0  ; i < v ; i++)
{
    adj[i] =new LinkedList<Integer>();
}
  }

  public void addegde(int s ,  int d ){ //source and destination
   adj[s].add(d);
   adj[d].add(s);

  }
      public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        sc.close();

        Graphs g = new Graphs(v);

        for(int i = 0 ; i < e ; i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();

            g.addegde(source, destination);
        }
      }
}
