package main;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class BinarySearchTreeTest {

  public static void inorder(IBinaryTreeNode<Integer> node){
    if(node != null){
      inorder(node.getLeftChild());
      System.out.println(node.getValue());
      inorder(node.getRightChild());
    }
  }

  @Test
  public void TestBinaryTree(){
    IBinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    tree.insert(6);
    tree.insert(7);
    tree.insert(4);
    tree.insert(3);
    tree.insert(2);
    tree.insert(1);
    tree.insert(0);
    tree.insert(5);

    assertEquals(tree.getRootNode().getValue(), Integer.valueOf(6));
  }

  @Test
  public void TestInOrder(){
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    tree.insert(6);
    tree.insert(7);
    tree.insert(4);
    tree.insert(3);
    tree.insert(2);
    tree.insert(1);
    tree.insert(0);
    tree.insert(5);

    assertEquals(tree.getRootNode().getValue(), Integer.valueOf(6));
    
    Iterator<Integer> it = tree.iterator(TreeTraversalType.INORDER);

    assertEquals(Integer.valueOf(0), it.next());
    assertEquals(Integer.valueOf(1), it.next());
    assertEquals(Integer.valueOf(2), it.next());
    assertEquals(Integer.valueOf(3), it.next());
    assertEquals(Integer.valueOf(4), it.next());
    assertEquals(Integer.valueOf(5), it.next());
    assertEquals(Integer.valueOf(6), it.next());
    assertEquals(Integer.valueOf(7), it.next());

    return;
  }

  @Test
  public void TestLevelOrder(){
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    tree.insert(6);
    tree.insert(7);
    tree.insert(4);
    tree.insert(3);
    tree.insert(2);
    tree.insert(1);
    tree.insert(0);
    tree.insert(5);

    assertEquals(tree.getRootNode().getValue(), Integer.valueOf(6));
    
    Iterator<Integer> it = tree.iterator(TreeTraversalType.LEVELORDER);

    assertTrue(it.next() == 6);
    assertTrue(it.next() == 4);
    assertTrue(it.next() == 7);
    assertTrue(it.next() == 3);
    assertTrue(it.next() == 5);
    assertEquals(Integer.valueOf(2), it.next());
    assertTrue(it.next() == 1);
    assertTrue(it.next() == 0);

    return;
  }

  @Test
  public void TestPreorder(){
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    tree.insert(6);
    tree.insert(7);
    tree.insert(4);
    tree.insert(3);
    tree.insert(2);
    tree.insert(1);
    tree.insert(0);
    tree.insert(5);

    assertEquals(tree.getRootNode().getValue(), Integer.valueOf(6));
    
    Iterator<Integer> it = tree.iterator(TreeTraversalType.PREORDER);

    assertEquals(Integer.valueOf(6), it.next());
    assertEquals(Integer.valueOf(4), it.next());
    assertEquals(Integer.valueOf(3), it.next());
    assertEquals(Integer.valueOf(2), it.next());
    assertEquals(Integer.valueOf(1), it.next());
    assertEquals(Integer.valueOf(0), it.next());
    assertEquals(Integer.valueOf(5), it.next());
    assertEquals(Integer.valueOf(7), it.next());


    return;
  }

  @Test
  public void TestPostorder(){
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    tree.insert(6);
    tree.insert(7);
    tree.insert(4);
    tree.insert(3);
    tree.insert(2);
    tree.insert(1);
    tree.insert(0);
    tree.insert(5);

    assertEquals(tree.getRootNode().getValue(), Integer.valueOf(6));
    
    Iterator<Integer> it = tree.iterator(TreeTraversalType.POSTORDER);

    assertEquals(Integer.valueOf(0), it.next());
    assertEquals(Integer.valueOf(1), it.next());
    assertEquals(Integer.valueOf(2), it.next());
    assertEquals(Integer.valueOf(3), it.next());
    assertEquals(Integer.valueOf(5), it.next());
    assertEquals(Integer.valueOf(4), it.next());
    assertEquals(Integer.valueOf(7), it.next());
    assertEquals(Integer.valueOf(6), it.next());

    return;
  }

  @Test
  public void BinaryTreeIsNotFull(){
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    tree.insert(6);
    tree.insert(7);
    tree.insert(4);
    tree.insert(3);
    tree.insert(2);
    tree.insert(1);
    tree.insert(0);
    tree.insert(5);

    assertEquals(tree.getRootNode().getValue(), Integer.valueOf(6));

    assertTrue(tree.isFull() == false);
  }

  @Test
  public void BinaryTreeIsFull(){
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    tree.insert(3);
    tree.insert(2);
    tree.insert(1);

    assertTrue(tree.isFull() == true);
  }
}