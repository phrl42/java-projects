package org.bunkerserver.DSA.BinaryTree;

import java.util.Iterator;

import org.bunkerserver.DSA.BinaryTree.TreeTraversalType;

public interface IBinarySearchTreeIterable<T extends Comparable<T>> extends IBinarySearchTree<T> {

    public Iterator<T> iterator(TreeTraversalType traversalType);

}
