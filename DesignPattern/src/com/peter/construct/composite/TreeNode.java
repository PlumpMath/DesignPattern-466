package com.peter.construct.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode implements IDisplay {
	
	private int num;
	
	private TreeNode parent;
	
	private List<TreeNode> 	children = new ArrayList<TreeNode>();
	
	public TreeNode(int num){
		this.num = num;
	}

	@Override
	public void display() {
		System.out.println("The num of this node is " + num);
		
		if (parent != null){
			
			System.out.println("Parent num is " + parent.getNum());
		}
		
		
		System.out.println("The children count of this node is " + children.size());
		
		for (TreeNode child:children){
			child.display();
		}
	}

	public int getNum() {
		return num;
	}
	
	public void addChild(TreeNode child){
		children.add(child);
	}
	
	public void removeChild(TreeNode child){
		if (children.contains(child)){
			children.remove(child);
		}
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	
	
}
