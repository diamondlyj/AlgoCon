package assignment1;

public class BinarySearchTree {

	public BinarySearchTree() {
   private Node root;

   public BinarySearchTree() { 
   this.root=null;
   }  
   public void insert(int value){
    root=insert(root,value);
 }
   
public class Node
   {
      public int value;
      public Node left;
      public Node right;
      
  public Node(int value){
  this.value=value;
  this.left=null;
  this.right=null;
  }
      }

 public Node insert(Node treeNode,int value){
if(treeNode==null){
    treeNode=new Node(value);
}
else{
    if(value<=treeNode.value){
        treeNode.left=insert(treeNode.left,value);
        }
    else{
        treeNode.right=insert(treeNode.right,value);
    }
}
return treeNode;
 }
 
     
 
 
public boolean find(int value){
   Node treeNode=root;
   if(treeNode.value==value){
       return true;
 }
 else{
       if(value<treeNode.value){
           treeNode=treeNode.left;
           return true;
       }
       else{
           treeNode=treeNode.right;
           return true;
       }
   } 
 }
}
