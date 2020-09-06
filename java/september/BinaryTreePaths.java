package september;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(res, root, "");
        return res;
    }

    public void dfs(List<String> res, TreeNode root, String onePath) {
        if (root != null) {
            StringBuilder stringBuilder = new StringBuilder(onePath);
            stringBuilder.append(root.val);
            if (root.right != null && root.left != null) {
                res.add(stringBuilder.toString());
            } else {
                stringBuilder.append("->");
                dfs(res, root.left, stringBuilder.toString());
                dfs(res, root.right, stringBuilder.toString());
            }
        }

    }
}
