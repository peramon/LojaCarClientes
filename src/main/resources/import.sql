-- INSERT INTO usuarios (nombre, apellido) VALUES('Cristian', 'Gaona');
--INSERT INTO usuarios (nombre, apellido) VALUES('Daniel', 'Gaona');
--INSERT INTO usuarios (nombre, apellido) VALUES('Juan', 'Gaona');

INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (1, 'Jaramillo', NULL, 'Pedro');
INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (2, 'Valarezo', NULL, 'Valeria');
INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (3, 'Rodriguez', NULL, 'José');
INSERT INTO empleados (id, apellidos, create_at, nombres) VALUES (4, 'Carrión', NULL, 'Fernando');

INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (1, '2020', NULL, 'Este carro es un Nissan'); 
INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (2, '2020', NULL, 'Nissan');
INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (3, '2020', NULL, 'Carrito Nissan');
INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (4, '2020', NULL, 'Este es un versa Nissan');
INSERT INTO vehiculos (id, anio, create_at, descripcion) VALUES (5, '2020', NULL, 'Otro Nissan');

INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, profesion, telefono_casa, telefono_movil) VALUES (1, 'Correa', 'ra.correa90@gmail.com', NULL, 'Cliente desea que le envíen el catálogo del vehículo de su interés', 'Andrés', 'Ingeniero', '072721817', '0986245602');

/* INSERT INTO clientes_vehiculos (cliente_id, vehiculo_id) VALUES (1, 2), (1, 1);*/