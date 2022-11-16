/*  
n개의 실수를 사용자 입력
    if (n > 0) -> 배열에 저장
        else -> 재입력
최대값 계산
최소값 계산
최대값, 최소값을 제외한 나머지 실수의 평균 계산
*/
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        float[] nums;   // 사용자 입력 실수를 저장하는 배열
        int size = 0;   // 배열의 크기
        float max;      // 최대값
        float min;      // 최소값
        int count = 0;  // 반복문 반복 횟수 지정
        int maxIdx = 0; // 최대값 인덱스
        int minIdx = 0; // 최소값 인덱스
        float avg = 0;  // 평균
        float sum = 0;  // 총합


        System.out.print("배열 크기 지정: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();         // 배열 크기 지정
        System.out.println("----------");

        nums = new float[size];         // 빈 배열 생성; 크기 = size

        while (nums.length > count) {
            System.out.print("값 입력: ");
            float num = input.nextFloat();  // 실수 사용자 입력
            
            if (num > 0) {  // 실수 > 0
                nums[count] = num;  // 배열에 입력 값 저장
                count++;
            }
        }   

        max = nums[0];  // 최대값 시작
        min = nums[0];  // 최소값 시작

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {    // 최대값 지정
                max = nums[i];
                maxIdx = i;         // 최대값 인덱스 저장
            }
            if (min > nums[i]) {    // 최소값 지정
                min = nums[i];
                minIdx = i;         // 최소값 인덱스 저장
            }
        }

        nums[maxIdx] = 0;
        nums[minIdx] = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        
        avg = sum / (nums.length - 2);
        System.out.println("----------");
        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}
