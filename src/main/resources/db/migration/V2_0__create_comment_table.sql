--CREATE TABLE comment (
--  id BIGINT AUTO_INCREMENT NOT NULL,
--   name VARCHAR(255),
--   contents VARCHAR(255),
--   blog_post_id BIGINT,
--   CONSTRAINT pk_comment PRIMARY KEY (id)
--);
--
--ALTER TABLE comment ADD CONSTRAINT FK_COMMENT_ON_BLOG_POST FOREIGN KEY (blog_post_id) REFERENCES blog_post (id);