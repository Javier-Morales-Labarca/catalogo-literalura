<h1 align="center"> Catálogo de Libros Interactivo </h1>

## Datos de Proyecto:
Título: Challenge Backend Java - LiterAlura

Subtítulo: Challenge de Programación - Backend Java 

Autor: Javier Morales Labarca

Contexto: Alura Latam & Oracle (ONE) - Agosto 2025

## Introducción y Objetivo:
Desafío: Construir un Catálogo de Libros

Problema: ¿Cómo crear un catálogo de libros personal y persistente a partir de una fuente de datos inmensa como la web?

Objetivo del Proyecto: Desarrollar una aplicación de consola en Java que interactúe con una API (Gutedex) externa para buscar información sobre libros.

Después que los datos de libros y autores en una base de datos PostgreSQL para crear un catálogo local y consultable.

## Funcionalidades de LiteAlura:

- Búsqueda de Libros por Título con API Gutendex.

- Listado de Libros Registrados.

- Listado de Autores Registrados.

- Listado de Autores Vivos por Año.

- Listado de Libros por Idioma.

## Arquitectura:

- Presentación: Principal (Consola interactiva con el usuario).

- Servicio: LibroServicio (Contiene toda la lógica de negocio).

- Repositorio: LibrosRepository, AutorRepository (Capa de acceso a datos con Spring Data JPA).

- Entidad: Libro, Autor (Representan las tablas en la base de datos).

- DTO: LibroDTO, AutorDTO (Moldean los datos recibidos de la API).

- Flujo de Búsqueda:

- El Usuario ingresa un título en la consola.

- El Servicio llama a la API de Gutendex.

- La API devuelve un JSON.

- El Servicio convierte el JSON a objetos DTO.

- Verifica si el libro/autor ya existe en la Base de Datos.

- Si no existe, lo guarda a través del Repositorio.

- Se muestra el resultado al Usuario.

## Tecnologías:

- Java 17.

- Spring Boot 3.

- PostgreSQL.

- Maven.

- API de Gutendex.

- Git y GitHub.
