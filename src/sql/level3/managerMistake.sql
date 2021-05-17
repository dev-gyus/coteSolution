/**
관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다.
  보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요.
  이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.
 */
SELECT distinct INS.ANIMAL_ID, INS.NAME
from ANIMAL_INS INS inner join ANIMAL_OUTS OUTS
where INS.DATETIME > OUTS.DATETIME and ins.animal_id = outs.animal_id
order by INS.DATETIME asc;