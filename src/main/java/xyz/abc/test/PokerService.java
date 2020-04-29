package xyz.abc.test;

import com.google.common.primitives.Ints;

import java.util.LinkedList;

/**
 * @author 秦江峰
 * @date 2018/11/7 17:37
 * 经典版扑克牌 排序
 */
public class PokerService {
    /**
     * 这里的操作是从桌子把牌拿回到手上
     * 从桌子 到 手上 int[] t = {13,12,11,10,9,8,7,6,5,4,3,2,1};
     * 返回 {1,12,2,8,3,11,4,9,5,13,6,10,7}
     *
     * @param pokers
     */
    void sort(int[] pokers) {
        //从数组转换成list,只是为了方便操作，不用考虑其它的
        LinkedList<Integer> pokerList = new LinkedList<Integer>(Ints.asList(pokers));
        //声明一个目标容器，理解成手
        LinkedList<Integer> newPokers2 = new LinkedList<>();
        for (Integer aPokerList : pokerList) {
            //判断手上的牌是否大于1张
            if (newPokers2.size() > 1) {
                //如果大于一张，则把手牌的最后一张放在最上面
                newPokers2.addFirst(newPokers2.pollLast());
            }
            //从桌子上拿一张牌放在手上
            newPokers2.addFirst(aPokerList);
        }
        //循环打印到控制台，
        newPokers2.forEach(System.out::println);
    }

    /**
     * 正向，从手到桌子 t2 = {1,12,2,8,3,11,4,9,5,13,6,10,7};
     * 返回 ｛13,12,11,10,9,8,7,6,5,4,3,2,1};
     *
     * @param pokers
     */
    public void sort2(int[] pokers) {
        //13张牌转换成数组  方便操作，不用考虑太多
        LinkedList<Integer> pokerList = new LinkedList<>();
        for (int poker : pokers) {
            pokerList.add(poker);
        }
        //声明一个新的容器，在这里可以理解成桌子
        LinkedList<Integer> newPokers2 = new LinkedList<>();
        for (int i = 0; i < pokers.length; i++) {
            //将手牌中的第一张放在桌子上
            newPokers2.add(pokerList.pollFirst());
            //假如这是最后一次循环手牌已经没有了就不需要进入这个判断了
            if (pokerList.size() > 0) {
                //将第一张放在牌堆的最后
                pokerList.addLast(pokerList.pollFirst());
            }
        }
        //循环打印到控制台，
        newPokers2.forEach(System.out::println);
    }

}
