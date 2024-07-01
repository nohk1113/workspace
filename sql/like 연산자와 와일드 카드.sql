SELECT *FROM emp;
-- 사원에 '이' 라는 글자가 포함된 사원의 모든 정보 조회
-- 글자가 포함되는지 조회할대는 like 연산자와 와일드 카드를 사용한다
-- 와일드 카드 :  %,  _
--  '%' : 글자 수 제한이 없는 랜덤한 문자
-- '_' : 한 글자의 랜덤한 문자
SELECT *FROM emp
WHERE ENAME LIKE '%이%';


SELECT *FROM emp
WHERE ENAME LIKE '_이_';   -- 이름은 세글자이며 가운데 글자가 '이'인 사람을 조회

SELECT *FROM emp
WHERE ENAME LIKE '%이';  -- 마지막 글자가 이로 끝나는 모든 이름을 조회

SELECT *FROM emp
WHERE ENAME LIKE '_이%';   -- 두번째 글자가 '이'인 글자를 모두 조회 basic_boardbasic_board

-- 문자열 연결 함수
SELECT 'java', 1 + 1, CONCAT('집에', '가고', '싶다');