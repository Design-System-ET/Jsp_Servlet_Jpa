# Jsp_Servlet_Jpa

## Resumen del Proyecto

Este proyecto es un ejemplo funcional que implementa un CRUD (Crear, Leer, Actualizar, Eliminar) utilizando tecnologías Java Web. Combina el uso de **Servlets** y **JSP** con el patrón de diseño **MVC**, proporcionando una base sólida para el desarrollo de aplicaciones web dinámicas. Es ideal para aprender y aplicar conceptos básicos y avanzados de desarrollo web utilizando Servlets y JPA para la persistencia de datos.

## Características principales

- Estructura basada en MVC para separar lógica, control y vista.
- CRUD funcional que gestiona operaciones con persistencia en base de datos.
- Uso de tecnologías modernas como Jakarta para manejar solicitudes HTTP y persistencia con JPA.

# Tecnologías Usadas

El proyecto utiliza las siguientes herramientas y tecnologías:

- **NetBeans**: Versión 23 como entorno de desarrollo integrado (IDE).
- **Java**: JDK versión 23.
- **MySQL**: Sistema de gestión de bases de datos, usando el conector com.mysql:mysql-connector-j.
- **Tomcat**: Servidor de aplicaciones versión 10.1.33.
- **Jakarta EE**: Versión 10, sucesor de Java EE, para manejar solicitudes HTTP y persistencia.

# Requisitos Previos
## Software necesario

- **NetBeans IDE**: Versión 23.
- **Java JDK**: Versión 23.

## Notas importantes

- Todas las dependencias necesarias están gestionadas en el archivo pom.xml del proyecto.
- La base de datos debe configurarse previamente, pero no requiere tablas creadas.

# Instalación
## 1\. Clonar el repositorio
En tu terminal, ejecuta el siguiente comando para clonar el proyecto:

```
git clone <https://github.com/Design-System-ET/Jsp_Servlet_Jpa.git>
```

## 2\. Configuración del entorno
1. **Base de datos**:
    - Crea un esquema vacío en tu base de datos MySQL.
2. **Conexión a la base de datos**:
    - Configura la conexión a la base de datos desde NetBeans:
        - Ve a la pestaña Services en NetBeans.
        - Crea una nueva conexión con las credenciales de tu base de datos.
3. **Servidor Tomcat**:
    - Descarga Tomcat 10 ([descarga oficial](https://tomcat.apache.org/download-10.cgi)).
    - Configúralo como servidor en NetBeans.

## 3\. Dependencias

Construye el proyecto y descarga todas las dependencias necesarias:

1. Haz clic derecho sobre el proyecto en NetBeans.
2. Selecciona **"Build With Dependencies"**.

# Configuración del Proyecto

## 1\. Base de datos

No es necesario crear tablas manualmente, pero asegúrate de tener un esquema vacío listo.

## 2\. Archivo persistence.xml

Configura las siguientes propiedades en el archivo:

```xml

	<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.2" xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
  <!-- Define Persistence Unit -->
  <persistence-unit name="NOMBRE_PU" transaction-type="RESOURCE_LOCAL">
    <provider>org.eclipse.persistence.jpa.PersistenceProvider</provider>
    <class>com.design_system.jsp_servlet_jpa.pojo.Usuario</class>
    <exclude-unlisted-classes>false</exclude-unlisted-classes>
    <properties>
      <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/NOMBRE-BD?serverTimezone=UTC"/>
      <property name="jakarta.persistence.jdbc.user" value="AQUI-TU-USUARIO"/>
      <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
      <property name="jakarta.persistence.jdbc.password" value="AQUI-TU-PASSWORD"/>
      <property name="jakarta.persistence.schema-generation.database.action" value="create"/>
    </properties>
  </persistence-unit>
</persistence>

```

Asegúrate de que el nombre del esquema, usuario y contraseña coincidan con tu configuración de MySQL.

## 3\. UsuarioJpaController
En el constructor del EntityManagerFactory, verifica que el nombre de la unidad de persistencia coincide con el especificado en persistence.xml.

```java

	public UsuarioJpaController(){
        emf = Persistence.createEntityManagerFactory("NOMBRE_PU");
    }

```

# Estructura del Proyecto

La estructura está organizada siguiendo el patrón MVC para garantizar modularidad y claridad:


# Uso
## 1\. Iniciar la aplicación

Ejecuta el proyecto desde NetBeans, seleccionando el servidor Tomcat configurado.

Una vez desplegado, accede a la aplicación desde tu navegador en:

```java

	<http://localhost:8080/Jsp_Servlet_Jpa/>

```

## 2\. Funcionalidades CRUD
Las operaciones disponibles son:

- **Crear**: Agregar nuevos registros a la base de datos.
- **Leer**: Ver y listar registros almacenados.
- **Actualizar**: Modificar registros existentes.
- **Eliminar**: Borrar registros.

# Licencia
Este proyecto está licenciado bajo la **MIT License**.

Puedes encontrar el texto completo de la licencia en el archivo LICENSE.
