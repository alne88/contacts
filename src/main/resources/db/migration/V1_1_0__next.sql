create table address (
    id INT AUTO_INCREMENT,
    contactId INT NOT NULL,
    street VARCHAR(255) NOT NULL,
    city VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    type VARCHAR(10),
    description TEXT,
    PRIMARY KEY (id)
);

CREATE INDEX address_contact_idx ON address(`contactId`);

create table phone (
  id INT AUTO_INCREMENT,
  contactId INT NOT NULL,
  countrycode int NOT NULL,
  phonenumber INT NOT NULL,
  description TEXT,
  type VARCHAR(10),
  PRIMARY KEY (id)
);

CREATE INDEX phone_contact_idx ON phone(`contactId`);



