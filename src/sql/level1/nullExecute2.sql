/**
  이름이 있는 상태로 보호소에 들어온 동물 ID 조회, 오름차순 정렬
 */
 select ANIMAL_ID from ANIMAL_INS where NAME is not null
order by NAME asc;