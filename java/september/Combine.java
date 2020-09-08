package september;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n <= 0 || k <= 0 || n < k) {
            return res;
        }
        backTrack(res, 1, n, k, new ArrayList<>());
        return res;
    }

    public void backTrack(List<List<Integer>> res, int index, int n, int k, List<Integer> curr) {
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = index; i <= n - k + curr.size() + 1; i++) {
            curr.add(i);
            backTrack(res, i + 1, n, k, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        res = new Combine().combine(4, 4);
        System.out.println(res);
    }

}
