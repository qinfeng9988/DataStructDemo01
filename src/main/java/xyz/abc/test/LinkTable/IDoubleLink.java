package xyz.abc.test.LinkTable;

/**
 * @author 秦江峰
 * @date 2018/11/14 12:00
 * 双向链表
 */
public interface IDoubleLink<T> extends ILinkNext<T> {
    T getPrev();
    void setPrev(T node);
}
