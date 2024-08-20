
-- GROUP BY : 데이터를 특정 기준에 맞춰 그룹지은 결과를 도출할때 사용
-- 단일행 함수와 함께 사용하는 경우가 많음
--  단일행 함수 : SUM() , MAX(), MIN(), COUNT(), AVG()  (일반 함수는 여러데이터가 나옴, 단일함수는 하나만 나옴)

-- 사원 중에서 가장많은 급여를 조회
SELECT MAX(SAL) FROM emp;

-- 사원중에서 가장많은 급여와 사원명 조회
SELECT MAX(SAL), ENAME FROM emp;    -- ** 이건 잘못된 쿼리임 **

-- 각 부서별로 가장 많은 급여를 조회
-- 기본적으로 단일행 함수와 조회 결과, 행의 갯수가 다른 컬럼을 사용 못하지만
-- GROUP BY 절에서는 유일하게 그루핑한(GROUP BY) 컬럼은 조회가 가능함 
SELECT DEPTNO, MAX(SAL), SUM(SAL), COUNT(SAL)
FROM emp
GROUP BY DEPTNO;

-- 직급이 사원이 아닌  사원들 중 직급별 금여의 평균을 조회
-- 조회 결과를 직급기준 내림순차순으로 정렬
SELECT  JOB ,AVG(SAL) AS AVG_SAL
FROM emp
WHERE JOB !='사원'
GROUP BY JOB
ORDER BY AVG(SAL) DESC;

-- 조회 쿼리문의 해석 순서
-- FROM ->  JOIN -> WHERE -> GROUP BY -> SELECT -> ORDER BY
-- FROM emp -> JOIN -> WHERE EMPNO > 1003 ->  GROUP BY -> HAVING -> SELECT EMPNO AS 사번 -> ORDER BY EMPNO; 
SELECT EMPNO AS 사번
, ENAME
FROM emp
WHERE EMPNO > 1003
ORDER BY EMPNO;


-- 직급별로 그룹하여 직급, 각 직급별 평균 급여를 조회하되 
-- 평균급여가 300 이상인 직급에 대해서만 조회 , 정렬은 평균 급여 기준 내립차순 정렬
-- 그룹한 후 결정해야 하는 조건은 HAVING 절을 사용
SELECT JOB, AVG(SAL)
FROM emp
GROUP BY JOB
HAVING AVG(SAL) >=300;

-- 20번 부서를 제외한 정보중에서
-- 부서별로 그룹하여 부서번호, 부서별 급여의 합을 조회하되
-- 각 그룹별 급여의 합이 700이상인 데이터만 조회
-- 조회 결과 데이터는 부서별 급여의 합 기준 오름차순으로 정렬
SELECT DEPTNO,  SUM(SAL)
FROM emp
WHERE DEPTNO!=20
GROUP BY DEPTNO
HAVING SUM(SAL)>=700
ORDER BY SUM(SAL) ASC;


SELECT * FROM emp;
