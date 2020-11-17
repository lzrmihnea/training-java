drop table students ;

-- This is a comment
-- Create
create table students(ID int, first_name varchar(64), email varchar(64));

seLEct * fRoM studenTS; -- uppercase and lowercase can be used for syntax

-- Insert
insert into students (id, first_name, last_name, email)
    values (1, 'Maria', 'Pop', 'maria.pop@gmail.com');

select count(*) from students;
-- delete from students where first_name='Maria';
insert into students (id, first_name, last_name) values (2, 'Mihnea', 'Lazar');
insert into students (id, last_name, email) values (3, 'Chiorean', 'mihai.chiorean@gmail.com');

-- Select
select first_name from students;
select last_name, email from students;
select email from students where id=1;
select * from students where email like '%@gmail.com';

-- Indexes
create index ix_students_id on students(id); -- alternate syntax: create index on students(id);
select * from students where id=2; -- much faster with an index

create index ix_students_first_name_last_name on students(first_name, last_name); --multiple columns index
select * from students where first_name='Mihnea' and last_name='Lazar'; --much faster, uses index
select * from students where last_name='Lazar' and first_name='Mihnea'; --exact same query, but because it first looks for last_name, it does NOT use the index

-- too many indexes affect the writing speed, so we use them carefully on the columns for searching

-- Primary Key (PK)
alter table students add primary key (id); --will automatically also have an index
select * from students;
insert into students(id, first_name, last_name) values (1, 'Diana', 'Popsa'); -- doesn't work

update students set first_name='Diana', last_name='Popsa', email='diana.popsa@gmail.com' where id=1; -- will work
select * from students;
insert into students (first_name) values ('Gigi'); -- will not work, ID cannot be null (COULD work, if ID would be auto-generated)

alter table students add column professor_name varchar(64);
select * from students;
update students set professor_name='Dumbledore' where id!=3;
update students set professor_name='Snape' where id=3;

-- (Normal Form 1) NF1 -> (Normal Form 2) NF2
alter table students drop column professor_name;
create table professor (
    id int primary key,
    last_name varchar(64),
    first_name varchar(64)
);
select * from professor;
insert into professor(id, last_name, first_name) values (1, 'Dumbledore', 'Albus');
insert into professor(id, last_name, first_name) values (2, 'Snape', 'Severus');

alter table students add column professor_id int;
alter table students add constraint students_fkey foreign key(professor_id) references professor(id); -- MANY-TO-ONE relationship (many Students to one Professor)
update students set professor_id=1 where id!=3;
update students set professor_id=2 where id=3;
select * from students;

-- Joins
select * from students;
select * from professor;

select * from students
    join professor on students.professor_id=professor.id
    order by students.id;

-- Joins using Aliases (s, p)
select s.id, s.first_name, s.last_name, p.first_name, p.last_name from students s
    join professor p on s.professor_id=p.id;

insert into students(id, first_name, last_name, email) values (4, 'Cristi', 'Miron', 'cristi.miron@gmail.com');
select * from students;

-- INNER JOIN (In PostgreSQL join==inner join)
select s.id, s.first_name, s.last_name, p.first_name, p.last_name from students s inner join professor p on s.professor_id=p.id; -- because Cristi Miron does not have a Professor_id, result will not show. This is an INNER JOIN

-- LEFT JOIN
select s.id, s.first_name, s.last_name, p.first_name, p.last_name from students s left join professor p on s.professor_id=p.id;
insert into professor(id,last_name) values (3, 'McGonaghal');

-- RIGHT JOIN
select s.id, s.first_name, s.last_name, p.first_name, p.last_name from students s right join professor p on s.professor_id=p.id;

-- FULL OUTER JOIN
select s.id, s.first_name, s.last_name, p.first_name, p.last_name from students s full join professor p on s.professor_id=p.id;

-- From NF2 => NF3
select * from students;
create table students_professors (
    student_id int,
    professor_id int,
    primary key (student_id, professor_id), -- unique combinations
    foreign key(student_id) references students(id),
    foreign key(professor_id) references professor(id)
);
alter table students drop column professor_id;

select * from students_professors;
insert into students_professors(student_id, professor_id) values(1, 1);
insert into students_professors(student_id, professor_id) values(2, 1);
insert into students_professors(student_id, professor_id) values(3, 2);
select * from students s
    join students_professors sp on sp.student_id=s.id
    join professor p on p.id = sp.professor_id; -- NF 3, with connection table
                                                -- MANY-TO-MANY (many Students to many Professors)

delete from professor where last_name='Dumbledore';