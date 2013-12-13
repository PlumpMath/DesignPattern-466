package com.peter.construct.composite;

public class Client {
	
	/**
	 * 这个二叉树编写的有问题，以后有时间回来再写
	 * @param args
	 */
	public static void main(String[] args){
		
		int n = 1;
		TreeNode root = new TreeNode(n);
		TreeNode parent = root;
		for (int i=0; i<=5; i++){
			TreeNode node = new TreeNode(++n);
			node.setParent(root);
			parent = node;
			node.addChild(new TreeNode(++n));
			node.addChild(new TreeNode(++n));
		}
		
		root.display();
	}
	
	/**
	 * 该二叉树所有的节点数
	 * @param num
	 * @return
	 */
	public TreeNode CreateTree(int num){
		
		int n = 1;
		
		TreeNode root = new TreeNode(n);
		
		while (n<=num){
			
			//先建立根节点		
			//再建立左节点			
		}
		return root;
		
	}
	
	public void addChild(TreeNode parent){

		TreeNode left = new TreeNode(1);
		parent.addChild(left);
		
		//再建立右节点
		TreeNode right = new TreeNode(1);
		parent.addChild(right);
		addChild(left);
		addChild(right);
	}

}
