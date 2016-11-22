package eu.sig.training.ch03;

import eu.sig.training.ch03.TreeException;
import eu.sig.training.ch03.BinaryTreeNode;

public class BinaryTreeSearch {
	
	public static int handleNode(BinaryTreeNode<Integer> node, int val) {
        if (node == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + calculateDepth(node, val);
        }		
	}
	
    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        if(node == null){
        	throw new IllegalArgumentException("A reference to argument 'node' was not specified");
        }
        if (node.getValue() == nodeValue) {
            return 0;
        } else {
        	BinaryTreeNode<Integer> newNode;
        	if (nodeValue < node.getValue()) {
                newNode = node.getLeft();
            } else {
                newNode = node.getRight();
            }
        	return handleNode(newNode, nodeValue);
        }
    }
    // end::calculateDepth[]
}
