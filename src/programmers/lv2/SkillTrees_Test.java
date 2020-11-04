package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SkillTrees_Test {
    //스킬트리
    //for문 3개를 쓰긴 하지만 잘 풀렸다.
    public int solution(String skill, String[] skill_trees) {
        char[] cArr = skill.toCharArray();
        int index = 0;
        boolean check = false;
        int answer = 0;
        for(int i=0; i< skill_trees.length; i++) {
            for(int j=0; j<skill_trees[i].length(); j++) {
                for(int l=0; l< cArr.length; l++) {
                    if(cArr[l] == skill_trees[i].charAt(j)) {
                        if(l == index) {
                            index++;
                        }else {
                            check = true;
                            break;
                        }
                    }
                }
                if(check) {
                    check = false;
                    answer++;
                    break;
                }
            }
            index = 0;
        }

        return skill_trees.length - answer;
    }

    //skill 문자열을 제외한 나머지를 다 지우는 방식을 사용함.
    //그 후 indexOf로 비교하여 list에서 제거함.
    //이런 방식으로 풀고 싶었는데 정규표현식을 생각 못했다.
    public int anotherSolution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }
}
