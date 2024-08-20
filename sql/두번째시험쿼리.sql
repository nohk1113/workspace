
CREATE TABLE MY_MEMBER (
	MEM_NUM INT AUTO_INCREMENT PRIMARY KEY
	, MEM_ID VARCHAR(50) NOT NULL
	, MEM_PW VARCHAR(100) NOT NULL
	, MEM_NAME VARCHAR (50) NOT NULL
	, MEM_AGE INT
	, MEM_EMAIL VARCHAR (50)
);

-- 데이터를 삽입하는 쿼리문
INSERT INTO MY_MEMBER (MEM_NUM, MEM_ID, MEM_PW, MEM_NAME, MEM_AGE, MEM_EMAIL) 
VALUES (1, 'java', '1111', 'java', 20, 'java@naver.com'),
 (2, 'min', '1111', 'min', 23, 'min@naver.com');
 
 -- 조회
 SELECT * FROM MY_MEMBER;
 
 -- 모든 데이터를 삭제하는 쿼리문
 DROP TABLE MY_MEMBER;
 
-- 1번인 회원의 이름을 ‘김자바’로, ID는 ‘KIMJAVA’로 수정하는 쿼리문
UPDATE MY_MEMBER
SET
MEM_NAME = '김자바'
, MEM_ID = 'KIMJAVA'
WHERE MEM_NUM = 1;


-- 급여가 500에서 3000 사이이고 커미션이 NULL이 아닌 사원의 
-- 사원번호, 사원명, 급여, 커미션을 조회하는 쿼리문
SELECT * FROM emp;
SELECT * FROM dept;
 SELECT SAL