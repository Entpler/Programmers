--프로그래머스 1. 없어진 기록 찾기
--입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순으로 조회하는 SQL문
--ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블
--ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블


SELECT O.ANIMAL_ID,O.NAME 
FROM ANIMAL_INS I, ANIMAL_OUTS O
WHERE I.ANIMAL_ID(+)=O.ANIMAL_ID--LEFT OUT JOIN 사용
AND (O.ANIMAL_ID IS NOT NULL AND I.ANIMAL_ID IS NULL)
ORDER BY O.ANIMAL_ID;


--2. 있었는데요 없었습니다

--관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다.
--보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 
--이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.
SELECT O.ANIMAL_ID,O.NAME
FROM ANIMAL_INS I, ANIMAL_OUTS O
WHERE I.ANIMAL_INS=A.ANIMAL_OUTS
AND O.DATETIME<I.DATETIME
ORDER BY O.DATETIME ASC;


--3.이름에 el이 들어가는 동물 찾기
--동물 보호소에 들어온 동물 이름 중, 이름에 "EL"이 들어가는 개의 아이디와 이름을 조회하는 SQL문을 작성
SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS
WHERE ANIMAL_TYPE='Dog'
AND Upper(NAME) LIKE '%EL%' --el은 대 소문자를 구분하지 않음.
ORDER BY NAME;


--4.동명 동물 수 찾기
--동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문
SELECT NAME,COUNT(NAME)
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME --GROUP 함수는 GROUP BY절과 쓰여야 하고 안쓰면 not a single-group group function 에러가 발생한다.
HAVING COUNT(NAME)>=2 --이름이 두번이상 쓰임
ORDER BY NAME;


--5. 고양이와 개는 몇마리 있을까
--동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회하는 SQL문
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE)
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE ASC;--고양이를 개보다 먼저 조회



