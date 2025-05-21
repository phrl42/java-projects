package main;

import java.util.Iterator;

import Iterator.InorderIterator;
import Iterator.InorderNodeIterator;
import Iterator.LevelorderIterator;
import Iterator.PostorderIterator;
import Iterator.PreorderIterator;

public class BinarySearchTree<T extends Comparable<T>> implements IBinarySearchTreeIterable<T> {

    private IBinaryTreeNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    @Override
    public void insert(T t) {
        this.root = this.insert(this.root, t);
    }

    private IBinaryTreeNode<T> insert(IBinaryTreeNode<T> node, T t) {
        if (node == null) {
            IBinaryTreeNode<T> newNode = new BinaryTreeNode<>();
            newNode.setValue(t);
            return newNode;
        }
        if (t.compareTo(node.getValue()) < 0) {
            node.setLeftChild(this.insert(node.getLeftChild(), t));
        } else if (t.compareTo(node.getValue()) > 0) {
            node.setRightChild(this.insert(node.getRightChild(), t));
        }
        return node;
    }

    @Override
    public IBinaryTreeNode<T> getRootNode() {
        return this.root;
    }

    @Override
    public boolean isFull() {

        IBinaryTreeNode<T> node = this.root;

        while(node != null){
            
        }
        
    }

    @Override
    public Iterator<T> iterator(TreeTraversalType traversalType) {
        switch (traversalType) {
            case INORDER:
                return new InorderIterator<T>(root);
            case POSTORDER:
                return new PostorderIterator<T>(root);
            case PREORDER:
                return new PreorderIterator<T>(root);
            case LEVELORDER:
                return new LevelorderIterator<T>(root);
            default:
                throw new IllegalArgumentException();
        }
    }

}