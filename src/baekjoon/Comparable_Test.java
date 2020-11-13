package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

import javax.jws.soap.SOAPBinding.Use;

public class Comparable_Test {
    public static void main(String[] args) throws NumberFormatException, IOException {
//		List<MyDouble> list = new ArrayList<MyDouble>();
//		list.add(new MyDouble(1));
//		list.add(new MyDouble(2));
//		list.add(new MyDouble(3));
//		Collections.sort(list);
//
//		for(MyDouble d : list) {
//			System.out.println(d.val);
//		}

//		List<MyCircle> list = new ArrayList<MyCircle>();
//		list.add(new MyCircle(4, -3, 7));
//		list.add(new MyCircle(9, -7, 4));
//		list.add(new MyCircle(9, -3, 6));
//		list.add(new MyCircle(9, -7, 8));
//		list.add(new MyCircle(9, -2, 4));
//		list.add(new MyCircle(4, -3, 9));
//		list.add(new MyCircle(4, -5, 6));
//		list.add(new MyCircle(4, -5, 7));
//		list.add(new MyCircle(4, -3, 8));
//		list.add(new MyCircle(4, -2, 9));
//		//Collections.sort(list, new MyComparator());
//		Collections.sort(list, new Comparator<MyCircle>() {
//			@Override
//			public int compare(MyCircle o1, MyCircle o2) {
//				return o1.r < o2.r ?
//						1 :(o1.r == o2.r ?
//								(o1.x > o2.x ?
//										1 : (o1.x == o2.x ?
//												(o1.y < o2.y ? 1 : -1) : -1
//											)
//								) : -1
//							);
//			}
//		}
//		);
//		for(MyCircle c : list) {
//			System.out.println("r: "+c.r + "/" + "x: "+ c.x +"/"+"y: "+c.y);
//		}

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		1181번
//		int N = Integer.parseInt(br.readLine());
//		String[] arr = new String[N];
//		for(int i = 0; i < N; i++) {
//			arr[i] = br.readLine();
//		}
//
//		Arrays.sort(arr, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				if(o1.length() > o2.length()) {
//					return 1;
//				}else if(o1.length() == o2.length()) {
//					return o1.compareTo(o2);
//				}
//				return -1;
//			}
//		});
//
//		String tmp ="";
//		for(String s : arr) {
//			if(tmp.equals(s)) continue;
//			System.out.println(s);
//			tmp = s;
//		}

        //11650번
//		int N = Integer.parseInt(br.readLine());
//		List<Point> list = new ArrayList<Point>();
//		for(int i=0; i<N; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			list.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
//		}
//
//		Collections.sort(list);
//		for(Point p : list) {
//			System.out.println(p.x + " " + p.y);
//		}



        //10814번
        int N = Integer.parseInt(br.readLine());
        User[] arr = new User[N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new User(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Comparator<User> com = new Comparator<User>() {
            public int compare(User o1, User o2) {
                if(o1.age >= o2.age) {
                    return 1;
                }
                return -1;
            }

        };
        Arrays.sort(arr, com);
        for(User u : arr) {
            bw.append(u.age + " " + u.name + "\n");
        }
        bw.flush();
        bw.close();

    }

    static class User {
        int age;
        String name;
        User (int age, String name) {
            this.age = age;
            this.name = name;
        }
    }



    static class Point implements Comparable<Point> {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point o) {
            if(this.y > o.y) {
                return 1;
            }else if(this.y == o.y) {
                if(this.x > o.x) {
                    return 1;
                }
            }
            return -1;
        }


    }




}





//class MyDouble implements Comparable<MyDouble> {
//
//	double val;
//
//	public MyDouble(double val) {
//		this.val = val;
//	}
//
//	@Override
//	public int compareTo(MyDouble o) {
//		if(this.val > o.val) {
//			return -1;
//		}else if(this.val == o.val) {
//			return 0;
//		}
//		return 1;
//	}
//
//}
//
//class MyCircle {
//
//	int r;
//	int x;
//	int y;
//
//	public MyCircle(int r, int x, int y) {
//		this.r = r;
//		this.x = x;
//		this.y = y;
//	}
//
////	@Override
////	public int compareTo(MyCircle o) {
//////		if(this.r < o.r) {
//////			return 1;
//////		}else if(this.r == o.r) {
//////			if(this.x > o.x) {
//////				return 1;
//////			}else if(this.x == o.x) {
//////				if(this.y < o.y) {
//////					return 1;
//////				}
//////			}
//////		}
//////		return -1;
////		return this.r < o.r ?
////				1 :(this.r == o.r ?
////						(this.x > o.x ?
////								1 : (this.x == o.x ?
////										(this.y < o.y ? 1 : -1) : -1
////									)
////						) : -1
////					);
////	}
//}

//
//class MyComparator implements Comparator<MyCircle> {
//
//	@Override
//	public int compare(MyCircle o1, MyCircle o2) {
//		return o1.r < o2.r ?
//				1 :(o1.r == o2.r ?
//						(o1.x > o2.x ?
//								1 : (o1.x == o2.x ?
//										(o1.y < o2.y ? 1 : -1) : -1
//									)
//						) : -1
//					);
//	}
//
//}



