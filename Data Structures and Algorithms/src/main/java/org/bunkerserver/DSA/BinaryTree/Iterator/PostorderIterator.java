package org.bunkerserver.DSA.BinaryTree.Iterator;

import java.util.Iterator;
import java.util.Stack;

import java.util.NoSuchElementException;

import org.bunkerserver.DSA.BinaryTree.IBinaryTreeNode;

public class PostorderIterator<T extends Comparable<T>> implements Iterator<T> {
  private Stack<IBinaryTreeNode<T>> elements = new Stack<>();

  public PostorderIterator(final IBinaryTreeNode<T> root) {
    elements.push(root);
  }

  @Override
  public boolean hasNext() {
    return elements.size() != 0;
  }

  @Override
  public T next() {
    if (elements.size() == 0) {
      throw new NoSuchElementException();
    }

    IBinaryTreeNode<T> element = elements.peek();

    IBinaryTreeNode<T> leftChild = element.getLeftChild();

    while(leftChild != null){
      elements.add(leftChild);
      leftChild = leftChild.getLeftChild();
    }

    element = elements.pop();

    if(!elements.isEmpty()){
      IBinaryTreeNode<T> peekChild = elements.peek();
      IBinaryTreeNode<T> rightChild = peekChild.getRightChild();
      peekChild.setLeftChild(null);

      if(rightChild != null){
        elements.add(rightChild);
        peekChild.setRightChild(null);
      }
    }

    return element.getValue();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}