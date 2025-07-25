// 문제 해석
// 5개의 단어
// 세로로 읽기 - 어떤 단어는 3글자 어떤 단어는 4글자 등등 - 빈칸 발생 - 빈칸 무시 다음 글자 읽기 
// 세로로 읽은 숫자들을 순서대로 공백없이 출력하기.

// 풀이법
// 1.단어 입력 받기
// 2.입력받은 단어를 배열로 만들기(5개)
// 가장 긴 단어를 기준으로 삼기.
// 각 단어의 배열의 [0]부터 읽고 저장하기
// 그다음 배열의 [1]읽고 저장하기
// [4]까지 반복
// 만일  빈칸이 있으면 건너뛰기 continue

// 저장한 글자들을 출력하기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] inputArray = new String[]{sc.nextLine()};
        int longestWordNum = 0;

        for (inputArray[i] = 0; i < 5; i++) {
            longestWordNum = inputArray[i].length();
        }


    }
}
