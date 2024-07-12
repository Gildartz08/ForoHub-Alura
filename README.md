<h1 align="center"> Challenge ForoHub Alura </h1>

![logo](https://github.com/user-attachments/assets/0376fb32-b4b0-46d9-8ff5-c3faf51711bb)

![Static Badge](https://img.shields.io/badge/release%20date-july-Green)![Static Badge](https://img.shields.io/badge/status-en%20desarrollo-yellow)![Static Badge](https://img.shields.io/badge/language-java-red?style=for-the-badge)

<h4 align="center">
:construction: Proyecto en construcción, pronto se agregarán las opciones y funciones de requerimiento opcional en futuros commits :construction:
</h4>

## 🚀Descripción del proyecto:
El siguiente es un proyecto realizado con el lenguaje Java en su version 17 usando Spring Boot para creación del proyecto y usando el IDE IntelliJ Idea. Se trata de un proyecto como parte del programa de formación como Java Backend Developer de Oracle Next Education y Alura Latam.

## ⚙️Funcionalidades del proyecto:
- `Login Usuario`: Obtener el Json Web Token (JWT) para obtener acceso a las demás funciones de la API
- `Registrar Tópicos`: Método POST para agregar datos a la base de datos
- `Listar Tópicos`: Método GET para listar todos los tópicos presentes en la base de datos
- `Actualizar Tópico`: Método PUT para la modificación de un elemento de la base de datos indicando su id en el path de la request
- `Eliminar Tópico`: Método DELETE que permite eliminar un elemento de la base datos indicando su id en el path de la request

## 🛠️Funcionamiento de la Aplicación:
<h4 align="center"> Vista del proyecto y compilación en IDE: IntelliJ IDEA </h4>

![1](https://github.com/user-attachments/assets/6f7f7d75-5670-43d7-a46b-f996adaa8793)
![2](https://github.com/user-attachments/assets/30aa6495-b390-49b7-ac9f-8226399c2feb)

<h4 align="center"> Usando Insomnia para envio de requests, endpoint de login con obtención de JWT:</h4>

![3](https://github.com/user-attachments/assets/2aeece45-a176-4837-bdbf-e357aef526d7)

<h4 align="center"> Error 403 Forbidden al usar los métodos sin la autorización necesaria: </h4>

![4](https://github.com/user-attachments/assets/9428951e-13ab-4e1e-87f6-5919ff82f2b9)
![5](https://github.com/user-attachments/assets/8d3db8d4-b3c5-4f21-8360-081dbb2696ef)

<h4 align="center"> Proporcionando el token en la request ya es posible el acceso al resto de métodos: </h4>

![7](https://github.com/user-attachments/assets/805b4693-1e81-4cf7-ad56-0569d934b86e)
![6](https://github.com/user-attachments/assets/495f1e0d-729c-4312-b6a0-67c45134c493)

<h4 align="center"> Los métodos PUT y DELETE usan la url path para accesar a elementos segun su id en la base de datos. Y tambien usan el token de acceso </h4>

![8](https://github.com/user-attachments/assets/63cdb370-bf3d-40fe-91c2-a950d17b92ca)
![9](https://github.com/user-attachments/assets/b9f68068-02c2-46f0-bde9-641d3013eab8)

<h4 align="center"> EL RDBMS que usé fué MySQL Workbench: </h4>

![10](https://github.com/user-attachments/assets/5f7e75f0-37bb-466a-8c16-a14fb83c1b0a)

<h4 align="center">  </h4>


## ✔️Tecnologías utilizadas:
- `Java 17`
- `Spring Boot`
- `Maven`
- `Insomnia`
- `MySQL`

## Autor

| [<img src="https://avatars.githubusercontent.com/u/150280699?s=96&v=4" width=115><br><sub>Heriberto Amaya</sub>](https://github.com/Gildartz08)|
| :---: |
