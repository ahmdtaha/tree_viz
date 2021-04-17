package trees;


import java.util.ArrayList;
/*
 *  Java Program to Implement Binary Search Tree
 */
 import java.util.Scanner;

import tree_viz.VizableTree;
 
 /* Class BSTNode */
 // Credit : https://github.com/mvyas85/Binary-Tree/blob/master/src/BST/BinarySearchTree.java
 class BSTNode
 {
     BSTNode left, right;
     int data;
 
     public String vizString()
     {
     	return data+"";
     }
     /* Constructor */
     public BSTNode()
     {
         left = null;
         right = null;
         data = 0;
     }
     /* Constructor */
     public BSTNode(int n)
     {
         left = null;
         right = null;
         data = n;
     }
     /* Function to set left node */
     public void setLeft(BSTNode n)
     {
         left = n;
     }
     /* Function to set right node */ 
     public void setRight(BSTNode n)
     {
         right = n;
     }
     /* Function to get left node */
     public BSTNode getLeft()
     {
         return left;
     }
     /* Function to get right node */
     public BSTNode getRight()
     {
         return right;
     }
     /* Function to set data to node */
     public void setData(int d)
     {
         data = d;
     }
     /* Function to get data from node */
     public int getData()
     {
         return data;
     }     
 }
 // https://github.com/mvyas85/Binary-Tree/blob/master/src/BST/BinarySearchTree.java
 /* Class BST */
public class BST implements VizableTree
 {
     private BSTNode root;
 
     /* Constructor */
     public BST()
     {
         root = null;
     }
     /* Function to check if tree is empty */
     public boolean isEmpty()
     {
         return root == null;
     }
     /* Functions to insert data */
     public void insert(int data)
     {
         root = insert(root, data);
     }
     /* Function to insert data recursively */
     private BSTNode insert(BSTNode node, int data)
     {
         if (node == null)
             node = new BSTNode(data);
         else
         {
             if (data <= node.getData())
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
     }
       
     
     
     
 	public ArrayList<String> treeDescription(boolean verbose)
 	{
 		ArrayList<String> tree = new ArrayList<String>();
 		treeDescription(root,"",tree,verbose);
 		return tree;
 	}
 	
 	private void treeDescription(BSTNode root,String space,ArrayList<String> tree,boolean verbose)
 	{
 		if(root== null)
 		{

 			tree.add(space+"*");
 			return;
 		}
 		if (verbose)
 			System.out.println(space+root.vizString());

 		tree.add(space+root.vizString());
 		treeDescription(root.getLeft(), space+" ",tree,verbose);
 		treeDescription(root.getRight(), space+" ",tree,verbose);
 	}
 }
 
