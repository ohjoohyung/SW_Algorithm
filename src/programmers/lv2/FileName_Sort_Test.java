package programmers.lv2;

public class FileName_Sort_Test {
    //파일명 정렬
    //지저분하지만 풀었다.
    //안정정렬인 버블 정렬로 풀었고 정렬은 어렵지 않았다.
    //다만 문자열 나누는게 조건이 많았는데 숫자 길이가 5보다 클 때, tail이 없을 때를 생각해서 나눠야한다.
    public String[] solution(String[] files) {
        for (int i = 0; i < files.length; i++) {
            for (int j = 1; j < files.length - i; j++) {
                sort(files[j - 1], files[j], files, j);
            }
        }
        return files;
    }
    static void sort(String file1, String file2, String[] files, int index) {
        String[] file1Arr = splitString(file1);
        String[] file2Arr = splitString(file2);
        String file1Head = file1Arr[0].toLowerCase();
        String file2Head = file2Arr[0].toLowerCase();
        if (file1Head.equals(file2Head)) {
            int file1Number = Integer.parseInt(file1Arr[1]);
            int file2Number = Integer.parseInt(file2Arr[1]);
            if (file1Number > file2Number) {
                swap(index - 1, index, files);
            }
        }else {
            if (file1Head.compareTo(file2Head) > 0) {
                swap(index - 1, index, files);
            }
        }
    }

    static String[] splitString(String file) {
        String[] array = new String[3];
        String tmp = "";
        int index = 0;
        for (int i = 0; i < file.length(); i++) {
            if (file.charAt(i) >= '0' && file.charAt(i) <= '9') {
                array[0] = tmp;
                tmp = "";
                index = i;
                break;
            }
            tmp += file.charAt(i);
        }

        for (int i = index; i < file.length(); i++) {
            if (!(file.charAt(i) >= '0' && file.charAt(i) <= '9')) {
                array[1] = tmp;
                array[2] = file.substring(i, file.length());
                break;
            }
            tmp += file.charAt(i);
            if (tmp.length() == 5) {
                array[1] = tmp;
                array[2] = file.substring(i, file.length());
                break;
            }
            if (i == file.length() - 1) {
                array[1] = tmp;
                break;
            }
        }
        return array;
    }

    static void swap(int index1, int index2, String[] arr) {
        String tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
