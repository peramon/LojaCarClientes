-- INSERT INTO usuarios (nombre, apellido) VALUES('Cristian', 'Gaona');
--INSERT INTO usuarios (nombre, apellido) VALUES('Daniel', 'Gaona');
--INSERT INTO usuarios (nombre, apellido) VALUES('Juan', 'Gaona');

INSERT INTO empleados (id, apellidos, create_at, nombres, rol, direccion) VALUES (1, 'Jaramillo', NULL, 'Pedro', 'Asesor','Loja - La Pradera');
INSERT INTO empleados (id, apellidos, create_at, nombres, rol, direccion) VALUES (2, 'Valarezo', NULL, 'Valeria', 'Asesor','Loja - San Sebastian');
INSERT INTO empleados (id, apellidos, create_at, nombres, rol, direccion) VALUES (3, 'Rodriguez', NULL, 'José', 'Mantenimiento','Loja - Sacuces Norte');
INSERT INTO empleados (id, apellidos, create_at, nombres, rol, direccion) VALUES (4, 'Carrión', NULL, 'Fernando', 'Asesor','Loja - San Sebastian');
INSERT INTO empleados (id, apellidos, create_at, nombres, rol, direccion) VALUES (5, 'Ramos', NULL, 'Aranda', 'Manenimiento','Loja - Esteba Godoy');
INSERT INTO empleados (id, apellidos, create_at, nombres, rol, direccion) VALUES (6, 'Carrasco', NULL, 'Julio', 'Asesor','Loja - San Sebastian');

INSERT INTO vehiculos (id, anio, create_at, descripcion, precio) VALUES (1, '2020', NULL, 'Nissan ','8012.00'); 
INSERT INTO vehiculos (id, anio, create_at, descripcion, precio) VALUES (2, '2020', NULL, 'Chevrolte, versatil y dinámico','9012.00');
INSERT INTO vehiculos (id, anio, create_at, descripcion, precio) VALUES (3, '2020', NULL, 'El Mazda CX-30','7012.00');
INSERT INTO vehiculos (id, anio, create_at, descripcion, precio) VALUES (4, '2020', NULL, 'Este es un versa Nissan','6012.00');
INSERT INTO vehiculos (id, anio, create_at, descripcion, precio) VALUES (5, '2020', NULL, 'Otro Nissan','6012.00');

INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, direccion, profesion, telefono_casa, telefono_movil) VALUES (1, 'Juan', 'juan@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo chevrolet', 'Paredes', 'Loja','Contador', '2123007', '0851354659');
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, direccion, profesion, telefono_casa, telefono_movil) VALUES (2, 'Mario', 'mario@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo de mazda', 'Andrade', 'Zamora', 'Ingeniero', '2723807', '0991354659');
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, direccion, profesion, telefono_casa, telefono_movil) VALUES (3, 'Andres', 'andres@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo nissan', 'Roman', 'Catamayo', 'Policia', '2423008', '0981354659');
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, direccion, profesion, telefono_casa, telefono_movil) VALUES (4, 'Felipe', 'felipe@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo de su interés', 'La pradera - Loja', 'Loja', 'Medico', '2423080', '0991354659');


INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (1, '50.00', 12, 'Llantas', NULL);
INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (2, '90.00', 10, 'Amortiguadores', NULL);
INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (3, '10.50', 15, 'Aceite', NULL);
INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (4, '520.00', 2, 'Tableros', NULL);
INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (5, '100.00', 24, 'Lunas traseras', NULL);

INSERT INTO actividades (id, detalle, fecha_asignacion, fecha_limite) VALUES (1,'Mantenimiento del vehiculo chevrolet','2020-08-26','2020-08-30');
INSERT INTO actividades (id, detalle, fecha_asignacion, fecha_limite) VALUES (2,'Mantenimiento del vehiculo nissan','2020-08-26','2020-08-29');
INSERT INTO actividades (id, detalle, fecha_asignacion, fecha_limite) VALUES (3,'Contactar con el cliente interesado en el vehiculo chevrolet','2020-08-26','2020-08-28');


/* INSERT INTO clientes_vehiculos (cliente_id, vehiculo_id) VALUES (1, 2), (1, 1);*/