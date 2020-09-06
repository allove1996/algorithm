package september;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NQueens {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> res = new ArrayList<>();
            int[] queen = new int[n];
            Arrays.fill(queen, -1);
            HashSet<Integer> columns = new HashSet<>();
            HashSet<Integer> diagonals1 =  new HashSet<>();
            HashSet<Integer> diagonals2 = new HashSet<>();
            backTrack(res, queen, 0, n, columns, diagonals1, diagonals2);
            return res;
        }

        public void backTrack(List<List<String>> res, int[] queen, int row, int n, HashSet<Integer> columns, HashSet<Integer> diagonals1s, HashSet<Integer> diagonals2s) {
            if (row == n) {
                List<String> board = generateBoardTest(queen, n);
                res.add(board);
            }
            for (int j = 0; j < n; j++) {
                if (columns.contains(j)) {
                    continue;
                }
                int diagonals1 = row - j;
                if (diagonals1s.contains(diagonals1)) {
                    continue;
                }
                int diagonals2  = row + j;
                if (diagonals2s.contains(diagonals2)) {
                    continue;
                }

                columns.add(j);
                diagonals1s.add(diagonals1);
                diagonals2s.add(diagonals2);
                queen[row] = j;
                backTrack(res, queen, row + 1, n, columns, diagonals1s, diagonals2s);
                queen[row] = -1;
                columns.remove(j);
                diagonals1s.remove(diagonals1);
                diagonals2s.remove(diagonals2);
            }
        }

        public List<String> generateBoardTest(int[] queen, int n) {
            List<String> board = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                char[] row = new char[n];
                Arrays.fill(row, '.');
                row[queen[i]] = 'Q';
                board.add(new String(row));
            }
            return board;
        }


}
