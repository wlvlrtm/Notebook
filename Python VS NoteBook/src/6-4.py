from typing import MutableSequence

def bubble_sort(a: MutableSequence) -> None :
  ccnt = 0      ## 비교 횟수;
  scnt = 0      ## 교환 횟수;
  n = len(a)    ## 배열 길이;
  k = 0         ## 패스 종료/재시작 시점;
  ps = 1        ## 패스 넘버

  while (k < n-1) :      ## 0 ~ n-2;
    print(f"패스 {ps}")
    exchng = 0    ## 교환 발생 여부 채크
    last = n-1    ## 정렬 시작 지점;

    for j in range(n-1, k, -1) :   ## n-1 ~ k, -1;
      for m in range(0, n-1) :   ## 0 ~ n-2; 패스 반복 과정 출력
        print(f"{a[m]:2}" + ("  " if (m != j-1) else (" +" if (a[j-1] > a[j]) else " -")), end="")
      print(f"{a[n-1]:2}")

      ccnt += 1                 ## 비교 횟수 += 1

      if (a[j-1] > a[j]) :   ## (앞 수 > 주목한 수); 대소 관계 비교
        scnt += 1                           ## 교환 횟수 += 1
        a[j - 1], a[j] = a[j], a[j - 1]     ## 교환 발생
        exchng += 1                         ## 교환 있음 채크
        last = j                            ## 다음 패스 시작 채크 포인트 값 지정; 교환이 발생한 지점

    k = last                ## 패스 시작 채크 포인트 설정; 4

    for m in range(0, n-1) :   ## 0 ~ n-2; 패스 반복 과정 출력 (마지막 1줄)
      print(f"{a[m]:2}", end="  ")
    print(f"{a[n-1]:2}")

    ps += 1     ## 패스 넘버 += 1

    if (exchng == 0): ## 교환이 1번도 발생하지 않았다면,
      break         ## 정렬 작업 바로 종료

  ## Result
  print(f"비교를 {ccnt}번 했습니다.")
  print(f"교환을 {scnt}번 했습니다.")



if (__name__ == "__main__") :
  print("버블 정렬을 수행합니다.")

  num = int(input("원소 수를 입력하세요.: "))
  x = [None] * num

  for k in range(num) :
    x[k] = int(input(f"x[{k}]: "))

  bubble_sort(x)

  print("오름차순으로 정렬했습니다.")

  for k in range(num) :
    print(f"x[{k}] = {x[k]}")