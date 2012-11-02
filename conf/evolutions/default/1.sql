# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table sound_project (
  id                        bigint not null,
  name                      varchar(255),
  sound                     varchar(255),
  constraint pk_sound_project primary key (id))
;

create table task (
  id                        bigint not null,
  label                     varchar(255),
  constraint pk_task primary key (id))
;

create table account (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_account primary key (email))
;

create sequence sound_project_seq;

create sequence task_seq;

create sequence account_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists sound_project;

drop table if exists task;

drop table if exists account;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists sound_project_seq;

drop sequence if exists task_seq;

drop sequence if exists account_seq;

