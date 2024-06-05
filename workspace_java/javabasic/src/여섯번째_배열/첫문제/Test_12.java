package 여섯번째_배열.첫문제;

import java.util.Scanner;

public class Test_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 국어, 영어, 수학, 총점
        int[] scores=new int[4];
        // 과목명
        String[] subjects={"국어", "영어",  "수학"};

        // 평균
        double avg;
        // 점수== 0~100점 입력까지 무한 입력
        for (int i=0;i<3;i++){
            while (true){
                // 서브젝트를 넣어주면 순서대로 국어, 영어, 수학 단어가 도출
                System.out.print(subjects[i]+"점수: ");
                scores[i]=sc.nextInt();
                if (scores[i]>0 && scores[i] <=100){
                    break;
                }
            }

        }
// 총점 밑 평균 계산
        for(int i=0; i<scores.length-1;i++){
            scores[scores.length-1]=scores[scores.length-1]+scores[i];
        }
        // 총점 /  총과목수
        avg=scores[scores.length-1]/(double)(scores.length-1);
        // 점수 및 총점 평균 출력

        System.out.println();

        for (int i=0; i<subjects.length;i++){
            System.out.println(subjects[i]+ " 점수 - "+scores[i]);
        }
        System.out.println("총점- "+scores[scores.length-1]);
        System.out.println("평균 - "+ avg);
    }
    
}
