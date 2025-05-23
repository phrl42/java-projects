package org.bunkerserver.DSA.BinaryTree;

public class BinaryTreeNode<T extends Comparable<T>> implements IBinaryTreeNode<T> {
  private T value;

  private IBinaryTreeNode<T> childLeft;
  private IBinaryTreeNode<T> childRight;

  @Override
  public void setValue(T val) {
    this.value = val;
  }

  @Override
  public T getValue() {
    return value;
  }

  @Override
  public IBinaryTreeNode<T> getLeftChild() {
    return this.childLeft;
  }

  @Override
  public IBinaryTreeNode<T> getRightChild() {
    return this.childRight;
  }

  @Override
  public void setLeftChild(IBinaryTreeNode<T> left) {
    this.childLeft = left;
  }

  @Override
  public void setRightChild(IBinaryTreeNode<T> right) {
    this.childRight = right;
  }

  public BinaryTreeNode() {

  }
}
