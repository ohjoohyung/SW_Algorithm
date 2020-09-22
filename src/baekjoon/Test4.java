package baekjoon;

public class Test4 {
    //11328번
    //이건 내가 푼것
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        for(int i = 0; i < n; i++) {
//            String s1 = sc.nextLine();
//            String[] arr = s1.split(" ");
//            if(arr[0].length() != arr[1].length()) {
//                System.out.println("Impossible");
//                continue;
//            }
//            int count = 0;
//            char[] cArr = arr[1].toCharArray();
//            for(int j = 0; j < arr[0].length(); j++) {
//                for(int k = 0; k < cArr.length; k++) {
//                    if(arr[0].charAt(j) == cArr[k]) {
//                        count++;
//                        cArr[k] = '0';
//                        break;
//                    }
//                }
//            }
//            if(count == arr[0].length()) {
//                System.out.println("Possible");
//            }else {
//                System.out.println("Impossible");
//            }
//
//
//        }
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = Integer.parseInt(sc.nextLine());
//        for(int t=0;t<n;t++) {
//            String s1 = sc.next();
//            String s2 = sc.next();
//
//            int arr1[] = new int[26];
//            int arr2[] = new int[26];
//            for(int i=0;i<s1.length();i++)
//                arr1[s1.charAt(i) - 'a']++;
//            for(int i=0;i<s2.length();i++)
//                arr2[s2.charAt(i) - 'a']++;
//            boolean flag = true;
//            for(int i=0;i<26;i++) {
//                if(arr1[i] != arr2[i]) {
//                    flag = false;
//                    break;
//                }
//            }
//            System.out.println(flag ? "Possible" : "Impossible");
//        }
//    }



    //14954번
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n1 = Integer.parseInt(sc.nextLine());
//        int n2 = n1;
//        while(n2 != 1) {
//            String[] arr = String.valueOf(n2).split("");
//            for(int i = 0; i < arr.length; i++) {
//                if(i == 0) {
//                    n2 = Integer.parseInt(arr[i])*Integer.parseInt(arr[i]);
//                }else {
//                    n2 += Integer.parseInt(arr[i])*Integer.parseInt(arr[i]);
//                }
//            }
//            if(n2 == 4) {
//                System.out.println("UNHAPPY");
//                break;
//            }
//        }
//        if(n2 == 1) {
//            System.out.println("HAPPY");
//        }
//    }
//



    //16304번
    //이건 내가 푼 것
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        Arrays.sort(arr);
//        int count = 0;
//        for(int i = arr.length - 1; i > 0; i--) {
//            if(arr[i] + arr[i-1] > x) {
//                count++;
//            }else {
//                break;
//            }
//        }
//        System.out.println(arr.length - count);
//
//
//    }


    //BufferedReader를 쓰자
//    public static void main(String[] args) {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n, x;
//        int arr[];
//        String firstLine, secondLine;
//        String fLine[] = new String[2];
//        String[] str;
//        try {
//            firstLine = br.readLine();
//            fLine = firstLine.split(" ");
//            n = Integer.parseInt(fLine[0]);
//            x = Integer.parseInt(fLine[1]);
//            arr = new int[n];
//            secondLine = br.readLine();
//            str = new String[n];
//            str = secondLine.split(" ");
//            for (int i = 0; i < n; i++)
//                arr[i] = Integer.parseInt(str[i]);
//
//            Arrays.sort(arr);
//            int count = 0;
//            for (int i = arr.length - 1; i > 0; i--) {
//                if (arr[i] + arr[i - 1] > x) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
//            System.out.println(arr.length - count);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
