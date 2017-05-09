package com.basic.ds;

public class Intial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryHeap bh = new BinaryHeap();
		bh.insert(5);
		bh.insert(14);
		bh.insert(3);
		
		System.out.println(bh.delMin());
		System.out.println(bh.delMin());
		System.out.println(bh.delMin());

	}

}
