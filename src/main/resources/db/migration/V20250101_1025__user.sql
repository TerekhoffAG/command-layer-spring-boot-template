--liquibase formatted sql

--changeset cl:1
create table cl_user (
  id uuid not null,
  name varchar(512),
  email varchar(255),
  primary key (id)
);

comment on table cl_user is 'User table';
comment on column cl_user.id is 'Unique identifier user';
comment on column aq_user.name is 'User name';
comment on column aq_user.email is 'User email address';
