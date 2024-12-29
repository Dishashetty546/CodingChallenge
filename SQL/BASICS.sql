CREATE TRIGGER before_customer_insert BEFORE
INSERT ON CUSTOMERSss FOR EACH ROW BEGIN
INSERT INTO CUSTOMER_LOGs (
        operation_type,
        old_salary,
        new_salary,
        salary_difference
    )
VALUES ('INSERT', NULL, NEW.salary, NULL);
END;