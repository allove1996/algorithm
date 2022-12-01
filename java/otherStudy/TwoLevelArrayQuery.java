package otherStudy;

import java.util.ArrayList;
import java.util.List;

/**
 * 二维数组的穷举、遍历
 */
public class TwoLevelArrayQuery {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        new TwoLevelArrayQuery().arrayQuery(result, list, array, 0, 2);

        for (List<Integer> integers : result) {
            System.out.println(integers);
        }
    }

    public void arrayQuery(List<List<Integer>> result, List<Integer> list, int[][] array, int i, int k) {
        if (i == array.length - 1) {
            int startPoint = 0;
            int iterPoint = 0;

            while (startPoint < array[i].length - k + 1) {
                List<Integer> mList = new ArrayList<>();

                if (iterPoint + k - 1 < array[i].length) {
                    mList.add(array[i][startPoint]);
                    for (int n = 1; n < k; n++) {
                        mList.add(array[i][iterPoint + n]);
                    }
                    iterPoint++;

                    List<Integer> tempList = new ArrayList<>(list);
                    tempList.addAll(mList);
                    result.add(tempList);
                } else {
                    startPoint++;
                    iterPoint = startPoint;
                }
            }

            return;
        }

        int startPoint = 0;
        int iterPoint = 0;

        while (startPoint < array[i].length - k + 1) {
            List<Integer> mList = new ArrayList<>();

            if (iterPoint + k - 1 < array[i].length) {
                mList.add(array[i][startPoint]);
                for (int n = 1; n < k; n++) {
                    mList.add(array[i][iterPoint + n]);
                }
                iterPoint++;

                List<Integer> tempList = new ArrayList<>(list);
                tempList.addAll(mList);
                arrayQuery(result, tempList, array, i + 1, k);
            } else {
                startPoint++;
                iterPoint = startPoint;
            }
        }

    }

}
