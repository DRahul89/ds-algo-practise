create database metallica_trade; 
create schema trade_data;

create table trade_data.trade(
	trade_id bigint,
	side varchar(5),
	quantity int,
	price float4,
	tradeDate date,
	status varchar(10),
	counterparty_id bigint,
	commodity_id varchar(5),
	location_id varchar(5)
	
);

alter table trade_data.trade add constraint trade_pk primary key(trade_id);


{"tradeId":1,"quantity":200,"price":20.7,"side":"SELL","tradeDate":"2017-12-03","tradeStatus":"OPEN","counterPartId":2,"commodityId":"abc","locationId":"abc","userId":0}