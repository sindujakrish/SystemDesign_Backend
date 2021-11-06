DROP TABLE IF EXISTS userdetails;
DROP TABLE IF EXISTS membership;
DROP TABLE IF EXISTS membershipdetails;

create table membership (membership_id INT PRIMARY KEY, membership_name VARCHAR(25), membership_price INT);

CREATE TABLE userdetails (UID INT AUTO_INCREMENT PRIMARY KEY,Uname VARCHAR(25) NOT NULL, Uemail VARCHAR(25) NOT NULL, Uphone INT (10) NOT NULL,membership_id  INT NULL);

CREATE TABLE membershipdetails(membership_Details_Id INT PRIMARY KEY,membership_id INT NOT NULL, UID INT, membership_Start_Date VARCHAR(10) NOT NULL, membership_End_Date VARCHAR(10) NOT NULL);