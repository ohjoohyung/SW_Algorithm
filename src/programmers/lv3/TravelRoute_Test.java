package programmers.lv3;

import java.util.*;

public class TravelRoute_Test {
    static List<String> list = new ArrayList<>();
    static String route = "";
    static boolean[] visited;
    public static void main(String[] args) {
        //여행경로
        //dfs, bfs 문제
        //예시에 테스트케이스는 만족하도록 풀었는데 ICN이 무조건 첫 시작인 걸 모르고 짜버려서 검색 후 해결했다.
        //문제를 꼼꼼히 읽는 습관을 들이자 제발..

        //String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
//        Map<String, Map<String, Boolean>> map = new HashMap<>();
//        for (int i = 0; i < tickets.length; i++) {
//            if (map.get(tickets[i][0]) == null) {
//                Map<String, Boolean> tmpMap = new HashMap<>();
//                tmpMap.put(tickets[i][1], false);
//                map.put(tickets[i][0], tmpMap);
//            }else {
//                Map<String, Boolean> tmpMap = map.get(tickets[i][0]);
//                tmpMap.put(tickets[i][1], false);
//                tmpMap.entrySet().stream()
//                        .sorted(Map.Entry.comparingByKey());
//            }
//        }
//        String[] answer = new String[tickets.length + 1];
//        for (String key : map.keySet()) {
//            answer[index++] = key;
//            dfs(key, map, answer);
//            if (index == answer.length) {
//                break;
//            }
//            index = 0;
//        }
//        for (String s : answer) {
//            System.out.println(s);
//        }

        for (int i = 0; i < tickets.length; i++) {
            visited = new boolean[tickets.length];
            String start = tickets[i][0];
            String end = tickets[i][1];
            if (start.equals("ICN")) {
                route = start + ",";
                visited[i] = true;
                dfs(tickets, end, 1);
            }
        }
        Collections.sort(list);
        String[] answer = list.get(0).split(",");

    }

    static void dfs(String[][] tickets, String end, int count) {
        route += end + ",";
        if (count == tickets.length) {
            list.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            String newStart = tickets[i][0];
            String newEnd = tickets[i][1];
            if (newStart.equals(end) && !visited[i]) {
                visited[i] = true;
                dfs(tickets, newEnd, count + 1);
                visited[i] = false;
                route = route.substring(0, route.length() - 4);
            }
        }
    }

//    static void dfs(String key, Map<String, Map<String, Boolean>> map, String[] answer) {
//        Map<String, Boolean> tmpMap = map.get(key);
//        if (tmpMap == null) {
//            return;
//        }
//        for (String tmpKey : tmpMap.keySet()) {
//            if (!tmpMap.get(tmpKey)) {
//                tmpMap.put(tmpKey, true);
//                answer[index++] = tmpKey;
//                dfs(tmpKey, map, answer);
//                tmpMap.put(tmpKey, false);
//            }
//            if (index == answer.length) {
//                break;
//            }
//
//        }
//    }
}
