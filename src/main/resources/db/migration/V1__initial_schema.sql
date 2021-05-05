DROP TABLE IF EXISTS TOPIC;

CREATE TABLE TOPIC (
    id BIGINT NOT NULL,
    name VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);


DROP TABLE IF EXISTS AUTHOR;

CREATE TABLE AUTHOR (
    id  BIGINT NOT NULL,
    name VARCHAR(100) NOT NULL,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (username)
);


DROP TABLE IF EXISTS BLOG;

CREATE TABLE BLOG (
    id BIGINT NOT NULL,
    id_topic BIGINT NOT NULL,
    id_author BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    body text NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_topic_blog FOREIGN KEY(id_topic) REFERENCES TOPIC (id),
    CONSTRAINT fk_author_blog FOREIGN KEY(id_author) REFERENCES AUTHOR (id)

);

DROP TABLE IF EXISTS COMMENTS;

CREATE TABLE COMMENTS (
    id BIGINT NOT NULL,
    id_blog BIGINT NOT NULL,
    is_approved BIT,
    comment TEXT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_blog_comment FOREIGN KEY (id_blog) REFERENCES BLOG (id)
);

DROP TABLE IF EXISTS BLOG_IMAGES;

CREATE TABLE BLOG_IMAGE (
    id BIGINT NOT NULL,
    id_blog BIGINT NOT NULL,
    image_url VARCHAR(255),
    PRIMARY KEY (id),
    CONSTRAINT fk_blog_image FOREIGN KEY (id_blog) REFERENCES BLOG (id)
);
