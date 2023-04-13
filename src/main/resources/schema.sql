create table if not exists photoz (
    id identity not null primary key,
    file_name varchar(255),
    content_type varchar(255),
    data binary large object
);