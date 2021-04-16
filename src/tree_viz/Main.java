package tree_viz;

import java.util.ArrayList;

import trees.BST;
import trees.BTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		BST bst = new BST();
		bst.insert(10);
		bst.insert(40);
		bst.insert(30);
		bst.insert(5);
		bst.insert(7);
		bst.insert(2);
		
		ArrayList<String> bstDescription = bst.treeDescription(false);
		
		CompactTreeViz comTreeViz = new CompactTreeViz();
		
		comTreeViz.drawBinaryTreeToFile(bstDescription, "./bst");
		
		
		
		BTree<Integer> btree = new BTree<Integer>();		
		for (int i : new int[]{10, 20, 30,40,50,60,25,5} )
			btree.add(i);
		
		System.out.println(btree.toString());
		ArrayList<String> btreeDescription = btree.treeDescription(false);
		comTreeViz.drawBTreeToFile(btreeDescription, btree.getTreeOrder(), "./btree");
	}

}
