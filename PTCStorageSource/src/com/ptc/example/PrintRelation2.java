package com.ptc.example;

import com.ptc.example.PTCFramework;
import Demo.GetTupleFromRelationIterator;

public class PrintRelation2{
	public static void main(String args[]) throws Exception{
		System.out.println("The tuples after loading file to Relation are: ");
		GetTupleFromRelationIterator getTupleFromRelationIterator= new GetTupleFromRelationIterator("myDisk1", 35, 0);
		getTupleFromRelationIterator.open();
		int indexTuple=0;
		while(getTupleFromRelationIterator.hasNext()){
			byte [] tuple = getTupleFromRelationIterator.next();
			//System.out.println(new String(tuple).toString());
			indexTuple++;
			System.out.println("Line "+indexTuple+": "+toInt(tuple, 0)+", "+new String(tuple).substring(4, 18).trim()+", "+ new String(tuple).substring(27,31).trim()+", "+ toInt(tuple, 31));
			
			//System.out.println(new String(tuple).substring(0, 23).trim()+" , "+ new String(tuple).substring(23,27).trim()+" , "+ toInt(tuple, 31));
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