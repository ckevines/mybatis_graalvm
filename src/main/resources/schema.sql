--CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(255));
--INSERT INTO users (id, name) VALUES (1, 'John Doe'), (2, 'Jane Smith');
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);
INSERT INTO users (name) VALUES ('John Doe');
INSERT INTO users (name) VALUES ('Jane Smith');