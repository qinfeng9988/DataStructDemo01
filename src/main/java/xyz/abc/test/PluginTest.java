package xyz.abc.test;

import xyz.abc.test.model.TreeNode;

/**
 * @author 秦江峰
 * @date 2018/5/11 15:16
 */
public class PluginTest {


    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(treeNode5,null,4);
        TreeNode treeNode3 = new TreeNode(treeNode4,null,3);
        TreeNode treeNode2 = new TreeNode(treeNode3,null,2);
        TreeNode treeNode1 = new TreeNode(treeNode2,null,1);

//        TreeNode myTreeNode = new TreeNode(
//            new TreeNode(
//                    2),new TreeNode(3),1
//        );

        TreeTilt treeTilt = new TreeTilt();
        int t = treeTilt.tilt(treeNode1);
        System.out.println(t);

//        BigInteger i = new BigInteger("1542873462693");
////        int a = 10;
////        int b = 11;
////        Exchange2VariableValue.exchange(a, b);
////        System.out.println("======================================");
////        int[] t = {13,12,11,10,9,8,7,6,5,4,3,2,1};
////
////        PokerService pokerService = new PokerService();
////        pokerService.sort(t);
////        System.out.println("======================================");
//        int[] t2 = {1, 12, 2, 8, 3, 11, 4, 9, 5, 13, 6, 10, 7};
////        pokerService.sort2(t2);
////        System.out.println("======================================");
//
//        int[] t3 = {7, 12, 2, 19, 3, 2, 4, 9, 5, 2, 1, 10, 7};
//        int[] t4 = {3, 5, 4, 1, 2, 2, 4, 6};
//        //插入排序
//        InsertSort sort = new InsertSort();
//        sort.sortByAsc(t4);
//        System.out.println("======================================");
//        sort.sortByDesc(t4);

//冒泡排序
//        IOrderByBase order = new BubbleSort();
//        order.sortByDesc(t4);
//        System.out.println("======================================");
//        order.sortByAsc(t4);


//        pokerService.sort3();


    }
}
