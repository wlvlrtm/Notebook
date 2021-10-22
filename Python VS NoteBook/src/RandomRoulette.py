import random
import os


## 데이터 입력
all_S = int(input("전체 학생 수: ")) ## 20

all_T = int(input("전체 선생 수: ")) ## 9

##team_S = int(input("팀 당 학생 수 입력: ")) ## 6

team_T = int(input("팀 당 선생 수: ")) ## 3

list_T = list() ## 선생 리스트
list_S = list() ## 학생 리스트



## 선생, 학생 인원 리스트화
for i in range(1, all_T+1) :
    list_T.append(i)

for j in range(1, all_S+1) :
    list_S.append(j)



## 팀 수
count_T = (all_T // team_T)
result = arr2 = [ [0] * 2 for i in range(count_T) ]



## 리스트 랜덤 추출
for i in range(0, count_T) :
    random_T = random.sample(list_T, team_T)
    random_S = random.sample(list_S, count_T)
    
    for j in random_T :
        list_T.remove(j)

    for k in random_S :
        list_S.remove(k)

    result[i][0] = random_T
    result[i][1] = random_S

    

## 나머지 처리
k = 0
while(len(list_T) > 0 or len(list_S) > 0) :
    if (len(list_T) > 0) :
        temp = random.choice(list_T)
        result[k][0].append(temp)
        list_T.remove(temp)
    elif (len(list_S) > 0) :
        temp = random.choice(list_S)
        result[k][1].append(temp)
        list_S.remove(temp)
    

    if (k < count_T-1) :
        k += 1
    else :
        k = 0

       

## 결과 출력
print()
for i in range(0, count_T) :
    print(i+1, "팀 || 선생: ", result[i][0], "        학생: ", result[i][1])
    





os.system('pause')

