package xyz.abc.test.LinkTable.doubleLink;

import xyz.abc.test.LinkTable.single.ILinkNext;

/**
 * @author 秦江峰
 * @date 2018/11/14 12:00
 * 双向链表
 */
public interface IDoubleLink<T> extends ILinkNext<T> {
    T getPrev();
    void setPrev(T node);
}
