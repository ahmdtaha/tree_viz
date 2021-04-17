package tree_viz;

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
		
		
		CompactTreeViz bstTreeViz = new CompactTreeViz(bst);
		
		bstTreeViz.drawBinaryTreeToFile("./bst");
		bst.insert(50);
		bstTreeViz.drawBinaryTreeToFile("./bst_insert50");
		
		BTree<Integer> btree = new BTree<Integer>();		
		for (int i : new int[]{10, 20, 30,40,50,60,25,5} )
			btree.add(i);
		
		System.out.println(btree.toString());
		
		CompactTreeViz bTreeViz = new CompactTreeViz(btree);
		bTreeViz.drawBTreeToFile(btree.getTreeOrder(), "./btree");
	}

}
