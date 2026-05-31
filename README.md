Cafetería – Prototipo Full‑Stack
Este proyecto es un prototipo full‑stack que muestra el invetario de los platos dispomnibles de una cafetería.
Incluye:

  Frontend: React + Vite + Bootstrap
  
  Backend: Java Spring Boot
  
  Base de datos: MySQL

  Dockerización completa mediante Docker Compose

Funcionalidades
  Ver lista de platos
  
  Añadir nuevos platos
  
  Guardado persistente en MySQL
  
  Comunicación mediante API REST

Tecnologías
  Java 17
  
  Spring Boot
  
  React + Vite
  
  MySQL
  
  Docker & Docker Compose

Cómo ejecutar el proyecto en local (sin Docker)

Backend
  Importar el proyecto en Eclipse/IntelliJ
  
  Configurar MySQL local:
  Base de datos: cafeteria
  
  Usuario: root
  
  Contraseña: root
  
  Ejecutar la clase BackendApplication
  
  El backend estará en:
  http://localhost:8080/api/platos

Frontend
  Código bash
  cd frontend
  npm install
  npm run dev
  El frontend estará en:
    http://localhost:5173

Cómo ejecutar el proyecto con Docker
  Código bash
    docker compose up --build
  Servicios:
  
  Frontend → http://localhost:5173

  Backend → http://localhost:8080

  MySQL → localhost:3306
