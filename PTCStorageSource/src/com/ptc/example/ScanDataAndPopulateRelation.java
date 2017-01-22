package com.ptc.example;

import Demo.*;
import PTCFramework.ProducerIterator;



public class ScanDataAndPopulateRelation{
	public static void main(String[] args) throws Exception{
		ProducerIterator<byte []> textFileProducerIterator= new TextFileScanIterator();
		ConsumerIterator<byte []> relationConsumerIterator = new PutTupleInRelationIterator(35,"myDisk1");
		PTCFramework<byte[],byte[]> fileToRelationFramework= new TextFileToRelationPTC(textFileProducerIterator, relationConsumerIterator);
		fileToRelationFramework.run();
		
		
		
		
		
		
	}
	

}