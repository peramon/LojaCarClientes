-- INSERT INTO usuarios (nombre, apellido) VALUES('Cristian', 'Gaona');
--INSERT INTO usuarios (nombre, apellido) VALUES('Daniel', 'Gaona');
--INSERT INTO usuarios (nombre, apellido) VALUES('Juan', 'Gaona');

INSERT INTO credenciales(id, pass, usuario) VALUES(1,'12345678','ramon9124');
INSERT INTO credenciales(id, pass, usuario) VALUES(2,'abcdefgh','jaramillo7890');
INSERT INTO credenciales(id, pass, usuario) VALUES(3,'12345abc','valarezo7899');

INSERT INTO gerentes(id, cedula, apellidos, create_at, nombres, correo, telefono, direccion, id_credencial) VALUES (1, '1900849124','Ramon', NULL, 'Paul', 'peramon@example.com1', '0995067803','Zamora',1);

INSERT INTO empleados (id, cedula, apellidos, create_at, nombres, correo, telefono, direccion, id_credencial) VALUES (1, '1234567890','Jaramillo', NULL, 'Pedro', '@example.com1', '0995067803','Loja - La Pradera',2);
INSERT INTO empleados (id, cedula, apellidos, create_at, nombres, correo, telefono, direccion, id_credencial) VALUES (2, '1234567899', 'Valarezo', NULL, 'Valeria', '@example.com2', '0995067803', 'Loja - San Sebastian',3);
INSERT INTO empleados (id, apellidos, create_at, nombres, correo, telefono, direccion) VALUES (3, 'Rodriguez', NULL, 'José', '@example.com3', '0995067803', 'Loja - Sacuces Norte');
INSERT INTO empleados (id, apellidos, create_at, nombres, correo, telefono, direccion) VALUES (4, 'Carrión', NULL, 'Fernando', '@example.com4', '0995067803', 'Loja - San Sebastian');
INSERT INTO empleados (id, apellidos, create_at, nombres, correo, telefono, direccion) VALUES (5, 'Ramos', NULL, 'Aranda', '@example.com5', '0995067803', 'Loja - Esteba Godoy');
INSERT INTO empleados (id, apellidos, create_at, nombres, correo, telefono, direccion) VALUES (6, 'Carrasco', NULL, 'Julio', '@example.com6', '0995067803', 'Loja - San Sebastian');

INSERT INTO modelos (id,  modelo) VALUES (1, 'SPARK GT');
INSERT INTO modelos (id,  modelo) VALUES (2, 'SPARK GT');
INSERT INTO modelos (id,  modelo) VALUES (3, 'BEAT');

INSERT INTO vehiculos (id, anio, create_at, descripcion, precio, id_modelo) VALUES (1, '2020', NULL, 'Nissan para pasear con toda la familia','8012.00', 2); 
INSERT INTO vehiculos (id, anio, create_at, descripcion, precio, id_modelo) VALUES (2, '2020', NULL, 'Chevrolte, versatil y dinámico','9012.00', 1);
INSERT INTO vehiculos (id, anio, create_at, descripcion, precio, id_modelo) VALUES (3, '2020', NULL, 'El Nissan es una de nuestros mejores productos','7012.00',2);
INSERT INTO vehiculos (id, anio, create_at, descripcion, precio, id_modelo) VALUES (4, '2020', NULL, 'Chevrolte, versatil y dinámico','6012.00',1);
INSERT INTO vehiculos (id, anio, create_at, descripcion, precio, id_modelo) VALUES (5, '2020', NULL, 'Este es un auto muy eficiete','6012.00',3);

INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, direccion, profesion, telefono_casa, telefono_movil, contactenme, empleado_id) VALUES (1, 'Juan', 'juan@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo chevrolet', 'Paredes', 'Loja','Contador', '2123007', '0851354659', false,1);
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, direccion, profesion, telefono_casa, telefono_movil, contactenme, empleado_id) VALUES (2, 'Mario', 'mario@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo de mazda', 'Andrade', 'Zamora', 'Ingeniero', '2723807', '0991354659', false,2);
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, direccion, profesion, telefono_casa, telefono_movil, contactenme, empleado_id) VALUES (3, 'Andres', 'andres@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo nissan', 'Roman', 'Catamayo', 'Policia', '2423008', '0981354659', false,1);
INSERT INTO clientes (id, apellidos, correo_electronico, fecha_cre, detalle, nombres, direccion, profesion, telefono_casa, telefono_movil, contactenme, empleado_id) VALUES (4, 'Felipe', 'felipe@gmail.com', NULL, 'Cliente desea que le envíen la ficha del vehículo de su interés', 'Andrade', 'Loja', 'Medico', '2423080', '0991354659', false,2);


INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (1, '50.00', 12, 'Llantas', NULL);
INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (2, '90.00', 10, 'Amortiguadores', NULL);
INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (3, '10.50', 15, 'Aceite', NULL);
INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (4, '520.00', 2, 'Tableros', NULL);
INSERT INTO productos (id, precio, cantidad, nombre, fecha_cre) VALUES (5, '100.00', 24, 'Lunas traseras', NULL);

INSERT INTO actividades (id, detalle, fecha_asignacion, fecha_limite) VALUES (1,'Contactar con el cliente interesado en el nissan','2020-08-26','2020-08-30');
INSERT INTO actividades (id, detalle, fecha_asignacion, fecha_limite) VALUES (2,'Contactar con el cliente interesado en el mazda','2020-08-26','2020-08-29');
INSERT INTO actividades (id, detalle, fecha_asignacion, fecha_limite) VALUES (3,'Contactar con el cliente interesado en el vehiculo chevrolet','2020-08-26','2020-08-28');

INSERT INTO seguimientos (id, descripcion, fecha_atencion, fecha_inicio, id_cliente, id_empleado) VALUES (1, 'Reunion para ver el chevrolet', '2020-08-19 10:30', '2020-08-17', 1, 1);
INSERT INTO seguimientos (id, descripcion, fecha_atencion, fecha_inicio, id_cliente, id_empleado) VALUES (2, 'Reunion para ver el chevrolet', '2020-08-19 10:30', '2020-08-17', 2, 1);

INSERT INTO empleados_actividad (empleado_id, actividad_id) VALUES (1, 3);
INSERT INTO empleados_actividad (empleado_id, actividad_id) VALUES (2, 2);
INSERT INTO empleados_actividad (empleado_id, actividad_id) VALUES (3, 1);
INSERT INTO empleados_actividad (empleado_id, actividad_id) VALUES (4, 1);

INSERT INTO gerentes_empleados (gerente_id, empleados_id) VALUES (1, 1);
INSERT INTO gerentes_empleados (gerente_id, empleados_id) VALUES (1, 2);
INSERT INTO gerentes_empleados (gerente_id, empleados_id) VALUES (1, 3);
INSERT INTO gerentes_empleados (gerente_id, empleados_id) VALUES (1, 4);
INSERT INTO gerentes_empleados (gerente_id, empleados_id) VALUES (1, 5);
INSERT INTO gerentes_empleados (gerente_id, empleados_id) VALUES (1, 6);

/* INSERT INTO clientes_vehiculos (cliente_id, vehiculo_id) VALUES (1, 2), (1, 1);*/