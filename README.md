# TareasApp
## _Aplicación para la gestión de tareas_
#
### Descripción del Proyecto
Esta aplicación, desarrollada en Spring Boot utilizando Spring Data JPA, JSP, MySQL y Bootstrap, está diseñada para el seguimiento y gestión de tareas.
Aquí están los aspectos más destacados:


### Funcionalidades Principales:
**CRUD para Tareas**
- **Creación** de tareas con título, fecha de creación y estado de la tarea.
- **Modificación** y **Eliminación** de tareas.
- **Panel** gráfico, desarrollado con Bootstrap, con el listado de las tareas y opciones para administrarlas.


### Tech
Esta aplicación se ha creado usando las siguientes tecnologias:
- [Java] - Lenguaje de programación principal.
- [Spring Boot] - Framework que simplifica el desarrollo de aplicaciones Java.
- [Spring Data JPA] - Facilita el acceso a bases de datos relacionales mediante el uso de JPA.
- [Hibernate] - Framework de mapeo objeto-relacional integrado con JPA.
- [Maven]- Herramienta de gestión de proyectos para la construcción y gestión de dependencias en el desarrollo de software Java.
- [MySQL] - El sistema de gestión de bases de datos relacional utilizado para almacenar y recuperar datos.
- [JSP] - JavaServer Pages, tecnología utilizada para desarrollar vistas en aplicaciones web Java.
- [Bootstrap] - Framework front-end que simplifica el desarrollo de interfaces de usuario web modernas y receptivas.

### Instrucciones de uso
**Configuración del proyecto:**
- Asegúrese de tener instalado Java y un IDE compatible con Maven como [IntelliJ] o [NetBeans].
- Clone este proyecto en su repositorio local: 
```sh
git clone https://github.com/seruax/TareasApp.git
```
- Importe el proyecto en su IDE compatible con Maven.

**Configuración de la base de datos**:
- Configure las propiedades de conexión a su base de datos en 'application.properties'.
- La creación automática de la base de datos y las tablas está habilitada por defecto para facilitar la configuración. Éstas se crearán la primera vez quen ejecute la aplicación.

**Ejecución del Proyecto**:
- Ejecute la aplicación desde su IDE o mediante Maven:
```sh
mvn spring-boot:run
```

**Exploración de la APP**:
- Cree una nueva tarea con los datos necesarios.
- Cuando haya completado la tarea, seleccione 'Marcar Completado' para cambiar su estado a Completada.
- Si necesita editar, o eliminar la tarea, seleccione la opción correspondiente.



   [Java]: <https://www.oracle.com/es/java/technologies/downloads/>
   [Spring Boot]: <https://spring.io/projects/spring-boot>
   [Spring Data JPA]: <https://spring.io/projects/spring-data-jpa>
   [Hibernate]: <https://hibernate.org>
   [MySQL]: <https://www.mysql.com>
   [Maven]: <https://maven.apache.org>
   [IntelliJ]: <https://www.jetbrains.com/es-es/idea/>
   [NetBeans]: <https://netbeans.apache.org/front/main/>
   [JSP]: <https://www.oracle.com/java/technologies/jspt.html>
   [Bootstrap]: <https://getbootstrap.com>

