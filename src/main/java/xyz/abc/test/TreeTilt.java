package xyz.abc.test;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import xyz.abc.test.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 秦江峰
 * @date 2019/5/8 18:09
 */
public class TreeTilt {

    private Map<TreeNode, NodeSum> titlMap = new HashMap<>();
    private int n = 0;

    public int tilt(TreeNode treeNode) {
        int titls = 0;
        if (!titlMap.containsKey(treeNode)) {
            titls = Math.abs(nodeValuesSum(treeNode.getLeft()) - nodeValuesSum(treeNode.getRight()));
        } else {
            titls = titlMap.get(treeNode).getTilt();
        }
        //int leftTilt = 0;
        int r = 0;
        for (Map.Entry<TreeNode, NodeSum> sss :
                titlMap.entrySet()
        ) {
            r += sss.getValue().getTilt();
        }

        return r + titls;
    }

    private int nodeValuesSum(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        if (treeNode.getLeft() == null && treeNode.getRight() == null) {
            titlMap.put(treeNode, new NodeSum(0, 0, 0));
            return treeNode.getVal();
        }
        NodeSum nodeSum = titlMap.get(treeNode);
        if (nodeSum == null) {
            nodeSum = new NodeSum(
                    nodeValuesSum(treeNode.getLeft()),
                    nodeValuesSum(treeNode.getRight()), 0
            );
            nodeSum.setTilt(Math.abs(nodeSum.getLeft() - nodeSum.getRight()));
            titlMap.put(treeNode, nodeSum);
            n += nodeSum.tilt;
        }
        return nodeSum.getLeft() + nodeSum.getRight() + treeNode.getVal();
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    class NodeSum {
        public Integer left;
        public Integer right;
        public Integer tilt;
    }
}
