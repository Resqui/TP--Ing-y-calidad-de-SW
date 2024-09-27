# TP--Ing-y-calidad-de-SW
## Sistema de Gestión de la Biblioteca

Este es un proyecto Java que simula un sistema de gestión para una biblioteca, permitiendo a los usuarios prestar y devolver libros.

### Descripción

El sistema permite a los usuarios:
- Buscar libros disponibles.
- Prestar libros.
- Devolver libros.

El proyecto sigue el flujo de trabajo **Gitflow** para la gestión de versiones, utilizando ramas de desarrollo y lanzamiento.

### Instalación

1. Clona el repositorio:

   git clone https://github.com/usuario/nombre-repositorio.git
2. Asegúrate de tener instalado JDK (Java Development Kit) versión 11 o superior.

### Versionado
Versión 1.0.0
- Se creó el repositorio en GitHub y se configuró Gitflow.
- Se implementó el sistema de biblioteca básico en Java, con las clases principales (Libro, Usuario, Biblioteca, Main).
- Se lanzó la primera versión (v1.0.0) tras realizar las modificaciones finales en la rama release.
Versión 1.0.1
- Se encontró un error en producción y se creó una rama hotfix para corregirlo.
- Se agregó un mensaje adicional en la clase Main para corregir el problema.
- Se finalizó la corrección y se lanzó la versión v1.0.1 a producción.
- Nueva funcionalidad
- Se creó una nueva funcionalidad en una rama feature.
- Se implementaron dos modificaciones: A y B. Luego se deshizo la modificación B para volver al estado de A.
- Se mergeó la rama feature con develop y se lanzó a producción a través de una nueva release.