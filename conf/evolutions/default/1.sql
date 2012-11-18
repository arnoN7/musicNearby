# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table job_offer (
  id                        bigint not null,
  job_name                  varchar(255),
  company_name              varchar(255),
  job_description           clob,
  job_url                   varchar(255),
  applicant_email           varchar(255),
  status                    integer,
  review_id                 bigint,
  constraint ck_job_offer_status check (status in (0,1,2,3)),
  constraint pk_job_offer primary key (id))
;

create table review_offer (
  id                        bigint not null,
  job_offer_id              bigint,
  constraint pk_review_offer primary key (id))
;

create table sound_project (
  id                        bigint not null,
  name                      varchar(255),
  sound                     varchar(255),
  owner_email               varchar(255),
  constraint pk_sound_project primary key (id))
;

create table account (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_account primary key (email))
;


create table job_offer_account (
  job_offer_id                   bigint not null,
  account_email                  varchar(255) not null,
  constraint pk_job_offer_account primary key (job_offer_id, account_email))
;

create table review_offer_account (
  review_offer_id                bigint not null,
  account_email                  varchar(255) not null,
  constraint pk_review_offer_account primary key (review_offer_id, account_email))
;
create sequence job_offer_seq;

create sequence review_offer_seq;

create sequence sound_project_seq;

create sequence account_seq;

alter table job_offer add constraint fk_job_offer_applicant_1 foreign key (applicant_email) references account (email) on delete restrict on update restrict;
create index ix_job_offer_applicant_1 on job_offer (applicant_email);
alter table job_offer add constraint fk_job_offer_review_2 foreign key (review_id) references review_offer (id) on delete restrict on update restrict;
create index ix_job_offer_review_2 on job_offer (review_id);
alter table review_offer add constraint fk_review_offer_jobOffer_3 foreign key (job_offer_id) references job_offer (id) on delete restrict on update restrict;
create index ix_review_offer_jobOffer_3 on review_offer (job_offer_id);
alter table sound_project add constraint fk_sound_project_owner_4 foreign key (owner_email) references account (email) on delete restrict on update restrict;
create index ix_sound_project_owner_4 on sound_project (owner_email);



alter table job_offer_account add constraint fk_job_offer_account_job_offe_01 foreign key (job_offer_id) references job_offer (id) on delete restrict on update restrict;

alter table job_offer_account add constraint fk_job_offer_account_account_02 foreign key (account_email) references account (email) on delete restrict on update restrict;

alter table review_offer_account add constraint fk_review_offer_account_revie_01 foreign key (review_offer_id) references review_offer (id) on delete restrict on update restrict;

alter table review_offer_account add constraint fk_review_offer_account_accou_02 foreign key (account_email) references account (email) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists job_offer;

drop table if exists job_offer_account;

drop table if exists review_offer;

drop table if exists review_offer_account;

drop table if exists sound_project;

drop table if exists account;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists job_offer_seq;

drop sequence if exists review_offer_seq;

drop sequence if exists sound_project_seq;

drop sequence if exists account_seq;

