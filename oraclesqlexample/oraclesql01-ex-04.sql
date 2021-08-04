CREATE TABLE HR.EMP AS(SELECT * FROM HR.employees)

INSERT INTO HR.EMP(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID)
VALUES(250,'Erman','?brisim','erman@ibrisim','556783245',TO_DATE('3/10/2013','DD/MM/YYYY'),'IT_PROG',15000,0.4,102,60)

UPDATE HR.EMP
SET PHONE_NUMBER = '5328976541',SALARY=16000 WHERE EMPLOYEE_ID=250;

SELECT * FROM HR.EMP;

DELETE FROM HR.EMP WHERE  EMPLOYEE_ID=250;

DROP TABLE HR.EMP

