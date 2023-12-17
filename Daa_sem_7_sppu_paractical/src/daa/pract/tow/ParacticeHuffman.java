package daa.pract.tow;

import java.util.HashMap;
import java.util.PriorityQueue;

class HuffmanNode implements Comparable<HuffmanNode>{
int frequency;
char data;
HuffmanNode left;
HuffmanNode right;


	public HuffmanNode(int frequency, char data) {
	super();
	this.frequency = frequency;
	this.data = data;
}


	@Override
	public int compareTo(HuffmanNode o) {
		// TODO Auto-generated method stub
		return this.frequency-o.frequency;
	}
	
}

public class ParacticeHuffman {

	public static void main(String[] args) {
		 String text="hsdddgsss";
		 
		 HashMap<Character, Integer> frequencymap=new HashMap<>();
		 
		 for(char letter :text.toCharArray()) {
			 frequencymap.put(letter, frequencymap.getOrDefault(letter,0)+1);
		 }
		 
		 PriorityQueue<HuffmanNode> pq=new PriorityQueue<>();
		 
		 
		 
}
