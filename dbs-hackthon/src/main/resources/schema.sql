DROP TABLE IF EXISTS QUEUE;


 
CREATE TABLE QUEUE(
	
	Qid INT  AUTO_INCREMENT  PRIMARY KEY,
	name varchar(250) NOT NULL
);

CREATE TABLE MESSAGE(

	Qid INT
	message varchar(1000)  NOT NULL
);



