package programmers.graph.서로소;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {
    
    public static int v, e;
    public static int[] parent = new int[7];
    
    public int[] solution(int[][] factors) {
        // 부모 테이블상에서, 부모를 자기 자신으로 초기화
        parent_init();
        System.out.println(Arrays.toString(parent));

        for (int[] factor : factors) {
            unionParent(factor[0], factor[1]);
        }

        System.out.println(Arrays.toString(parent));
        return parent;
    }

    public int[] solution_efficient(int[][] factors) {
        // 부모 테이블상에서, 부모를 자기 자신으로 초기화
        parent_init();
        System.out.println(Arrays.toString(parent));

        for (int[] factor : factors) {
            unionParent_efficient(factor[0], factor[1]);
        }

        System.out.println(Arrays.toString(parent));
        return parent;
    }
    
    public static int simple_findParent(int x) {
        if (x == parent[x]) return x;
        return simple_findParent(parent[x]);
    }

    public static int efficient_findParent(int x) {
        if (x == parent[x]) return x;
        return parent[x] = efficient_findParent(parent[x]);
    }
    
    public static void unionParent(int a, int b) {
        a = simple_findParent(a);
        b = simple_findParent(b);
        
        if (a < b) {
            parent[b] = a;    
        } else {
            parent[a] = b;
        }
    }

    public static void unionParent_efficient(int a, int b) {
        a = efficient_findParent(a);
        b = efficient_findParent(b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
    
    public void parent_init() {
        for (int i = 1; i <= parent.length - 1; i++) {
            parent[i] = i;
        }
    }
    
    @Test
    public void answer() {
        //given
        int[][] factors1 = {{1,4},{2,3},{2,4},{5,6},};
        int[][] factors2 = {{4,5},{3,4},{2,3},{1,2},};
        
        //when
        int[] result1 = {0, 1, 1, 2, 1, 5, 5};
        int[] result2 = {0, 1, 1, 1, 1, 1, 6};
        
        //then
//        Assert.assertArrayEquals(result1, solution(factors1));
//        Assert.assertArrayEquals(result2, solution_efficient(factors2));
    }
}
