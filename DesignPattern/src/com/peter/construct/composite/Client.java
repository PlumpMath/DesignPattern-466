package com.peter.construct.composite;

public class Client {
	
	/**
	 * �����������д�������⣬�Ժ���ʱ�������д
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
	 * �ö��������еĽڵ���
	 * @param num
	 * @return
	 */
	public TreeNode CreateTree(int num){
		
		int n = 1;
		
		TreeNode root = new TreeNode(n);
		
		while (n<=num){
			
			//�Ƚ������ڵ�		
			//�ٽ�����ڵ�			
		}
		return root;
		
	}
	
	public void addChild(TreeNode parent){

		TreeNode left = new TreeNode(1);
		parent.addChild(left);
		
		//�ٽ����ҽڵ�
		TreeNode right = new TreeNode(1);
		parent.addChild(right);
		addChild(left);
		addChild(right);
	}

}
