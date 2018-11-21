package xyz.abc.test.LinkTable;

/**
 * @author 秦江峰
 * @date 2018/11/14 11:34
 * 单向链表
 */
public interface ILinkNext<T> {
    T getNext();
    void setNext(T node);
}
