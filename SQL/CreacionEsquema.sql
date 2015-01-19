--------- TABLA ALIMENTO --------------------------------------
drop table ALIMENTO CASCADE CONSTRAINT;

create table ALIMENTO (
	id number,
	descripcion varchar(50) not null,
	fecha_caducidad date not null,
	
	CONSTRAINT alimentoClave 
		PRIMARY KEY (id)
);

-------- TABLA ESTABLECIMIENTO ---------------------------------
drop table ESTABLECIMIENTO CASCADE CONSTRAINT;

create table ESTABLECIMIENTO (
	id number,
	nombre varchar(50) not null,
	direccion varchar(50) not null,
	localidad varchar(50) not null,
	

	CONSTRAINT establecimientoClave 
		PRIMARY KEY (id)
);

------- TABLA VOLUNTARIO ---------------------------------------
drop table VOLUNTARIO CASCADE CONSTRAINT;

create table VOLUNTARIO (
	id number,

	CONSTRAINT voluntarioCalve 
		PRIMARY KEY (id)
);

-------- TABLA INSTITUCION -------------------------------------
drop table INSTITUCION CASCADE CONSTRAINT;

create table INSTITUCION (
	cif char(9),
	nombre varchar(50) not null,
	razon_social varchar(50),
	telefono number not null,
	idVoluntario number not null UNIQUE,

	CONSTRAINT institucionClave 
		PRIMARY KEY (cif),
	CONSTRAINT voluntarioAjena 
		FOREIGN KEY (idVoluntario) REFERENCES VOLUNTARIO (id) on delete cascade
);

------- TABLA PERSONA ------------------------------------------
drop table PERSONA CASCADE CONSTRAINT;

create table PERSONA (
	dni char(9),
	nombre varchar(50) not null,
	apellido1 varchar(50) not null,
	apellido2 varchar(50),
	edad number(2) not null,
	e_mail varchar(50),
	localidad varchar(50) not null,
	telefono number not null,
	idVoluntario number not null UNIQUE,

	CONSTRAINT personaClave 
		PRIMARY KEY (dni),
	CONSTRAINT volAjena 
		FOREIGN KEY (idVoluntario) REFERENCES VOLUNTARIO (id) on delete cascade
);
		


------ TABLA RECOGE --------------------------------------------
drop table RECOGE CASCADE CONSTRAINT;

create table RECOGE (
	alimento number,
	voluntario number not null,
	establecimiento number not null,
	fecha_recogida date not null,
	fecha_salida date,
	entregado number(1),

	CONSTRAINT recogeClave 
		PRIMARY KEY (alimento),
	CONSTRAINT alimentoAjena 
		FOREIGN KEY (alimento) REFERENCES ALIMENTO (id),
	CONSTRAINT voluntarioAje
		FOREIGN KEY (voluntario) REFERENCES VOLUNTARIO (id) on delete set null,
	CONSTRAINT establecimientoAjena 
		FOREIGN KEY (establecimiento) REFERENCES ESTABLECIMIENTO (id) on delete set null

);

