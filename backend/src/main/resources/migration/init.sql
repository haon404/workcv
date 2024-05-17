CREATE TABLE category
(
    id   INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255)       NOT NULL,
    CONSTRAINT pk_category PRIMARY KEY (id)
);

CREATE TABLE company
(
    id            INT AUTO_INCREMENT NOT NULL,
    address       VARCHAR(255)       NOT NULL,
    `description` VARCHAR(255)       NOT NULL,
    email         VARCHAR(255)       NOT NULL,
    logo          VARCHAR(255)       NOT NULL,
    name          VARCHAR(255)       NOT NULL,
    phone_number  VARCHAR(255)       NOT NULL,
    CONSTRAINT pk_company PRIMARY KEY (id)
);

CREATE TABLE company_follow
(
    id         INT AUTO_INCREMENT NOT NULL,
    company_id INT                NOT NULL,
    user_id    INT                NOT NULL,
    CONSTRAINT pk_company_follow PRIMARY KEY (id)
);

CREATE TABLE cv
(
    id        INT AUTO_INCREMENT NOT NULL,
    file_name VARCHAR(255)       NOT NULL,
    CONSTRAINT pk_cv PRIMARY KEY (id)
);

CREATE TABLE image
(
    id        INT AUTO_INCREMENT NOT NULL,
    file_name VARCHAR(255)       NOT NULL,
    CONSTRAINT pk_image PRIMARY KEY (id)
);

CREATE TABLE recruitment
(
    id               INT AUTO_INCREMENT NOT NULL,
    address          VARCHAR(255)       NOT NULL,
    created_date     datetime           NULL,
    `description`    VARCHAR(255)       NOT NULL,
    experience       VARCHAR(255)       NOT NULL,
    recruit_quantity INT                NOT NULL,
    salary           VARCHAR(255)       NOT NULL,
    title            VARCHAR(255)       NOT NULL,
    due_date         VARCHAR(255)       NOT NULL,
    company_id       INT                NOT NULL,
    CONSTRAINT pk_recruitment PRIMARY KEY (id)
);

CREATE TABLE recruitment_apply
(
    id             INT AUTO_INCREMENT NOT NULL,
    created_date   datetime           NULL,
    recruitment_id INT                NOT NULL,
    user_id        INT                NOT NULL,
    cv_id          INT                NOT NULL,
    status         INT                NOT NULL,
    CONSTRAINT pk_recruitment_apply PRIMARY KEY (id)
);

CREATE TABLE recruitment_categories
(
    categories_id  INT NOT NULL,
    recruitment_id INT NOT NULL,
    CONSTRAINT pk_recruitment_categories PRIMARY KEY (categories_id, recruitment_id)
);

CREATE TABLE recruitment_save
(
    id             INT AUTO_INCREMENT NOT NULL,
    recruitment_id INT                NOT NULL,
    user_id        INT                NOT NULL,
    CONSTRAINT pk_recruitment_save PRIMARY KEY (id)
);

CREATE TABLE user
(
    id            INT AUTO_INCREMENT NOT NULL,
    `description` VARCHAR(255)       NULL,
    email         VARCHAR(255)       NOT NULL,
    password      VARCHAR(255)       NOT NULL,
    full_name     VARCHAR(255)       NOT NULL,
    address       VARCHAR(255)       NULL,
    phone_number  VARCHAR(255)       NULL,
    pfp           VARCHAR(255)       NULL,
    `role`        VARCHAR(255)       NOT NULL,
    cv_id         INT                NULL,
    status        INT                NULL,
    company_id    INT                NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

ALTER TABLE user
    ADD CONSTRAINT uc_user_cv UNIQUE (cv_id);

ALTER TABLE user
    ADD CONSTRAINT uc_user_email UNIQUE (email);

ALTER TABLE company_follow
    ADD CONSTRAINT FK_COMPANY_FOLLOW_ON_COMPANY FOREIGN KEY (company_id) REFERENCES company (id);

ALTER TABLE company_follow
    ADD CONSTRAINT FK_COMPANY_FOLLOW_ON_USER FOREIGN KEY (user_id) REFERENCES user (id);

ALTER TABLE recruitment_apply
    ADD CONSTRAINT FK_RECRUITMENT_APPLY_ON_CV FOREIGN KEY (cv_id) REFERENCES cv (id);

ALTER TABLE recruitment_apply
    ADD CONSTRAINT FK_RECRUITMENT_APPLY_ON_RECRUITMENT FOREIGN KEY (recruitment_id) REFERENCES recruitment (id);

ALTER TABLE recruitment_apply
    ADD CONSTRAINT FK_RECRUITMENT_APPLY_ON_USER FOREIGN KEY (user_id) REFERENCES user (id);

ALTER TABLE recruitment_categories
    ADD CONSTRAINT FK_RECRUITMENT_CATEGORIES_ON_CATEGORIES FOREIGN KEY (categories_id) REFERENCES category (id);

ALTER TABLE recruitment_categories
    ADD CONSTRAINT FK_RECRUITMENT_CATEGORIES_ON_RECRUITMENT FOREIGN KEY (recruitment_id) REFERENCES recruitment (id);

ALTER TABLE recruitment
    ADD CONSTRAINT FK_RECRUITMENT_ON_COMPANY FOREIGN KEY (company_id) REFERENCES company (id);

ALTER TABLE recruitment_save
    ADD CONSTRAINT FK_RECRUITMENT_SAVE_ON_RECRUITMENT FOREIGN KEY (recruitment_id) REFERENCES recruitment (id);

ALTER TABLE recruitment_save
    ADD CONSTRAINT FK_RECRUITMENT_SAVE_ON_USER FOREIGN KEY (user_id) REFERENCES user (id);

ALTER TABLE user
    ADD CONSTRAINT FK_USER_ON_COMPANY FOREIGN KEY (company_id) REFERENCES company (id);

ALTER TABLE user
    ADD CONSTRAINT FK_USER_ON_CV FOREIGN KEY (cv_id) REFERENCES cv (id);