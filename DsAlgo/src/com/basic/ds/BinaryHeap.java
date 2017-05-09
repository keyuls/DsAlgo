package com.basic.ds;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {
	
	int currentSize;
	List<Integer> heapList= new ArrayList<Integer>();
	
	public BinaryHeap(){	
		heapList.add(0);
		currentSize=0;
	}

	public void insert(int element){
		heapList.add(element);
		currentSize++;
		precUp(currentSize);
	}
	
	public void precUp(int i){
		while((i/2)>0){
			int newElement = heapList.get(i);
			int parent= heapList.get(i/2);
			if(parent>newElement){
				heapList.add(i, parent);
				heapList.add(i/2,newElement);
			}
		}
	}
	
	public void precDown(int i){
		while(i*2<currentSize){
			int mc= minChild(i);
			if(heapList.get(i)>heapList.get(mc)){
				int tmp= heapList.get(i);
				heapList.add(i, heapList.get(mc));
				heapList.add(mc,tmp);
			}
			i=mc;
		}
	}
	
	public int minChild(int i){
		if((i*2)+1>currentSize)
			return i*2;
		else{
			if(heapList.get(i*2)<heapList.get((i*2)+1))
				return i*2;
			else
				return (i*2)+1;
		}
	}
	
	public int delMin(){
		int retVal= heapList.get(1);
		heapList.add(1, heapList.get(currentSize));
		currentSize--;
		precDown(1);
		return retVal;
	}
}
