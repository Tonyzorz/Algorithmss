import java.util.*;
class Node implements Comparable<Node>{
	
	private int index;
	private int distance;

	public Node(int index, int distance) {

		this.index = index;
		this.distance = distance;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public int compareTo(Node other) {
		
		if(this.distance < other.distance) {
			return -1;
		}
		// TODO Auto-generated method stub
		return 1;
	}
	
}
class Solution {
	private static int INF = (int) 1e9;
	static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
	static int d[];
	
	
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        d = new int[N + 1];
        Arrays.fill(d, INF);
        
        for(int i = 0; i <= N; i++) {
        	graph.add(new ArrayList<>());
        }
        
        //{{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        
//        for(int j = 0; j < road.length; j++) {
//        	
//        	for(int i = 0; i < 2; i++) {
//        		int index = road[j][i];
//        		graph.get(j + 1).add(new Node(index, road[j][2]));
//        	}
//        }
//        for(int i = 0; i < road.length; i++) {
//        	graph.get(road[i][0]).add(new Node(road[i][1], road[i][2]));
//        	graph.get(road[i][1]).add(new Node(road[i][0], road[i][2]));
//        }
//        
        for(int[] street : road) {
        	int nodeA = street[0];
        	int nodeB = street[1];
        	int dist = street[2];
        	graph.get(nodeA).add(new Node(nodeB, dist));
        	graph.get(nodeB).add(new Node(nodeA, dist));
        }
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, 0));
        d[1] = 0;
        
        while(!pq.isEmpty()) {
        	Node node = pq.poll();
        	int dist = node.getDistance();
        	int now = node.getIndex();
        	
        	if(d[now] < dist) continue;
        	
        	ArrayList<Node> nodes = graph.get(now);
        	
        	for(Node next : nodes) {
        		int cost = next.getDistance() + dist;
        		if(cost < d[next.getIndex()]) {
        			d[next.getIndex()] = cost;
        			pq.offer(new Node(next.getIndex(), cost));
        		}
        	}
        }
        
        for(int i = 1; i <= N; i++) {
        	if(d[i] <= K) answer++;
        }
        
        //System.out.println(Arrays.toString(d));
        return answer;
    }
}