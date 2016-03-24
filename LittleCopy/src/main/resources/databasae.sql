DROP TABLE IF EXISTS `user`;

CREATE TABLE IF NOT EXISTS `user` (
`user_id` int(11) NOT NULL auto_increment,
`use_name` varchar(20) NOT NULL,
`password` varchar(50) NOT NULL,
PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE IF NOT EXISTS `order` (
`order_id` int(11) NOT NULL auto_increment,
`order_start_date` datetime NOT NULL,
`order_end_date` datetime NOT NULL,
`contract_type_id` int(4) NOT NULL,
PRIMARY KEY (`order_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


CREATE TABLE IF NOT EXISTS `Config` (
`config_id` int(11) NOT NULL auto_increment,
`config_name` varchar(50) NOT NULL,
`config_value` varchar(50) NOT NULL,
PRIMARY KEY (`config_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


CREATE TABLE IF NOT EXISTS `order_history` (
`history_id` int(11) NOT NULL auto_increment,
`date` datetime NOT NULL,
`order_number` varchar(50) NOT NULL,
PRIMARY KEY (`history_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


CREATE TABLE IF NOT EXISTS `storage` (
`record_id` int(11) NOT NULL auto_increment,
`date` datetime NOT NULL,
`current` varchar(50) NOT NULL,
PRIMARY KEY (`record_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


CREATE TABLE IF NOT EXISTS `utilization` (
`record_id` int(11) NOT NULL auto_increment,
`step` int(11) NOT NULL,
`date` datetime NOT NULL,
`value` varchar(50) NOT NULL,
PRIMARY KEY (`record_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


CREATE TABLE IF NOT EXISTS `leadtime` (
`leadtime_id` int(11) NOT NULL auto_increment,
`date` datetime NOT NULL,
`value` varchar(50) NOT NULL,
PRIMARY KEY (`leadtime_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


CREATE TABLE IF NOT EXISTS `revenue` (
`revenue_id` int(11) NOT NULL auto_increment,
`contract_type_id` int(4) NOT NULL,
`date` datetime NOT NULL,
`value` varchar(50) NOT NULL,
PRIMARY KEY (`revenue_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
