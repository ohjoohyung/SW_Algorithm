package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_Test {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        //Stack st = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //int n = Integer.parseInt(br.readLine());

        //4949번
        while (true) {
            String s = br.readLine();
            if(s.equals(".")) break;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == ')') {
                    if(st.isEmpty()) {
                        st.push(s.charAt(i));
                    }else if(!st.isEmpty() && st.peek() == '[') {
                        st.push(s.charAt(i));
                    }
                }else if(s.charAt(i) == ']') {
                    if (st.isEmpty()) {
                        st.push(s.charAt(i));
                    } else if (!st.isEmpty() && st.peek() == '(') {
                        st.push(s.charAt(i));
                    }
                }

                if(s.charAt(i) == '(' || s.charAt(i) == '[') {
                    st.push(s.charAt(i));
                }else if(!st.isEmpty()) {
                    if(st.peek() == '(' && s.charAt(i) ==')') {
                        st.pop();
                    }else if(st.peek() == '[' && s.charAt(i) ==']') {
                        st.pop();
                    }
                }
            }
            if(st.isEmpty()) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            st.clear();

        }


        //10773번
//        for(int i = 0; i < n; i++) {
//            int val = Integer.parseInt(br.readLine());
//            if(val > 0) {
//                st.push(val);
//            }else {
//                st.pop();
//            }
//        }
//        int sum = 0;
//        int len = st.size();
//        for(int i = 0; i < len; i++) {
//            sum+=st.pop();
//        }
//        System.out.println(sum);




        //10828번
//		for(int i  0; i < n; i++) {
//			String s = br.readLine();
//			switch (s) {
//			case "top": st.peek();
//				break;
//			case "size" : st.size();
//				break;
//			case "empty" : st.isEmpty();
//				break;
//			case "pop" : st.pop();
//				break;
//			default:
//				String[] sArr = s.split(" ");
//				st.push(Integer.parseInt(sArr[1]));
//				break;
//			}
//		}

//		for(int i = 0; i < n; i++) {
//			String s = br.readLine();
//			switch (s) {
//			case "top":
//				try {
//					System.out.println(st.peek());
//				} catch (Exception e) {
//					System.out.println(-1);
//				}
//				break;
//			case "size" : System.out.println(st.size());
//				break;
//			case "empty" :
//				if(st.isEmpty()) {
//					System.out.println(1);
//				}else {
//					System.out.println(0);
//				}
//				break;
//			case "pop" :
//				try {
//					System.out.println(st.pop());
//				} catch (Exception e) {
//					System.out.println(-1);
//				}
//				break;
//			default:
//				String[] sArr = s.split(" ");
//				st.push(Integer.parseInt(sArr[1]));
//				break;
//			}
//		}


        //9012번
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//
//		for(int i=0; i<n; i++) {
//			Stack<Character> stack = new Stack<Character>();
//			String s = br.readLine();
//			boolean isVPS = true;
//			for(int j=0; j<s.length(); j++) {
//				if(s.charAt(0) == ')') {
//					isVPS = false;
//					break;
//				}
//				if(s.charAt(j) == '(') {
//					stack.push('(');
//				}else {
//					if(stack.isEmpty()) {
//						isVPS = false;
//						break;
//					}
//					stack.pop();
//				}
//
//			}
//			if(isVPS && stack.size() == 0) {
//				System.out.println("YES");
//			}else {
//				System.out.println("NO");
//			}
//




    }




}
//class Stack {
//	int[] arr = new int[10000];
//    int top = -1;
//	void push(int n) {
//		arr[++top] = n;
//	}
//
//	void pop() {
//		if(top > -1) {
//			System.out.println(arr[top]);
//			top--;
//		}else {
//			System.out.println(-1);
//		}
//	}
//
//	void size() {
//		System.out.println(top+1);
//	}
//
//	void empty() {
//		if(top > -1) {
//			System.out.println(0);
//		}else {
//			System.out.println(1);
//		}
//	}
//
//
//	void top() {
//		if(top > -1) {
//			System.out.println(arr[top]);
//		}else {
//			System.out.println(-1);
//		}
//	}
//
//}


