package xyz.abc.test.LinkTable.single;

import lombok.Data;

@Data
public class SingleLink<T extends ILinkNext<T>> {

    private T d;

    public SingleLink(T t) {
        this.d = t;
    }



    /**
     * 单链表是否包含指定节点
     * @param t
     * @return
     */
    public boolean contain(T t) {
        T node = d;
        while (node != null) {
            if (node.equals(t)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    /**
     * 获取指定结点
     * @param i
     * @return
     */
    public T get(int i){
        if(i<0){
            return null;
        }
        int current = 0;
        T n = d;
        while (n !=null){
            if(current == i){
                return n;
            }
            n = n.getNext();
            current++;
        }
        return null;
    }

//单链表反转
//删除指定节点
    //合并链表
    //添加节点
}
