package xyz.abc.test.LinkTable;

/**
 * @author 秦江峰
 * @date 2018/11/13 13:49
 */
public class LinkTableMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        MyLinksTable<NodeDouble> linkLinksTable = new MyLinksTable<>(new NodeDouble("link22"));
        linkLinksTable.addFrist(new NodeDouble("link11"));

//        LinkedList<String> strings;
//
//        NodeDouble link1 = new NodeDouble("link11");
//        //第一个 link1 的prev节点为Null
//        NodeDouble link2 = new NodeDouble(link1,"link22");
//        link1.setNext(link2);
//
//        NodeDouble link3 = new NodeDouble(link2,"link33");
//        link2.setNext(link3);
//
//        NodeDouble link4 = new NodeDouble(link3,"link44");
//        link3.setNext(link4);
//        NodeDouble link5 = new NodeDouble(link4,"link55");
//        link4.setNext(link5);
//
//        NodeDouble link6 = new NodeDouble(link5,"link66");
//        link5.setNext(link6);
//
//
//        NodeDouble link7 = new NodeDouble(link6,"link77");
//        link6.setNext(link7);
//
//        //这里的最后一个link7的next结点为null
//
//        Assert.isTrue(link1.isHeader());
//
//        Assert.isTrue(link7.isLast());
//
//        NodeDouble link = link1.clone();
        System.out.println("over");
    }
}
