drop table if exists topic;

create table topic (
    id VARCHAR(50) not null,
    name VARCHAR(100) not null,
    description VARCHAR(100)
);

insert into topic (id,name,description) values ('spring','spring boot','spring boot description');
insert into topic (id,name,description) values ('java','java core','java core description');
insert into topic (id,name,description) values ('javascript','javascript web','javascript description');