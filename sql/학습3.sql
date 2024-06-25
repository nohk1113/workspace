-- DB 연결 연습용 테이블
CREATE TABLE TEST_MEMBER(
MEM_NUM INT PRIMARY KEY
  , MEM_NAME VARCHAR(50) 
  , MEM_AGE INT
  , MEM_ADDR VARCHAR(50)
  );
  
  SELECT * FROM test_member;
  
  --데이터 삽입
INSERT INTO test_member VALUES(1, '홍길동', 20, '서울 시');
INSERT INTO test_member VALUES(2, '홍미리', 30, '울산 시');
INSERT INTO test_member VALUES(3, '김마동', 40, '부산 시');
INSERT INTO test_member VALUES(4, '고길동', 40, '밀양 시');
INSERT INTO test_member VALUES(5, '해마동', 50, '평택 시');
COMMIT;