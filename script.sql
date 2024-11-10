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


insert into roles (id,role) values (2,'USER');
insert into roles (id,role) values (1,'ADMIN');