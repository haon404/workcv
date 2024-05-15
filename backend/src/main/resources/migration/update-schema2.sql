CREATE TABLE category
(
    id   INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT pk_category PRIMARY KEY (id)
);

CREATE TABLE recruitment_categories
(
    categories_id  INT NOT NULL,
    recruitment_id INT NOT NULL,
    CONSTRAINT pk_recruitment_categories PRIMARY KEY (categories_id, recruitment_id)
);

ALTER TABLE recruitment_categories
    ADD CONSTRAINT fk_reccat_on_category FOREIGN KEY (categories_id) REFERENCES category (id);

ALTER TABLE recruitment_categories
    ADD CONSTRAINT fk_reccat_on_recruitment FOREIGN KEY (recruitment_id) REFERENCES recruitment (id);