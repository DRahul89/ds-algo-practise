create database metallica_refdata; 

create schema refdata;

create table refdata.counterparty(
	counterparty_id bigint,
	counterparty_name varchar(20)
);

alter table refdata.counterparty add constraint counterparty_pk primary key(counterparty_id);

create table refdata.commodity(
	commodity_id varchar(5),
	commodity_name varchar(20)
);

alter table refdata.commodity add constraint commodity_pk primary key(commodity_id);

create table refdata.location(
	location_id varchar(5),
	location_name varchar(20)
);

alter table refdata.location add constraint location_pk primary key(location_id);


insert into refdata.counterparty values(1,'Lorem');
insert into refdata.counterparty values(2,'Ipsum');
insert into refdata.counterparty values(3,'Dolar');
insert into refdata.counterparty values(4,'Sit');
insert into refdata.counterparty values(5,'Amet');


insert into refdata.commodity values('AL','Alluminium');
insert into refdata.commodity values('SL','Silver');
insert into refdata.commodity values('GD','Gold');
insert into refdata.commodity values('CR','Copper');
insert into refdata.commodity values('MC','Mercury');


insert into refdata.location values('LON','London');
insert into refdata.location values('NYK','Neyyork');
insert into refdata.location values('TOK','Tokyo');
insert into refdata.location values('NOR','North America');
insert into refdata.location values('BOS','Boston');
