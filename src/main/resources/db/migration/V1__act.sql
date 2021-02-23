CREATE TABLE `activitytracker` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`start_time` TIMESTAMP ,
	`activity_desc` VARCHAR(200) ,
	`activity_type` VARCHAR(20) ,
	PRIMARY KEY (`id`) );

insert into activitytracker(start_time,activity_desc,activity_type) values ('2021-07-11 12:30:00','bgadttyuif','BIKING');
insert into activitytracker(start_time,activity_desc,activity_type) values ('2020-08-13 11:37:00','bghjghggyuif','HIKING');
insert into activitytracker(start_time,activity_desc,activity_type) values ('2020-11-11 08:39:00','bgffgiiuuuuif','RUNNING');

