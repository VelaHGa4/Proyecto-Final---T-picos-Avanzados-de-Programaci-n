# Proyecto-Final---T-picos-Avanzados-de-Programaci-n

Hola, buen día. Somos el equipo 17, conformado por Gael y Luis. A contincuación presentaremos el desarrollo de nuestro proyecto final que realizamos en conjunto a lo largo de este semestre de la materia de Tópicos Avanzados de Programamción. Desarrollamos, diseñamos y construimos un sistema funcional con dos CRUD, en inglés (Create, Read, Upgrade, Delete), uno de los acrónimos más escuchadas y utilizados en el mundo de la programación por su uso y significado, de esta forma se garantiza una sistema completo, que en conjunto con nuestros compañeros de clase, desarrollamos diversas aplicaciones con interfaces gráficas haciendo uso de NetBeans y Postgress SQL.

Nuestro proyecto trata de un sistema de control para un establecimiento de reparación de dispositivos electrónicos, por lo tanto interactuan tres principales actores. Los cuales son los administradores, los técnicos y los clientes. En este caso para llevar a cabo un excelente desempeño del sistema, nuestro trabajo esta dividido en dos CRUD, uno para administradores y otro para técnicos. Cada uno tiene roles totalmente diferentes, aunque coinciden en algunas cosas por su principales actividades que realiza cada uno.

Nuestro proyecto está construido en Java para las interfaces gráficas y una base de datos en PostgressSQL. El proyecto engloba el registro, manejo y distribución de una tienda de reparación de electrónicos a partir de un sistema de interfaces los cuales son:

•	Inicio de sesión

•	Menú administrador
	3 sistemas de gestión:
-	Gestión de usuarios
-	Gestión de inventario
-	Gestión de reparaciones

•	Menú técnico
	2 sistemas de gestión:
-	Gestión de reparaciones
-	Gestión de inventario

•	Apartado de envio de correos electrónicos

El proyecto esta desarrollado a partir del patrón de diseño MVC en el Modelo-Vista-Controlador para organizar el código en capas, organizando la lógica de negocio en el Modelo,  la interfaz de usuario en la Vista y el control de flujo de la aplicación en el Controlador. El proyecto incluye la funcionalidad completa de gestión de usuarios y productos de esta tienda que en conjunto con una interfaz intuitiva y fácil de utilizar engloba un campo de aplicación útil para el comercio que pueda hacer uso.

El apartado de la vista del programa esta conformado por las clases que hacen parte del entorno gráfico del programa, en este caso, a continuación, se explicara brevemente cómo funciona la ventana de inicio de sesión, el menú de administración y el menú de técnicos.
El sistema esta integrado con una ventana de inicio de sesión la cual esta compuesta de la siguiente forma. 


VENTANA DE INICIO DE SESIÓN DEL SISTEMA.

La clase implementa una interfaz gráfica para un sistema de inicio de sesión. A continuación, se explica brevemente su funcionamiento:
1.	Clase y Constructor: La clase InicioSesion extiende JFrame, lo que significa que es una ventana de aplicación. El constructor InicioSesion() inicializa los componentes de la interfaz gráfica mediante el método initComponents().
2.	Componentes de la Interfaz:
•	Se crean varios componentes gráficos, como etiquetas (JLabel), campos de texto (JTextField y JPasswordField), un combo box (JComboBox) para seleccionar el rol del usuario, un checkbox (JCheckBox) para mostrar u ocultar la contraseña, y un botón (JButton) para iniciar sesión.
•	Se establece un diseño utilizando GroupLayout para organizar estos componentes en la ventana.
3.	Mostrar/Ocultar Contraseña: El método cbVerContraseñaActionPerformed se encarga de cambiar el carácter de eco del campo de contraseña. Si el checkbox está seleccionado, se muestra la contraseña; de lo contrario, se oculta.
4.	Iniciar Sesión: El método btnIniciarSesionActionPerformed se ejecuta cuando el usuario hace clic en el botón de iniciar sesión. Este método:
•	Obtiene el nombre de usuario, la contraseña y el rol seleccionados.
•	Utiliza un objeto UsuarioDAO para obtener una lista de usuarios registrados.
•	Verifica si las credenciales ingresadas coinciden con algún usuario en la lista.
•	Si las credenciales son válidas, redirige al usuario a una ventana diferente según su rol (Administrador o Técnico) y cierra la ventana de inicio de sesión. Si las credenciales son incorrectas, muestra un mensaje de error.
5.	Estructura General: La clase está estructurada para ser parte de una aplicación más grande, donde UsuarioDAO se encarga de la lógica de acceso a datos y Usuario representa la entidad de usuario.
En resumen, esta clase proporciona una interfaz gráfica para que los usuarios ingresen sus credenciales y accedan a diferentes partes de la aplicación según su rol, validando las credenciales contra una lista de usuarios.


VENTANA DE MENÚ DE ADMINISTRACIÓN.

La clase represena una ventana de interfaz gráfica para un administrador en un sistema de gestión. A continuación, se explica brevemente su funcionamiento:
1.	Constructor y Carga Inicial:
•	El constructor VPdeADM() inicializa los componentes de la interfaz gráfica mediante el método initComponents().
•	Al abrir la ventana, se llaman a los métodos cargarTablaReparaciones() y cargarTablaInventario() para llenar las tablas con datos sobre reparaciones y artículos en el inventario.
2.	Componentes de la Interfaz:
•	La ventana contiene varios paneles (JPanel), etiquetas (JLabel) y tablas (JTable) que muestran información sobre reparaciones y el inventario.
•	Incluye iconos que permiten al usuario interactuar con diferentes secciones del sistema, como la gestión de usuarios, gestión de inventario y gestión de reparaciones.
3.	Interacción del Usuario:
•	Cada icono tiene un MouseListener que, al ser clicado, abre una nueva ventana correspondiente a la gestión de usuarios (GdUdeADM), gestión de inventario (GdIdeADM) o gestión de reparaciones (GdRdeADM).
•	El icono de "Cerrar Sesión" permite al usuario cerrar la ventana actual y regresar a la ventana de inicio de sesión (InicioSesion).
4.	Carga de Datos en Tablas:
•	cargarTablaReparaciones(): Este método crea un modelo de tabla (DefaultTableModel), obtiene una lista de reparaciones a través de ReparacionDAO, y llena la tabla con los datos de cada reparación (ID, cliente, técnico, dispositivo y estado).
•	cargarTablaInventario(): Similar al anterior, este método crea un modelo de tabla para el inventario, obtiene los items desde InventarioDAO, y llena la tabla con los datos de cada item (ID, nombre, cantidad disponible y costo unitario).
5.	Estructura General:
•	La clase está diseñada para ser parte de una aplicación más grande, donde ReparacionDAO e InventarioDAO son responsables de la lógica de acceso a datos para las reparaciones y el inventario, respectivamente.
En resumen, VPdeADM es una interfaz gráfica que permite a un administrador gestionar reparaciones y consultar el inventario disponible, mostrando información relevante en tablas y permitiendo la navegación a otras secciones del sistema.


VENTANA DE MENÚ DE TÉCNICO.

La clase VPdeTEC es una interfaz gráfica que permite a un técnico gestionar reparaciones y consultar el inventario disponible, mostrando información relevante en tablas y permitiendo la navegación a otras secciones del sistema. Se define una clase VPdeTEC, que representa una ventana de interfaz gráfica para un técnico en un sistema de gestión. A continuación, se explica brevemente su funcionamiento:
1.	Constructor y Carga Inicial:
•	El constructor VPdeTEC() inicializa los componentes de la interfaz gráfica mediante el método initComponents().
•	Al abrir la ventana, se llaman a los métodos cargarTablaRRegistradas() y cargarTablaIDisponible() para llenar las tablas con datos relevantes sobre reparaciones registradas y artículos disponibles en el inventario.
2.	Componentes de la Interfaz:
•	La ventana contiene varios paneles (JPanel) y etiquetas (JLabel) que describen las secciones de gestión de reparaciones, gestión de inventario y cerrar sesión.
•	Incluye dos tablas (JTable): tablaRRegistradas para mostrar un resumen de las reparaciones registradas y tablaIDisponible para mostrar un resumen del inventario disponible.
•	También hay iconos que permiten al usuario interactuar con diferentes secciones del sistema, como la gestión de reparaciones y la gestión de inventario.
3.	Interacción del Usuario:
•	Cada icono tiene un MouseListener que, al ser clicado, abre una nueva ventana correspondiente a la gestión de reparaciones (GdRdeTEC) o gestión de inventario (GdIdeTEC).
•	El icono de "Cerrar Sesión" permite al usuario cerrar la ventana actual y regresar a la ventana de inicio de sesión (InicioSesion).
4.	Carga de Datos en Tablas:
•	cargarTablaRRegistradas(): Este método crea un modelo de tabla (DefaultTableModel), obtiene una lista de reparaciones a través de ReparacionDAO, y llena la tabla con los datos de cada reparación (ID, cliente, dispositivo y estado).
•	cargarTablaIDisponible(): Similar al anterior, este método crea un modelo de tabla para el inventario, obtiene los items desde InventarioDAO, y llena la tabla con los datos de cada item (ID, nombre, cantidad disponible y costo unitario).
5.	Estructura General:
•	La clase está diseñada para ser parte de una aplicación más grande, donde ReparacionDAO e InventarioDAO son responsables de la lógica de acceso a datos para las reparaciones y el inventario, respectivamente.
En el apartado del modelo está conformado  por las clases que contienen la lógica de las clases del paquete de vista. A continuación, se explicará  brevemente el funcionamiento de las clases principales del sistema.


CÓDIGO DE LA CONEXIÓN DE LA BASE DE DATOS.

La clase ConexionDB proporciona métodos para establecer y cerrar conexiones a la base de datos  de PostgreSQL, asegurando que la conexión se maneje de manera eficiente y segura. Proporcionado. Se encarga de gestionar la conexión a una base de datos PostgreSQL. A continuación, se explica brevemente su funcionamiento:
1.	Constantes de Conexión:
•	Se definen tres constantes: URL, USER y PASSWORD, que contienen la información necesaria para conectarse a la base de datos. URL especifica la dirección de la base de datos, USER es el nombre de usuario y PASSWORD es la contraseña.
2.	Conexión Estática:
•	Se declara una variable estática connection que almacenará la conexión a la base de datos. Inicialmente, se establece en null.
3.	Método getConnection():
•	Este método es responsable de obtener una conexión a la base de datos.
•	Primero, verifica si la conexión es null o si está cerrada. Si es así, intenta cargar el driver de PostgreSQL y establecer una nueva conexión utilizando DriverManager.getConnection().
•	Si el driver no se encuentra, lanza una excepción SQLException con un mensaje de error.
•	Si la conexión se establece correctamente, se devuelve el objeto Connection.
4.	Método closeConnection():
•	Este método se encarga de cerrar la conexión a la base de datos si está abierta.
•	Verifica si la conexión no es null y no está cerrada antes de intentar cerrarla. Si ocurre un error al cerrar la conexión, se captura la excepción y se imprime un mensaje de error en la consola.
5.	Uso General:
•	La clase ConexionDB se utiliza para centralizar la lógica de conexión a la base de datos, facilitando la reutilización del código en diferentes partes de la aplicación que necesiten acceder a la base de datos.


CÓDIGO DE LA CLASE INVENTARIO

 L a clase Inventario es un modelo que encapsula la información y el comportamiento de un artículo en un sistema de gestión de inventario, permitiendo la creación de objetos que representan artículos con sus respectivas propiedades y métodos para acceder y modificar esos datos. Se define una clase Inventario que representa un artículo en un sistema de gestión de inventario. A continuación, se explica brevemente su funcionamiento:
1.	Atributos de la Clase:
•	La clase tiene seis atributos:
•	idItem: un entero que identifica de manera única el artículo.
•	nombre: una cadena que representa el nombre del artículo.
•	descripcion: una cadena que proporciona una descripción del artículo.
•	cantidadDisponible: un entero que indica cuántas unidades del artículo están disponibles en inventario.
•	costoUnitario: un objeto BigDecimal que representa el costo por unidad del artículo, permitiendo manejar valores monetarios con precisión.
•	fechaActualizacion: un objeto Timestamp que almacena la fecha y hora de la última actualización del artículo en el inventario.
2.	Constructor:
•	La clase incluye un constructor que permite inicializar todos los atributos al crear una nueva instancia de Inventario. Este constructor toma como parámetros los valores correspondientes a cada atributo.
3.	Getters y Setters:
•	Se proporcionan métodos "getter" y "setter" para cada atributo.
•	Los métodos "getter" permiten acceder a los valores de los atributos, mientras que los métodos "setter" permiten modificar esos valores. Esto sigue el principio de encapsulamiento, que es una buena práctica en programación orientada a objetos.
4.	Uso General:
•	La clase Inventario se utiliza para representar y manipular los datos de los artículos en el inventario de un sistema, facilitando la gestión de los mismos en la aplicación.


CÓDIGO DE LA CLASE REPARACIÓN

La clase Reparacion es un modelo que encapsula la información y el comportamiento de un registro de reparación en un sistema de gestión, permitiendo la creación de objetos que representan reparaciones con sus respectivas propiedades y métodos para acceder y modificar esos datos. Se define una clase Reparacion que representa un registro de reparación en un sistema de gestión de reparaciones. A continuación, se explica brevemente su funcionamiento:
1.	Atributos de la Clase:
•	La clase tiene nueve atributos:
•	idReparacion: un entero que identifica de manera única la reparación.
•	idCliente: un entero que representa el ID del cliente que solicita la reparación.
•	idTecnico: un entero que representa el ID del técnico encargado de realizar la reparación.
•	dispositivo: una cadena que describe el dispositivo que necesita reparación.
•	descripcion: una cadena que proporciona detalles sobre la reparación.
•	estado: una cadena que indica el estado actual de la reparación (por ejemplo, "pendiente", "en proceso", "completada").
•	costoEstimado: un objeto BigDecimal que representa el costo estimado de la reparación, permitiendo manejar valores monetarios con precisión.
•	fechaIngreso: un objeto Timestamp que almacena la fecha y hora en que se ingresó la reparación al sistema.
•	fechaEntrega: un objeto Timestamp que almacena la fecha y hora en que se espera que se entregue el dispositivo reparado.
2.	Constructor:
•	La clase incluye un constructor que permite inicializar todos los atributos al crear una nueva instancia de Reparacion. Este constructor toma como parámetros los valores correspondientes a cada atributo.
3.	Getters y Setters:
•	Se proporcionan métodos "getter" y "setter" para cada atributo.
•	Los métodos "getter" permiten acceder a los valores de los atributos, mientras que los métodos "setter" permiten modificar esos valores. Esto sigue el principio de encapsulamiento, que es una buena práctica en programación orientada a objetos.
4.	Uso General:
•	La clase Reparacion se utiliza para representar y manipular los datos de las reparaciones en un sistema de gestión, facilitando la gestión de las reparaciones y su seguimiento.


CÓDIDO DE LA CLASE USUARIOS

La clase Usuario es un modelo que encapsula la información y el comportamiento de un usuario en un sistema de gestión, permitiendo la creación de objetos que representan usuarios con sus respectivas propiedades y métodos para acceder y modificar esos datos.
A continuación, se explica brevemente su funcionamiento:
1.	Atributos de la Clase:
•	La clase tiene ocho atributos:
•	idUsuario: un entero que identifica de manera única al usuario.
•	nombre: una cadena que representa el nombre del usuario.
•	rol: una cadena que indica el rol del usuario en el sistema (por ejemplo, "administrador", "técnico", "cliente").
•	correo: una cadena que almacena la dirección de correo electrónico del usuario.
•	telefono: una cadena que contiene el número de teléfono del usuario.
•	usuario: una cadena que representa el nombre de usuario utilizado para iniciar sesión.
•	contrasena: una cadena que almacena la contraseña del usuario (debería ser manejada con cuidado por razones de seguridad).
•	fechaCreacion: un objeto Timestamp que indica la fecha y hora en que se creó el registro del usuario.
2.	Constructor:
•	La clase incluye un constructor que permite inicializar todos los atributos al crear una nueva instancia de Usuario. Este constructor toma como parámetros los valores correspondientes a cada atributo.
3.	Getters y Setters:
•	Se proporcionan métodos "getter" y "setter" para cada atributo.
•	Los métodos "getter" permiten acceder a los valores de los atributos, mientras que los métodos "setter" permiten modificar esos valores. Esto sigue el principio de encapsulamiento, que es una buena práctica en programación orientada a objetos.
4.	Uso General:
•	La clase Usuario se utiliza para representar y manipular los datos de los usuarios en un sistema de gestión, facilitando la gestión de la información del usuario y su autenticación.



Y nuestro sistema queda desarrollado de la siguiente forma:

Cuando se arranca el sistema, este inicialmente mostrara un interfaz con un panel de inicio de sesión. Como se ve a continuación.


![image](https://github.com/user-attachments/assets/d652e2bd-df61-4e8b-ac50-5a3fee0c04d9)


Primero se eleige el rol en el cual se va a iniciar sesión ysegún sea el en el que se inicie sesión. Este mostrara una ventana con las caracteristicas correspondienes, por ejemplo el administrador y quedaría de la siguiente forma. 

![image](https://github.com/user-attachments/assets/cf7865f4-abb6-494f-aeaf-61681e6cd08e)


Entrando en el entorno del rol de administrador, se pueden ejecutar 3 principales pestañas, las cuales principalemnte son de  gestion y pueden ser modificados según sea necesario.

![image](https://github.com/user-attachments/assets/04fe0d9f-02d7-4e10-8d99-372f115d6ba1)


Entrando a la ventana de gestión de usuarios, tenemos una interfaz con la posibilidad de editar, actualizar y eliminar los campos de la tabla y poder gestionar la variedad de base de datos y se 
 ve de la siguiente forma. 


![image](https://github.com/user-attachments/assets/fb236e8e-26b8-412f-91ba-33bf9bae3de0)



Este es la interfaz de la gestión de inventario, en la cual podemos editar el stock de los materiales que estén en la agregados en la tabla y pueden ser manipulados según sea el registro del administrador, de esta forma nuestra tienda tiene un complemento con  ayuda de las componentes que pueden ser gestionadas dentro de la tienda.


![image](https://github.com/user-attachments/assets/9b3e7b40-3fe5-4fa0-9574-c0c348db1503)


Luego, tenemos la interfaz de gestión de reparaciones, en el cual podemos interactuar con los registros de reportes que se hayan agregado o que deban ser agregados de aquellos dispositivos que estar fallando.

![image](https://github.com/user-attachments/assets/58da578d-b4e6-44fd-b619-fdee97283a6a)


Así también, nuestro sistema cuenta con una interfaz para el rol de técnico, aquellas personas que trabajan como empleados dentro de la tienda. Primero entonces se deberia de salir de la interfaaz de administrador e iniciarse sesión en el rol de técnico, como se ve a continuación.


![image](https://github.com/user-attachments/assets/b9c92295-1d31-4191-a086-0918bd12bb19)


Después nos encontramos con la ventana principal de la interfaz del rol de técnico, en donde podemos ver las opciones que tiene el técnico, como la gestión de las reparaciones y el de inventario.

![image](https://github.com/user-attachments/assets/25d3a6c5-97a5-4e74-b90e-6ed751f865fe)


Como primera opción tenemos la gestión de reparaciones, que se enfoca más en el rol técnico, al igual como la visualización de la gestión del inventario. Como se muestra a continuación.

![image](https://github.com/user-attachments/assets/f9cb6e31-8b4b-44ae-9dbb-3c23c45381b1)


![image](https://github.com/user-attachments/assets/6f5335be-f9ea-4726-8df1-d7a810539b0e)


Es así como queda finalmente desarrollado nuestro proyecto, implementando tencologías como lo es JAVA, el entorno de desarrollo NetBeans y también una base de datos con Postgrest enlazda a NetBeans, en la cual podemos consultar el inicio de de sesión y la tabla de datos de usuarios, inventario y diversas reparaciones.


https://github.com/user-attachments/assets/0a8e680e-526d-4048-a383-8d3241d8b86f



