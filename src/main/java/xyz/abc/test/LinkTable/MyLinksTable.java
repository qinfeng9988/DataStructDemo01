package xyz.abc.test.LinkTable;

/**
 * @author 秦江峰
 * @date 2018/11/14 11:30
 */
public class MyLinksTable<T extends IDoubleLink<T>> {

     private T fristNode;

     private int count;

     private T lastNode;

     public MyLinksTable(T node){
          this.fristNode = node;
          this.lastNode = node;
     }

     public T getFrist(){
          return this.fristNode;
     }
     private T getLastNode(){
          return this.lastNode;
     }

     public void addFrist(T node){
//          if(this.fristNode==null){
//               this.fristNode = node;
//               this.lastNode = node;
//          }else{
               node.setNext(this.fristNode);
               this.fristNode.setPrev(node);
               this.fristNode = node;
//          }
     }

     public void addLast(T node){
//          if(this.lastNode==null){
//               this
//          }
          node.setNext(null);
          node.setPrev(this.lastNode);
          this.lastNode.setNext(node);
          this.lastNode = node;
     }

     public void remove(T node){

     }
}
