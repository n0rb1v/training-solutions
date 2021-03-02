CREATE TABLE citizens (
	id BIGINT NOT NULL AUTO_INCREMENT,
	c_name VARCHAR(200) NOT NULL,
	c_zip VARCHAR(4) NOT NULL,
	c_age INT NOT NULL,
	c_email VARCHAR(200),
	c_taj VARCHAR(10),
	num_of_vacc INT,
	last_vacc DATE,
	PRIMARY KEY (id) );

CREATE TABLE vaccinations (
	id BIGINT NOT NULL AUTO_INCREMENT,
	citizen_id BIGINT NOT NULL,
	vacc_date DATE NOT NULL,
	status VARCHAR(10),
	note VARCHAR(200),
	vacc_type VARCHAR(20),
	PRIMARY KEY (id) );


