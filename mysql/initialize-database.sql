
create database microservices;

GRANT ALL PRIVILEGES ON microservices.* TO 'root'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

create table events (
  event_id varchar(200) PRIMARY KEY,
  event_type varchar(200),
  event_data varchar(200) NOT NULL,
  entity_type VARCHAR(200) NOT NULL,
  entity_id VARCHAR(200) NOT NULL,
  triggering_event VARCHAR(200),
  metadata VARCHAR(200)
);

CREATE INDEX events_idx ON events(entity_type, entity_id, event_id);

create table entities (
  entity_type VARCHAR(200),
  entity_id VARCHAR(200),
  entity_version VARCHAR(200) NOT NULL,
  PRIMARY KEY(entity_type, entity_id)
);

CREATE INDEX entities_idx ON events(entity_type, entity_id);

CREATE TABLE `accounts` (
  `id` int(11) NOT NULL,
  `user_name` varchar(15) DEFAULT NULL,
  `user_password` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
