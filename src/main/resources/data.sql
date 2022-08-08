DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE(
    id INTEGER PRIMARY KEY, 
    ename VARCHAR(20),
    department VARCHAR(20),
    salary FLOAT(8));
insert into EMPLOYEE(id,ename,department,salary) VALUES(101, 'Manish','Developer',40000);
insert into EMPLOYEE(id,ename,department,salary) VALUES(102,'Manikanta','Developer',50000);
insert into EMPLOYEE(id,ename,department,salary) VALUES(103,'Sinchana','Developer',50000);

insert into EMPLOYEE(id,ename,department,salary) VALUES(104,'Soumya','Developer',50000);
