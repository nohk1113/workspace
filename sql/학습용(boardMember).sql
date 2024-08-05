-- 회원정보
-- USER : 일반회원
-- ADMIN : 관리자
CREATE TABLE BOARD_MEMBER (
	MEM_ID VARCHAR(50) PRIMARY KEY
	, MEM_PW VARCHAR(50) NOT NULL
	, MEM_NAME VARCHAR(50) NOT NULL
	, GENDER VARCHAR(10) -- 'male', 'female'
	, MEM_ROLE VARCHAR(20) DEFAULT 'USER' 
);

-- 임시 회원 데이터
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('java', '1111', '김자바', 'male', 'USER');
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('admin', '1111', '관리자', 'female', 'ADMIN');

-- 게시판 (회원만 게시글 작성 가능)
CREATE TABLE BOARD (
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
	, TITLE VARCHAR(50) NOT NULL
	, CONTENT VARCHAR(100)
	, MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID) -- 외래키
	, CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- 게시글 임시데이터
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID) 
VALUES (1, '1번글', '1번 내용', 'java');
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID) 
VALUES (2, '2번글', '2번 내용', 'java');
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID) 
VALUES (3, '3번글', '3번 내용', 'admin');

SELECT * FROM board;


-- 댓글 (회원만 가능)
CREATE TABLE BOARD_REPLY (
	REPLY_NUM INT AUTO_INCREMENT PRIMARY KEY
	, REPLY_CONTENT VARCHAR(50) NOT NULL
	, REPLY_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID)
	, BOARD_NUM INT REFERENCES BOARD (BOARD_NUM)
);

-- 댓글 임시데이터
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (1, '댓글1', 'java', 1);
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (2, '댓글2', 'java', 2);
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (3, '댓글3', 'java', 1);
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (4, '댓글4', 'admin', 1);
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (5, '댓글5', 'admin', 2);

-- 아이디 중복 여부를 확인 하는 쿼리
SELECT MEM_ID
FROM board_member
	WHERE MEM_ID = 'java';
	
	SELECT MEM_ID
	FROM board_member
	WHERE MEM_ID = 'JAVA'
	AND MEM_PW= '1111';
	
	
	SELECT BOARD_NUM
	, TITLE
	, CONTENT
	, MEM_ID
	, CREATE_DATE
	FROM board
	WHERE BOARD_NUM=1;
	
	SELECT * FROM board_reply;
	
	SELECT REPLY_NUM
	, REPLY_CONTENT
	, MEM_ID
	, REPLY_DATE
	FROM board_reply
	WHERE BOARD_NUM=1;
	
	SELECT * FROM board_member;
	SELECT * FROM board;
	SELECT * FROM board_reply;
	
	SELECT TITLE, CONTENT, B.MEM_ID
	, M.MEM_ID, MEM_NAME, MEM_ROLE
	FROM board B, board_member M;
	WHERE B.MEM_ID=M.MEM_ID
	AND B.MEM_ID='java';
	
	-- 글 번호가 5번 이하인 게시글의 
	-- 글번호, 제목, 글작성자를 조회 하되
	-- 글번호 기분 오름차순으로 정렬
	SELECT BOARD_NUM, TITLE, M.MEM_NAME
	FROM board B, board_member M
	WHERE B.MEM_ID=M.MEM_ID
	AND BOARD_NUM<5;
	ORDER BY BOARD_NUM ASC;
	
	
	-- 1번 게시글의 게시글 제목 , 작성자 ID 및
	-- 1번 게시글에 작성된 댓글 내용, 댓글 작성자 ID를 조회
	SELECT TITLE, B.MEM_ID, REPLY_CONTENT, B.BOARD_NUM
	FROM board B , board_reply R
	WHERE  B.BOARD_NUM=R.BOARD_NUM
	AND B.BOARD_NUM=1;
	
	
	-- 1번 게시글의 게시글 제목 , 작성자 ID 및
	-- 1번 게시글에 작성된 댓글 내용, 댓글 작성자 ID를 조회
	-- 댓글 작성자 이름 조회
	SELECT TITLE, B.MEM_ID, REPLY_CONTENT, R.MEM_ID, M.MEM_NAME
	FROM board B , board_reply R, board_member M
	WHERE  B.BOARD_NUM=R.BOARD_NUM
	AND R.MEM_ID=M.MEM_ID
	AND B.BOARD_NUM=1;
	
	
	 SELECT TITLE, B.MEM_ID, REPLY_CONTENT, B.BOARD_NUM
        FROM board B , board_reply R
        WHERE  B.BOARD_NUM=R.BOARD_NUM
        AND B.BOARD_NUM=1;
        
-- 게시글 번호 , 게시글 제목, 작성자, 작성일, 게시글내용
--  댓글 날짜, 댓글 작성자ID, 댓글 내용
SELECT B.BOARD_NUM, TITLE, B.MEM_ID
, CREATE_DATE, CONTENT
, REPLY_DATE, R.MEM_ID, REPLY_CONTENT
FROM board B, board_reply R;
WHERE B.BOARD_NUM=R.BOARD_NUM
AND B.BOARD_NUM=1;

SELECT * FROM board;


CREATE TABLE TEST_ITEM (
ITEM_CODE INT AUTO_INCREMENT PRIMARY KEY
, ITEM_NAME VARCHAR (30) NOT NULL
);

INSERT INTO TEST_ITEM VALUES (1, '상품1');
INSERT INTO TEST_ITEM VALUES (2, '상품2');
INSERT INTO TEST_ITEM VALUES (3, '상품3');
SELECT * FROM TEST_ITEM;

CREATE TABLE TEST_ORDER (
ODER_NUM INT AUTO_INCREMENT PRIMARY KEY
, BUYER VARCHAR (50) NOT NULL
, ITEM_CODE INT NOT NULL REFERENCES TEST_ITEM (ITEM_CODE) ON DELETE CASCADE
);

INSERT INTO TEST_ODER VALUES (1, '김자바', 1);
INSERT INTO TEST_ODER VALUES (2, '이자바', 1);
INSERT INTO TEST_ODER VALUES (3, '박자바', 2);

INSERT INTO TEST_ODER VALUES (4, '김자바', NULL);

SELECT * FROM TEST_ITEM;
SELECT * FROM TEST_ODER;

-- DELETE FROM TEST_ODER WHERE ITEM_CODE=1;
DELETE FROM TEST_ITEM WHERE ITEM_CODE=1;

DROP TABLE TEST_ODER;
DROP TABLE test_item;


-- 검색창 
SELECT BOARD_NUM
, TITLE
, MEM_ID
, CREATE_DATE
FROM board
WHERE ${searchType} LIKE CONCAT('%', #{serchValue}, '%');

SELECT CONCAT('A', 'B', 'C', 'D');

INSERT INTO BOARD (
        TITLE
        , CONTENT
        , MEM_ID
        )VALUES (
        '테스트'
        , '123123'
        , 'java'
        );
        
SELECT * FROM board;



SELECT BOARD_NUM
   , TITLE
   , MEM_ID
   , CREATE_DATE
   FROM board 
   ORDER BY BOARD_NUM DESC;
   LIMIT 5 OFFSET 5;


SELECT COUNT(BOARD_NUM)
FROM board;

