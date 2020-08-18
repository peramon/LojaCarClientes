-- INSERT INTO usuarios (nombre, apellido) VALUES('Cristian', 'Gaona');
--INSERT INTO usuarios (nombre, apellido) VALUES('Daniel', 'Gaona');
--INSERT INTO usuarios (nombre, apellido) VALUES('Juan', 'Gaona');

INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (1, 'Jaramillo', NULL, 'Pedro');
INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (2, 'Valarezo', NULL, 'Valeria');
INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (3, 'Rodriguez', NULL, 'José');
INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (4, 'Carrión', NULL, 'Fernando');
INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (5, 'Ramos', NULL, 'Aranda');
INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (6, 'Carrasco', NULL, 'Julio');

INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (1, '2020', NULL, 'Nissan '); 
INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (2, '2020', NULL, 'Chevrolte, versatil y dinámico');
INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (3, '2020', NULL, 'El Mazda CX-30');
INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (4, '2020', NULL, 'Este es un versa Nissan');
INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (5, '2020', NULL, 'Otro Nissan');

INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, profesion, telefono_casa, telefono_movil) VALUES (1, 'Juan', 'juan@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo chevrolet', 'Paredes', 'Contador', '2123007', '0851354659');
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, profesion, telefono_casa, telefono_movil) VALUES (2, 'Mario', 'mario@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo de mazda', 'Andrade', 'Ingeniero', '2723807', '0991354659');
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, profesion, telefono_casa, telefono_movil) VALUES (3, 'Andres', 'andres@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo nissan', 'Roman', 'Policia', '2423008', '0981354659');
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, profesion, telefono_casa, telefono_movil) VALUES (4, 'Felipe', 'felipe@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo de su interés', 'Arizaga', 'Medico', '2423080', '0991354659');

/* INSERT INTO clientes_vehiculos (cliente_id, vehiculo_id) VALUES (1, 2), (1, 1);*/