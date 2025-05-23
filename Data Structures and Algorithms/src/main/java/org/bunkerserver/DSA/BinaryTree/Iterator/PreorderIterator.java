package org.bunkerserver.DSA.BinaryTree.Iterator;

import java.util.Iterator;
import java.util.Stack;

import java.util.NoSuchElementException;

import org.bunkerserver.DSA.BinaryTree.IBinaryTreeNode;

public class PreorderIterator<T extends Comparable<T>> implements Iterator<T> {

  private Stack<IBinaryTreeNode<T>> elements = new Stack<>();

  public PreorderIterator(final IBinaryTreeNode<T> root) {
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
    elements.pop();

    if(element.getRightChild() != null){
      elements.add(element.getRightChild());
    }
    
    if(element.getLeftChild() != null){
      elements.add(element.getLeftChild());
    }

    return element.getValue();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}