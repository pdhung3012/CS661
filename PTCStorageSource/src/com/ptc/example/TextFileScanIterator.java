package com.ptc.example;

import java.io.File;
import java.util.Scanner;

import Demo.*;
import PTCFramework.ProducerIterator;


public class TextFileScanIterator implements ProducerIterator<byte []>{
	File file;
	Scanner in;
	int count=0;
	public boolean hasNext() {
		return in.hasNextLine();
	}

	public byte [] next() {
		count++;
		return in.nextLine().getBytes();
	}

	@Override
	public void remove() {
		
	}

	public void open() throws Exception {
		file= new File("Emp.txt");
		in=new Scanner(file);
	}

	public void close() throws Exception {
		in.close();
	}
	
}