/**
보호소에서 중성화 수술을 거친 동물 정보를 알아보려 합니다. 보호소에 들어올 당시에는 중성화1되지 않았지만,
  보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종, 이름을 조회하는 아이디 순으로 조회하는 SQL 문을 작성해주세요.
 */
SELECT distinct i.animal_id, i.animal_type, i.name from animal_ins i join animal_outs o
where i.animal_id = o.animal_id
  and (i.sex_upon_intake = 'Intact Female' or i.sex_upon_intake = 'Intact Male')
  and (o.sex_upon_outcome = 'Neutered Male' or o.sex_upon_outcome = 'Spayed Female'
    or o.sex_upon_outcome = 'Neutered Female' or o.sex_upon_outcome = 'Neutered Female')
order by i.animal_id asc;