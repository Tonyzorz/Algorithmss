package programmers.dp.rgb;

import org.junit.Assert;
import org.junit.Test;

public class Solution_bottomUp {

    public int solution(int[][] colors) {

        for (int i = 1; i < colors.length; i++) {
            colors[i][0] += Math.min(colors[i - 1][1], colors[i - 1][2]);
            colors[i][1] += Math.min(colors[i - 1][0], colors[i - 1][2]);
            colors[i][2] += Math.min(colors[i - 1][1], colors[i - 1][0]);
        }

        int min = Math.min(colors[colors.length - 1][0], Math.min(colors[colors.length - 1][1], colors[colors.length - 1][2]));
        return min;
    }

    @Test
    public void answer() {
        //given
        int[][] colors1 = {{26, 40, 83   },
                {49, 60, 57   },
                {13, 89, 99   }};
        int[][] colors2 = {{1, 100, 100  },
                {100, 1, 100  },
                {100, 100, 1  }};
        int[][] colors3 = {{1, 100, 100  },
                {100, 100, 100},
                {1, 100, 100  }};
        int[][] colors4 = {{30, 19, 5    },
                {64, 77, 64   },
                {15, 19, 97   },
                {4, 71, 57    },
                {90, 86, 84   },
                {93, 32, 91   },};
        int[][] colors5 = {{71, 39, 44   },
                {32, 83, 55   },
                {51, 37, 63   },
                {89, 29, 100  },
                {83, 58, 11   },
                {65, 13, 15   },
                {47, 25, 29   },
                {60, 66, 19   },};

        //when
        int result1 = 96;
        int result2 = 3;
        int result3 = 102;
        int result4 = 208;
        int result5 = 253;

        //then
        Assert.assertEquals(result1, solution(colors1));
        Assert.assertEquals(result2, solution(colors2));
        Assert.assertEquals(result3, solution(colors3));
        Assert.assertEquals(result4, solution(colors4));
        Assert.assertEquals(result5, solution(colors5));
    }
}
