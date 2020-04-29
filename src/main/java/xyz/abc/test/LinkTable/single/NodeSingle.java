package xyz.abc.test.LinkTable.single;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode()
public class NodeSingle implements Cloneable, ILinkNext<NodeSingle> {

    private NodeSingle next;

    private Integer name;

    public NodeSingle(Integer name) {
        this(null, name);
    }

    public NodeSingle(NodeSingle singleLink, Integer name) {
        this.name = name;
        this.next = singleLink;
    }

    public boolean isLast() {
        return this.next == null;
    }

    @Override
    public boolean equals(Object x) {
        if (x == null) {
            return false;
        }
        NodeSingle n = (NodeSingle) x;
        return n.getName().equals(this.name);
    }

    @Override
    public NodeSingle clone() throws CloneNotSupportedException {
        //浅拷贝
        // return (NodeDouble)super.clone();
        //深拷贝
        NodeSingle doubleLinkTable = (NodeSingle) super.clone();
        doubleLinkTable.next = doubleLinkTable.next.clone();
        return doubleLinkTable;
    }
}
