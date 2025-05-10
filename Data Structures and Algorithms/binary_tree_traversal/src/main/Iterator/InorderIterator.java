package main;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

import IBinaryTreeNode;

public class InorderIterator<T extends Comparable<T>> implements Iterator<T> {
  private Stack<IBinaryTreeNode<T>> elements = new Stack<>();

  public InorderIterator(final IBinaryTreeNode<T> root){
    elements.add(root);
  }

  @Override
  public boolean hasNext(){
    return elements.size() != 0;
  }

  @Override 
  public T next(){
    if (elements.size() == 0) {
      throw new NoSuchElementException();
    }

    IBinaryTreeNode<T> element = elements.peek();
    IBinaryTreeNode<T> leftChild = element.getLeftChild();

    while(leftChild != null) {
      elements.add(leftChild);
      leftChild = leftChild.getLeftChild();
    }

    element = elements.pop();

    if(!elements.isEmpty()){
      elements.peek().setLeftChild(null);
    }

    if(element.getRightChild() != null){
      elements.add(element.getRightChild());
    }

    return element.getValue();
  }

  @Override
  public void remove(){
    throw new UnsupportedOperationException();
  }
}
