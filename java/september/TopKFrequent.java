package september;

import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int a : nums) {
            occurrences.put(a, occurrences.getOrDefault(a, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });
        for(Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            queue.offer(new int[] {num, count});
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll()[0];
        }
        return ret;
    }

    public int[] topKFrequenctII(int[] nums, int k) {
        HashMap<Integer, Integer> occurences = new HashMap<>();
        for (int num : nums) {
            occurences.put(num, occurences.getOrDefault(num, 0) + 1);
        }
        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            list.add(new int[]{num, count});
        }
        int[] ret = new int[k];
        quickSort(list, 0, list.size() - 1, ret, 0, k);
        return ret;
    }

    public void quickSort(List<int[]> values, int start, int end, int[] ret, int retIndex, int k) {
        int picked = (int)(Math.random() * (end - start + 1)) + start;
        Collections.swap(values, picked, start);

        int pivot = values.get(start)[1];
        int index = start;
        for (int i = start + 1; i <= end; i++) {
            if (values.get(i)[1] > pivot) {
                Collections.swap(values, index + 1, i);
                index ++;
            }
        }
        Collections.swap(values, start, index);

        if (k <= index - start) {
            quickSort(values, start, index - 1, ret, retIndex, k);
        } else {
            for (int i = start; i <= index; i++) {
                ret[retIndex++] = values.get(i)[0];
            }
            if (k > index - start + 1) {
                quickSort(values, index + 1, end, ret, retIndex, k - (index - start + 1));
            }
        }
    }




}
