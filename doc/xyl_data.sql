/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/29 23:26:45                           */
/*==============================================================*/


drop table if exists classinfo;

drop table if exists relation_user_class;

drop table if exists userinfo;

drop table if exists userinfo_ext;

/*==============================================================*/
/* Table: classinfo                                             */
/*==============================================================*/
create table classinfo
(
   id                   varchar(36) not null,
   class_name           varchar(36),
   creator_id           varchar(36) not null,
   create_time          timestamp,
   monitor_id           varchar(36),
   class_desc           varchar(500),
   invite_code          varchar(10),
   primary key (id)
);

/*==============================================================*/
/* Table: relation_user_class                                   */
/*==============================================================*/
create table relation_user_class
(
   id                   varchar(36) not null,
   user_id              varchar(36) not null,
   city                 varchar(20) not null,
   state                varchar(10) not null comment '0 申请  1 已加入 2 未通过',
   primary key (id)
);

/*==============================================================*/
/* Table: userinfo                                              */
/*==============================================================*/
create table userinfo
(
   id                   varchar(36) not null,
   user_name            varchar(36) not null,
   city                 varchar(20) not null,
   company              varchar(100),
   telephone            varchar(20),
   wx_unionid           varchar(36) not null,
   sex                  bit,
   birthday             datetime,
   default_classid      varchar(36),
   primary key (id)
);

/*==============================================================*/
/* Table: userinfo_ext                                          */
/*==============================================================*/
create table userinfo_ext
(
   id                   varchar(36) not null,
   user_id              varchar(36) not null,
   class_id             varchar(36) not null,
   info_type            varchar(36) not null comment '0 人物生平 1 人物评价 2 人物事迹',
   creator_id           varchar(36) not null,
   create_time          timestamp not null,
   content              varchar(1000),
   remark               varchar(36),
   state                varchar(10) not null,
   primary key (id)
);

