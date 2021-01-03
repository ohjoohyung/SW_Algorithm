package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class Music_Test {
    //방금그곡
    //문제는 길었는데 이해는 쉬웠다.
    //# 처리를 어떻게 해야하나 고민을 계속하다 검색해서 다른 문자로 파싱하는 힌트를 보고 문제를 해결했다.
    //알고리즘에서 간만에 따로 클래스 빼고 메소드를 여러 개 만드니 프리코스 느낌나고 재밌었다.
    public String solution(String m, String[] musicinfos) {
        String[] oldNote = {"C#", "D#", "F#", "G#", "A#"};
        String[] newNote = {"c", "d", "f", "g", "a"};
        List<MusicInfo> musics = new ArrayList<>();
        for (int i = 0; i < musicinfos.length; i++) {
            String[] music = musicinfos[i].split(",");
            int time = calculateTime(music[0], music[1]);
            String newNotes = changeNotes(music[3], oldNote, newNote);

            StringBuilder sb = new StringBuilder();
            int tmpTime = time;
            int index = 0;
            while (tmpTime > 0) {
                if (index == newNotes.length()) {
                    index = 0;
                }
                sb.append(newNotes.charAt(index++));
                tmpTime--;
            }
            String sumMusic = sb.toString();

            if (sumMusic.contains(changeNotes(m, oldNote, newNote))) {
                musics.add(new MusicInfo(music[2], time));
            }
        }

        int maxTime = 0;
        String answer = "(None)";
        for (MusicInfo musicInfo : musics) {
            if (musicInfo.musicTime > maxTime) {
                maxTime = musicInfo.musicTime;
                answer = musicInfo.musicName;
            }
        }
        return answer;
    }

    static class MusicInfo {
        String musicName;
        int musicTime;

        MusicInfo(String musicName, int musicTime) {
            this.musicName = musicName;
            this.musicTime = musicTime;
        }
    }

    static int calculateTime(String startTime, String endTime) {
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");

        int startMinutes = Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]);
        int endMinutes = Integer.parseInt(end[0]) * 60 + Integer.parseInt(end[1]);
        return endMinutes - startMinutes;
    }

    static String changeNotes(String notes, String[] oldNote, String[] newNote) {
        for (int i = 0; i < oldNote.length; i++) {
            notes = notes.replaceAll(oldNote[i], newNote[i]);
        }
        return notes;
    }
}
