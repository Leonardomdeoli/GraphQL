CREATE TABLE author (
  id bigint NOT NULL,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE book (
  id bigint NOT NULL,
  title varchar(255) DEFAULT NULL,
  author_id bigint DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKklnrv3weler2ftkweewlky958 (author_id),
  CONSTRAINT FKklnrv3weler2ftkweewlky958 FOREIGN KEY (author_id) REFERENCES author (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;