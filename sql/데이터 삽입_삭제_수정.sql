-- DB 연결 연습용 테이블
CREATE TABLE TEST_MEMBER(
MEM_NUM INT PRIMARY KEY    -- 중복 불가, NULL 불가
  , MEM_NAME VARCHAR(50) 
  , MEM_AGE INT
  , MEM_ADDR VARCHAR(50)
  );
  
  SELECT * FROM test_member;
  -- 변화된 데이터가 잘못 되지 않았으면 COMMIT; 명령어로 데이터
  -- 변화를 확정지음,  잘못된 변화가 있을때 변화를 취소 시키고 싶다면
  -- 뭐
  
  -- 데이터베이스는 데이터가 잘못되는 것을 엄격히 금지하기 때문에
  -- 데이터의 변화가 생기는 경우 해당 변화가 잘못이 없는지 한번
  -- 기회를 준다.
  -- 데이터 삽입  INSERT
  -- INSERT INTO 테이블명(컬럼들) VALUES(값들);
  -- 입력한 컬럼 순서대로 값을 저장 시켜야함
  INSERT INTO test_member (MEM_NUM, MEM_NAME, MEM_AGE, MEM_ADDR)
   VALUES(10, 'KIM', 26, '울산');
   
   ROLLBACK;
   COMMIT;
   
	INSERT INTO test_member (MEM_NUM, MEM_NAME, MEM_ADDR, MEM_AGE)
   VALUES(11, 'KIM', '원주시', 22);
   
   -- 칼럼명은 반드시 모든 칼럼이 작성될 필요가 없다
   -- 작성되지 않은 컬럼에는 NULL 이 들어간다
   INSERT INTO test_member (MEM_NUM, MEM_NAME)
	 VALUES(12, '홯');
	 
	 -- 아래 쿼리는 MEM_NUM에 NULL이 들어가는데 MEM_NUM은 기본키
	 -- (PRIMARY KEY) 라 NULL 값이 들어갈수 없어서 오류가 난다
	 INSERT INTO test_member (MEM_NAME, MEM_AGE)
	 VALUES('이', 30);
	 
	 -- 테이블 생성시 작성한 컬럼명 순서대로 데이터를 넣는다면
	 -- 컬럼명 작성을 생략할 수 있다.
	 
	 -- 모든 컴럼의 값이 들어가야함!
	 INSERT INTO test_member () VALUES (13, '이름', 50, '부산시');
   
   -- 데이터수정 UPDATE
   -- UPDATE 테이블 명 SET 컬럼명= 값 WHERE 조건;
   
   -- WHERE 조건절을 작성하지 않으면 모든 데이터가 변경됨
   UPDATE test_member
   SET
   MEM_NAME='이순신';
   
   -- 회원 번호가 10번인 회원의 이름을 '김회원', 나이는 32살로 변경하는 쿼리
   UPDATE test_member
   SET
   MEM_NAME='김회원'
   , MEM_AGE=32;
   WHERE MEM_NUM=10;
   
   -- 데이터 삭제 DELETE
   -- DELETE 테이블 명 [WHERE 조건];
   DELETE FROM test_member;
   
   ROLLBACK;
   
   -- 40살 이하인 회원을 모두 삭제
   DELETE FROM test_member
   WHERE MEM_AGE<=40;
   
   COMMIT;
   
   SELECT * FROM test_member;
   
   