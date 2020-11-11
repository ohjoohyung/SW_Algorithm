package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.LinkedList;
import java.util.ListIterator;


public class Test_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        LinkedList<Character> list = new LinkedList<Character>();
        for(int i=0; i<s.length(); i++) {
            list.add(s.charAt(i));
        }

        int M = Integer.parseInt(br.readLine());

        ListIterator<Character> iterator = list.listIterator();
        while(iterator.hasNext()) {
            iterator.next();
        }

        for(int i=0; i<M; i++) {
            String order = br.readLine();
            char c = order.charAt(0);
            if(c == 'L') {
                if(iterator.hasPrevious()) {
                    iterator.previous();
                }
            }else if(c == 'D') {
                if(iterator.hasNext()) {
                    iterator.next();
                }
            }else if(c == 'B') {
                if(iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
            }else {
                char t = order.charAt(2);
                iterator.add(t);
            }
        }

        for(Character c : list) {
            bw.write(c);
        }
        bw.flush();
        bw.close();

    }


//	static class Node {
//		char val;
//		int index;
//		Node prev;
//		Node next;
//	}
//
//	static class MyLinkedList {
//		int index;
//		public MyLinkedList() {
//			index = 0;
//		}
//
//		Node get(int index) {
//			Node first =
//			for(int i=0; i<index; i++) {
//
//			}
//		}
//
//		void add(Node node) {
//
//		}
//	}

}
