
-- 날짜 관련 함수 및 기능

-- 현재 날짜 및 시간 조회
SELECT NOW();
--현재 날짜만 조회
SELECT CURRENT_DATE();
-- 현재 시간만 조회
SELECT CURRENT_TIME();

--날짜 조회시 포맷(형태) 지정하기
-- Y:년도를 4자리로 표현  /y:년도를 2자리로 표현
-- M:월을 문자로 표현 (영어로) / m: 월을 두자리 숫자로 표현
-- D:날짜를 서수식으로 표현  / d: 날짜를 두자리 숫자로 표현
-- H: 시간을 24시간 기준으로 표현 / h : 시간을 12시간 형식으로 표현
-- i: 분을 두자리 숫자로 표현 / s:초를 두자리 숫자로 표현
SELECT NOW(),
	DATE_FORMAT(NOW(),'%Y-%m-%d'),
	DATE_FORMAT(NOW(),'%y-%M-%D' ),
	DATE_FORMAT(NOW(),'%Y%m%d' ),
	DATE_FORMAT(NOW(),'%Y-%m-%d %H:%i:s');
	
	-- 날짜및 시간에서 특정 정보만 추출하기
	SELECT NOW()
	, MONTH(NOW())
	, DAY(NOW())
	, HOUR(NOW)
	, MINUTE(NOW())
	, YEAR(NOW())
	, SECOND(NOW());
	
	SELECT *FROM emp;
	-- 2월에 입사한 사원의 사번, 이름, 입사일을 조회
	-- 입사일은 '2024-10-10' 현태로 조회
	SELECT EMPNO, ENAME, DATE_FORMAT(HIREDATE, '%Y-%m-%d') AS HITEDATE
	, SUBSTRING(HITEDATE, 6, 2)
	FROM emp
	WHERE MONTH(HITEDATE)=2
	WHERE SUBSTRING(HITEDATE,6,2)='02';
	
	-- 날짜 연산
	SELECT NOW()
	, ADDDATE(NOW(), INTERVAL 10 DAY)
	, ADDDATE(NOW(), INTERVAL -10 DAY)
	, ADDDATE(NOW(), INTERVAL 1 YEAR)
	, ADDDATE(NOW(), INTERVAL 3 MONTH);
	
	-- 월 차이, 매개변수의 향태는 반드시 YYYYMM
	--날짜 및 시간 차이
	SELECT PERIOD_DIFF(202407, 202401);
	-- 일 차이
	SELECT DATEDIFF(CURRENT(), '2020-05-05');
	