create table contact (
    id INT AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    creationtime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(10) NOT NULL,
    description TEXT,
    PRIMARY KEY (id)
);

CREATE INDEX contact_idx ON contact(`name`,`lastName`, `status`, `creationTime`);


