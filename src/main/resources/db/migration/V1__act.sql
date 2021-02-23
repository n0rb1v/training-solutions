CREATE TABLE `activitytracker` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`start_time` TIMESTAMP NULL DEFAULT NULL,
	`activity_desc` VARCHAR(200) NULL DEFAULT NULL COLLATE 'utf8_hungarian_ci',
	`activity_type` VARCHAR(20) NULL DEFAULT NULL COLLATE 'utf8_hungarian_ci',
	PRIMARY KEY (`id`) )

insert into activitytracker(start_time,activity_desc,activity_type) values ('2021-07-11 12:30:00','bgadttyuif','BIKING');
insert into activitytracker(start_time,activity_desc,activity_type) values ('2021-07-11 12:30:00','bgadttyuif','BIKING');

