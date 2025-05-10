package main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import IBinaryTreeNode;

public class LevelorderIterator<T extends Comparable<T>> implements Iterator<T> {
  private IBinaryTreeNode<T> root;

  private Queue<IBinaryTreeNode<T>> printQueue = new LinkedList<>();

  public LevelorderIterator(final IBinaryTreeNode<T> root){
    this.root = root;

    printQueue.add(this.root);
  }

    @Override
  public boolean hasNext(){
    return !printQueue.isEmpty();
  }

  @Override 
  public T next(){
    IBinaryTreeNode<T> currentNode = printQueue.peek();
    printQueue.remove();

    IBinaryTreeNode<T> leftNode = currentNode.getLeftChild();
    IBinaryTreeNode<T> rightNode = currentNode.getRightChild();

    if(leftNode != null) {
      printQueue.add(leftNode);
    }

    if(rightNode != null) {
      printQueue.add(rightNode);
    }

    return currentNode.getValue();
  }

  @Override
  public void remove(){
    throw new UnsupportedOperationException();
  }
}
