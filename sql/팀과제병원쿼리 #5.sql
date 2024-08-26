CREATE TABLE HOS_MEMBER(
	MEM_NUM INT PRIMARY KEY AUTO_INCREMENT
	, MEM_NAME VARCHAR(10) NOT NULL
	, MEM_BIRTH VARCHAR(12) NOT NULL
	, MEM_TEL VARCHAR(20) NOT NULL
	, MEM_ADDR VARCHAR(50) NOT NULL
	, MEM_ID VARCHAR(10) UNIQUE
	, MEM_PW VARCHAR(10) 
	, MEM_GEN VARCHAR(10) NOT NULL
);

SELECT*FROM hos_member;

INSERT INTO hos_member
VALUES(1, "JAVA", "2003-06-5", "010-1111-1111", "ULSAN", "JAVA", "JAVA", "M");

CREATE TABLE HOS_STAFF(
	STAFF_NUM INT PRIMARY KEY AUTO_INCREMENT
	, STAFF_NAME VARCHAR(10) NOT NULL
	, STAFF_ROLE VARCHAR(10) DEFAULT 'STAFF'
	, STAFF_BIRTH VARCHAR(12) NOT NULL
	, STAFF_TEL VARCHAR(20) NOT NULL
	, STAFF_ADDR VARCHAR(50) NOT NULL
	, STAFF_ID VARCHAR(10) UNIQUE
	, STAFF_PW VARCHAR(10) 
	, STAFF_GEN VARCHAR(10) NOT NULL
	, PART_NUM INT NOT NULL REFERENCES HOS_PART(PART_NUM) ON DELETE CASCADE
);


INSERT INTO hos_staff
VALUES(1, "PYTHON", "ADMIN", "2003-06-05", "010-2222-2222", "ULSAN", "ADMIN", "ADMIN", "M", "1");

CREATE TABLE HOS_PART(
	PART_NUM INT PRIMARY KEY AUTO_INCREMENT
	, PART_NAME VARCHAR(10) NOT NULL
);
INSERT INTO hos_part
VALUES(1, "HEAD");

CREATE TABLE HOS_RES(
	RES_NUM INT PRIMARY KEY AUTO_INCREMENT
	, MEM_NUM INT NOT NULL REFERENCES hos_member(MEM_NUM) ON DELETE CASCADE
	, RES_TIME DATETIME DEFAULT CURRENT_TIMESTAMP
	, STAFF_NUM INT NOT NULL REFERENCES hos_staff(STAFF_NUM) ON DELETE CASCADE
	, PART_NUM INT NOT NULL REFERENCES hos_part(PART_NUM) ON DELETE CASCADE
);
INSERT INTO hos_res
VALUES(1, 1, "2024-08-23", 1, 1);

CREATE TABLE HOS_BOARD(
	BOARD_NUM INT PRIMARY KEY AUTO_INCREMENT
	, BOARD_TITLE VARCHAR(50) NOT NULL
	, BOARD_CONTENT VARCHAR(100) NOT NULL
	, STAFF_NUM INT NOT NULL REFERENCES hos_staff(STAFF_NUM) ON DELETE CASCADE
	, BOARD_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE HOS_Q(
	Q_NUM INT PRIMARY KEY AUTO_INCREMENT
	, MEM_NUM INT NOT NULL REFERENCES hos_member(MEM_NUM) ON DELETE CASCADE
	, Q_TITLE VARCHAR(50) NOT NULL
	, Q_CONTENT VARCHAR(100) NOT NULL
	, Q_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE HOS_A(
	A_NUM INT PRIMARY KEY AUTO_INCREMENT
	, STAFF_NUM INT NOT NULL REFERENCES hos_staff(STAFF_NUM) ON DELETE CASCADE
	, A_CONTENT VARCHAR(100) NOT NULL
	, A_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, Q_NUM INT NOT NULL REFERENCES HOS_Q(Q_NUM) ON DELETE CASCADE
);

CREATE TABLE hos_chart(
	CHART_NUM INT PRIMARY KEY AUTO_INCREMENT
	, MEM_NUM INT NOT NULL REFERENCES HOS_RES(MEM_NUM) ON DELETE CASCADE
	, IS_NOW VARCHAR(50) NOT NULL
);
INSERT INTO hos_chart
VALUES(1, 1, "N");

CREATE TABLE HOS_HISTORY(
	HIS_NUM INT PRIMARY KEY AUTO_INCREMENT
	, MEM_NUM INT NOT NULL REFERENCES hos_member(MEM_NUM) ON DELETE CASCADE
	, ILL_NAME VARCHAR(20) NOT NULL
	, ILL_DETAIL VARCHAR(100) NOT NULL
	, STAFF_NUM INT NOT NULL REFERENCES hos_staff(STAFF_NUM) ON DELETE CASCADE
);