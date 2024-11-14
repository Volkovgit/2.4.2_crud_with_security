CREATE TABLE IF NOT EXISTS public.users
(
    id integer NOT NULL DEFAULT nextval('users_id_seq'::regclass),
    car_id integer,
    age integer,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT users_pkey PRIMARY KEY (id),
    CONSTRAINT fko1knavyamin7hvebsto94sng0 FOREIGN KEY (car_id)
    REFERENCES public.carsq (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    )


insert into users (id,age,name,password) values
(1,20,'ADMIN','ADMIN'),(2,33,'USER','USER'),(3,444,'BABABA','BABABA');

insert into roles (id,role) values (1,'ADMIN'),(2,'USER'),(3,'BABABA');


insert into users_roles (roles_id,user_id) values (1,1),(2,2),(3,1),(3,3);
