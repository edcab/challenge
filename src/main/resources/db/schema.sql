CREATE TABLE "User"
(
    id   INTEGER          NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Item
(
    id          INT          NOT NULL AUTO_INCREMENT,
    title       VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL,
    PRIMARY KEY (id),
);

CREATE TABLE Review
(
    id      INT  NOT NULL AUTO_INCREMENT,
    rating  INT  NOT NULL,
    comment TEXT NOT NULL,
    item    INT  NOT NULL,
    "User"  INT  NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (item) REFERENCES Item (id),
    FOREIGN KEY ("User") REFERENCES "User" (ID)
);







