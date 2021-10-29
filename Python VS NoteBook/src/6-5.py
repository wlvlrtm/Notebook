from typing import MutableSequence

def shaker_sort(a: MutableSequence) -> None :
  ccnt = 0          ## 비교 횟수;
  scnt = 0          ## 교환 횟수;
  n = len(a)        ## 배열 길이;
  left = 0          ## 스캔 범위 첫 원소 인덱스;
  right = len(a)-1  ## 스캔 범위 마지막 원소 인덱스;
  last = right      ## 패스 종료/재시작 지점;
  ps = 1            ## 패스 넘버

  while left < right:
    exchng = 0  ## 교환 발생 여부 채크

    ## right to left ##
    print(f"패스 {ps}")

    for j in range(right, left, -1) :
      for m in range(0, n-1) :
        print(f"{a[m]:2}" + ("  " if (m != j-1) else " +" if (a[j-1] > a[j]) else " -"), end="")
      print(f"{a[n-1]:2}")

      ccnt += 1 ## 비교 횟수 += 1
      
      ## Swap ##
      if (a[j-1] > a[j]) :
        scnt += 1                   ## 교환 횟수 += 1
        a[j-1], a[j] = a[j], a[j-1] ## SWAP
        exchng += 1                 ## 교환 있음 채크
        last = j                    ## 다음 패스 시작 채크 포인트 값 지정; 교환이 발생한 마지막 지점
      ## END Swap END ##
      
      left = last   ## Checkpoint Set

    for m in range(0, n-1) :
      print(f"{a[m]:2}", end="  ")
    print(f"{a[n-1]:2}")

    ps += 1

    if (exchng == 0) : ## 교환이 1번도 발생하지 않았다면,
      break         ## 정렬 작업 바로 종료
    ## END right to left END ##

    ## ---===--- ##

    ## left to right ##
    print(f"패스 {ps}")

    for j in range(left, right, 1) :
      for m in range(0, n-1) :
        print(f"{a[m]:2}" + ("  " if (m != j) else (" +" if (a[j] > a[j+1]) else " -")), end="") 
      print(f"{a[n-1]:2}")

      ccnt += 1 ## 비교 횟수 += 1

      ## SWAP ##
      if (a[j] > a[j+1]) :
        scnt += 1                   ## 교환 횟수 += 1
        a[j], a[j+1] = a[j+1], a[j] ## SWAP
        exchng += 1                 ## 교환 있음 채크
        last = j                    ## 다음 패스 시작 채크 포인트 값 지정; 교환이 발생한 마지막 지점
      ## END SWAP END ##

      right = last  ## Checkpoint Set

    for m in range(0, n-1) :
      print(f"{a[m]:2}", end="  ")
    print(f"{a[n-1]:2}")

    ps += 1

    if (exchng == 0) : ## 교환이 1번도 발생하지 않았다면,
      break         ## 정렬 작업 바로 종료
    ## END left to right END ##



  print(f"비교를 {ccnt}번 했습니다.")
  print(f"교환을 {scnt}번 했습니다.")



if (__name__ == "__main__") :
  print("셰이커 정렬을 수행합니다.")

  num = int(input("원소 수를 입력하세요.: "))
  x = [None] * num

  for left in range(num) :
    x[left] = int(input(f"x[{left}]: "))

  shaker_sort(x)

  print("오름차순으로 정렬했습니다.")

  for left in range(num) :
    print(f"x[{left}] = {x[left]}")