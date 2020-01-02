package xyz.abc.test.LinkTable.doubleLink;

import lombok.*;

/**
 * @author 秦江峰
 * 双向链表
 * @date 2018/11/13 13:47
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NodeDouble implements Cloneable, IDoubleLink<NodeDouble> {
    private NodeDouble next;
    private NodeDouble prev;
    private String name;

    public NodeDouble(String name){
        this(null,name);
    }

    public NodeDouble(NodeDouble doubleLinkTable, String name){
        this.prev = doubleLinkTable;
        this.name = name;
        this.next = null;
    }


    public boolean isHeader(){
        return this.prev == null;
    }

    public boolean isLast(){
        return this.next == null;
    }



    @Override
    public NodeDouble clone() throws CloneNotSupportedException {
        //浅拷贝
        // return (NodeDouble)super.clone();
        //深拷贝
        NodeDouble doubleLinkTable = (NodeDouble)super.clone();
        doubleLinkTable.next = doubleLinkTable.next.clone();
        doubleLinkTable.prev = doubleLinkTable.prev.clone();

        return doubleLinkTable;
    }

}
