package programmers.lv3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Visit_Length_Test {
    //방문 길이
    //Point 클래스를 만들고 set을 이용해 중복 체크를 해주었다.
    //현재 x, y, 다음 포인트가 똑같으면 equals와 hashcode를 이용해 같은 클래스로 정의를 했기 때문에
    //set을 이용한 중복 체크가 가능하다.
    //다만 이 경우 UDU와 같이 현재 x, y 값이 다르고 다음 포인트도 다르지만 이미 방문한 길 체크는 불가능하여
    //현재 x, y와 다음 포인트를 뒤집은 인스턴스가 set에 존재하는지에 따라 add를 할지 안할지 정하여서 해결했다.
    //코드는 많이 지저분하지만 풀었다는 것에 만족한다.
    public int solution(String dirs) {
        Set<Point> pointSet = new HashSet<>();
        Point point = new Point(0, 0);
        for (int i = 0; i < dirs.length(); i++) {
            char command = dirs.charAt(i);
            int nowX = point.x;
            int nowY = point.y;
            if (command == 'U') {
                if (nowY + 1 <= 5) {
                    Point nextPoint = new Point(nowX, nowY + 1);
                    if (!pointSet.contains(new Point(nowX, nowY + 1, point))) {
                        pointSet.add(new Point(nowX, nowY, nextPoint));
                    }
                    point = nextPoint;
                }
            }else if (command == 'D') {
                if (nowY - 1 >= -5) {
                    Point nextPoint = new Point(nowX, nowY - 1);
                    if (!pointSet.contains(new Point(nowX, nowY - 1, point))) {
                        pointSet.add(new Point(nowX, nowY, nextPoint));
                    }
                    point = nextPoint;
                }
            }else if (command == 'R') {
                if (nowX + 1 <= 5) {
                    Point nextPoint = new Point(nowX + 1, nowY);
                    if (!pointSet.contains(new Point(nowX + 1, nowY, point))) {
                        pointSet.add(new Point(nowX, nowY, nextPoint));
                    }
                    point = nextPoint;
                }
            }else {
                if (nowX - 1 >= -5) {
                    Point nextPoint = new Point(nowX - 1, nowY);
                    if (!pointSet.contains(new Point(nowX - 1, nowY, point))) {
                        pointSet.add(new Point(nowX, nowY, nextPoint));
                    }
                    point = nextPoint;
                }
            }
        }
        return pointSet.size();
    }
    static class Point {
        private int x;
        private int y;
        private Point nextPoint;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Point(int x, int y, Point nextPoint) {
            this.x = x;
            this.y = y;
            this.nextPoint = nextPoint;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y && Objects.equals(nextPoint, point.nextPoint);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, nextPoint);
        }
    }
}
