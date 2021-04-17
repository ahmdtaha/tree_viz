package tree_viz;

import java.util.ArrayList;

import trees.BST;
import trees.BTree;

public class Main {

	public static void main(String[] args) {
		
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
		bst.insert(50);
		comTreeViz.drawBinaryTreeToFile(bst.treeDescription(false), "./bst_insert50");
		
		BTree<Integer> btree = new BTree<Integer>();		
		for (int i : new int[]{10, 20, 30,40,50,60,25,5} )
			btree.add(i);
		
		System.out.println(btree.toString());
		ArrayList<String> btreeDescription = btree.treeDescription(false);
		comTreeViz.drawBTreeToFile(btreeDescription, btree.getTreeOrder(), "./btree");
	}

}
