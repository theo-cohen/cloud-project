DROP TABLE IF EXISTS todo;

CREATE TABLE todo (
  todoid SERIAL PRIMARY KEY,
  userid VARCHAR(25),
  title VARCHAR(25),
  description VARCHAR(100),
  isdone BOOLEAN NOT NULL DEFAULT false
);

INSERT INTO todo (todoid, userid, title, description, isdone) VALUES
  (1,'User 1','Todo 1', 'Need to do something', false),
  (2,'User 2','Todo 2', 'Need to do something else', false),
  (3,'User 1','Todo 3', 'Need to do something else else', true);