   CREATE TABLE SCORE_INFO(
   STU_NUM INT PRIMARY KEY
   , STU_NAME VARCHAR(50)
   , KOR_SCORE INT
   , ENG_SCORE INT
   , INTRO VARCHAR(100)
   );
   
   SELECT * FROM SCORE_INFO;
   
INSERT INTO SCORE_INFO
VALUES (1, '홍길동', 80,90,'반가워요');

    SELECT STU_NUM
    , STU_NAME
    , KOR_SCORE
    , ENG_SCORE
    , INTRO
    FROM SCORE_INFO;
        WHERE STU_NUM =1;
    