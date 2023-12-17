package daa.pract.tow;

import java.util.PriorityQueue;
import java.util.HashMap;

class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left;
    HuffmanNode right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return this.frequency - other.frequency;
    }
}

public class HuffmanEncoding {
    public static void main(String[] args) {
        String text = "thiishttbbsxcgf";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();

        for (char c : frequencyMap.keySet()) {
            HuffmanNode node = new HuffmanNode(c, frequencyMap.get(c));
            priorityQueue.add(node);
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode combined = new HuffmanNode('\0', left.frequency + right.frequency);
            combined.left = left;
            combined.right = right;
            priorityQueue.add(combined);
        }

        HuffmanNode root = priorityQueue.poll();
        HashMap<Character, String> huffmanCodes = new HashMap<>();
        buildHuffmanCodes(root, "", huffmanCodes);

        System.out.println("Huffman Codes:");
        for (char c : huffmanCodes.keySet()) {
            System.out.println(c + ": " + huffmanCodes.get(c));
        }
    }

    private static void buildHuffmanCodes(HuffmanNode node, String code, HashMap<Character, String> huffmanCodes) {
        if (node == null) {
            return;
        }

        if (node.data != '\0') {
            huffmanCodes.put(node.data, code);
        }

        buildHuffmanCodes(node.left, code + "0", huffmanCodes);
        buildHuffmanCodes(node.right, code + "1", huffmanCodes);
    }
}

