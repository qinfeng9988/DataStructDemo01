package xyz.abc.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 秦江峰
 * @date 2019/5/8 18:10
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    private int val;


}
