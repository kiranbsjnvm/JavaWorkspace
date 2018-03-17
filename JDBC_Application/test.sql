DELIMITER //
create procedure InsertData(IN id int, IN name VARCHAR(45), IN city VARCHAR(45), IN salary int)
begin
Insert into employees values (id,name,city,salary);
end //
DELIMITER ;


DELIMITER //
 CREATE PROCEDURE GetAllEmployees()
   BEGIN
   SELECT *  FROM employees;
   END //
DELIMITER ;