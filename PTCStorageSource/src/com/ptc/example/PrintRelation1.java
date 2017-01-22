package com.ptc.example;

import Demo.*;

public class PrintRelation1{
	public static void main(String args[]) throws Exception{
		System.out.println("The tuples after loading file to Relation are: ");
		GetTupleFromRelationIterator getTupleFromRelationIterator= new GetTupleFromRelationIterator("myDisk1", 35, 0);
		getTupleFromRelationIterator.open();
		while(getTupleFromRelationIterator.hasNext()){
			byte [] tuple = getTupleFromRelationIterator.next();
		//	System.out.println("aaa "+toInt(tuple, 1)+" aaaa, "+new String(tuple).substring(4, 28)+", "+ new String(tuple).substring(29,31)+", "+ toInt(tuple, 32));
			System.out.println(new String(tuple));
		}
	}
	
	
	private static int toInt(byte[] bytes, int offset) {
		  int ret = 0;
		  for (int i=0; i<4; i++) {
		    ret <<= 8;
		    ret |= (int)bytes[offset+i] & 0xFF;
		  }
		  return ret;
		}
}