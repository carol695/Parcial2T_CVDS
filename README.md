## Escuela Colombiana de Ingeniería

### CVDS
### INTEGRANTE: 

* Carol Tatiana Cely 

### Parcial Segundo Tercio


## Historia de usuario #1

  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  > **Como** Usuario de la plataforma de consultas médicas
  >
  > **Quiero** Poder consultar un paciente a partir de su número y tipo de identificación.
  >
  > **Para** Poder hacer una revisión de las consultas realizadas por un paciente cuyo documento ya conozco, y así evitar la búsqueda por el nombre del paciente.
  >
  > **Criterio de aceptación:** Se debe mostrar la fecha de nacimiento del paciente, su nombre, y cada una de las consultas realizadas. Las consultas deben estar organizadas de la más reciente (mostrados arriba) a la más antígua, y deben mostrar la fecha y el resúmen.

## Historia de usuario #2

  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  > **Como** Usuario de la secretaría de salud de la plataforma
  >
  > **Quiero** Tener un reporte de las consultas de los menores de edad (menóres de 18 años) en las que en el resúmen se encuentren enfermedades contagiosas.
  >
  > **Para** Conocer con rapidez qué pacientes debo revisar y tomar medidas al respecto.
  >
  > **Criterio de aceptación:** El reporte NO debe requerir entrar parámetro alguno. Se considerán como enfermedades contagiosas: 'hepatitis' y 'varicela'. El reporte sólo debe contener el número y tipo de identificación  del paciente y la fecha de nacimiento, ordenados por edad de mayor a menor.
  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Entrega

1. Documentar la solución en Readme de Git.

### SOLUCIÓN PARCIAL 

## PAQUETE MANAGEDBEANS

 Dado el código del parcial, lo primero que se realizó fue la creación de dos clases en el paquete de ManagedBeans. Las clases creadas fueron: 
 
 BasePageBean: Allí se está inyectando Managed Beans en JSF(JavaServer Faces)
 
 ConsultasBean: Esta es una clase que extiende a BasePageBean e inyecta un servicio de un paciente. 
 
 ![image](https://user-images.githubusercontent.com/63822072/199839851-280c463c-18a1-4116-a04d-40562fdad796.png)

![image](https://user-images.githubusercontent.com/63822072/199839898-75b57e95-617c-4656-ab74-042a25ed4315.png)

![image](https://user-images.githubusercontent.com/63822072/199839926-53bcc5fc-2f25-4a8e-a405-f7b107a4ad5b.png)

## PAQUETE DE PERSISTENCIA

En la parte de persistencia, en el paquete de mybatisimpl y en mappers se crea la interfaz de ConsultaMapper, allí se alojan dos interfaces 

![image](https://user-images.githubusercontent.com/63822072/199840422-7a0e647e-1cb9-4bb2-86ee-b02ef732eb04.png)

En estas interfaces se realizan todas aquellas operaciones de mapeo o transformaciones que necesitamos realizar sobre las diferentes clases. También se encuentran los 
métodos que se van a utilizar. 

![image](https://user-images.githubusercontent.com/63822072/199840821-63dcc893-97f5-4441-a9f1-0261110334e1.png)

![image](https://user-images.githubusercontent.com/63822072/199840846-168f32ff-2010-4dcb-a73b-c683bcaf5f19.png)
 
 Ahora en MyBatis se creará el otro batis que falta, es MyBatisDAOConsulta. 
 
 #### MyBatisConsulta: Allí se inyecta la consultaMapper que se creó anteriormente y se realizá un override a un método que obtiene consultas 
 
 ![image](https://user-images.githubusercontent.com/63822072/199844426-81722d45-c7bc-4a59-bca8-c2f94e051365.png)
 
 ###  MyBatisPaciente: Se complementa algunos métodos para poder realizar las historias de usuario #1 y #2
 
 ![image](https://user-images.githubusercontent.com/63822072/199845916-7e4b868f-3078-4927-99ae-e65c3ed010c4.png)

![image](https://user-images.githubusercontent.com/63822072/199845948-70cf1fef-1c60-4261-b45d-1a6144ca3960.png)

![image](https://user-images.githubusercontent.com/63822072/199845977-f65b5ae5-5245-44b0-9240-00f38b3471d5.png)


De igual forma se crea la interfaz DAOConsulta 

### DAOConsulta: En esta interfaz se hace un método que obtenga las consultas 

![image](https://user-images.githubusercontent.com/63822072/199845579-5ba129fd-18e1-44d7-a3b7-2fec50af8477.png)

### DAOPaciente: En esta interfaz se generan los métodos obtenerPacientesPorId() y obtenerMenoresPorEnfermedad()

![image](https://user-images.githubusercontent.com/63822072/199846178-3e2daec0-4645-45c2-bab2-65f493d5fa09.png)

## PAQUETE DE SERVICIOS

Se generan los métodos de obtenerPacientesPorId() y obtenerMenoresPorEnfermedad()

![image](https://user-images.githubusercontent.com/63822072/199846404-d9566f2d-cc79-4439-8543-3529a51679a4.png)

En la interfaz de ServiciosPaciente se crearon dos métodos de crearPaciente(Paciente e) y consultarConsultas()

![image](https://user-images.githubusercontent.com/63822072/199846712-b16f2b09-7966-4a3d-bc1a-dbc1f16e9f5a.png)

ServiciosPacientesFactory

![image](https://user-images.githubusercontent.com/63822072/199847251-fde99a6d-42b6-4c63-897c-d8c5901d0ab6.png)

![image](https://user-images.githubusercontent.com/63822072/199847275-0b0fd289-2cfb-4c6f-97c3-eae7bbdee04a.png)

### Es importante mencionar que se realizó un main para probar las funciones que se iban realizando 

![image](https://user-images.githubusercontent.com/63822072/199847431-bdde4358-682c-4bf7-8834-fbfec7782bcd.png)

Al momento de correr la clase 

![image](https://user-images.githubusercontent.com/63822072/199847588-e8d94283-c783-4cf0-9615-30849b7dbc5b.png)

## EN LA PARTE DE FRONT- END 

### Resources

En la carpeta de mappers, se realizan las diferentes consultas a las tablas de la base de datos 

ConsultaMapper: 

![image](https://user-images.githubusercontent.com/63822072/199850364-8d8c4aa1-94ef-40c2-b78a-575112487df3.png)

Ya en PacienteMapper se realiza las consultas para obtener las historias de usuario que nos piden 

![image](https://user-images.githubusercontent.com/63822072/199851239-4855594a-d8ec-4ac2-bc53-504087b80748.png)

### WEBAPP

#### ConsultaPaciente.xhtml: Allí se encuentra lo que se va a ver en la página web 

![image](https://user-images.githubusercontent.com/63822072/199852033-e4b02e9b-0cb5-4690-a55a-6fde0b8ba086.png)

Corriendo todo el paquete 

![image](https://user-images.githubusercontent.com/63822072/199852126-47763011-db06-4417-9c06-1d651341aad2.png)

Corriendo tomcat7:run 

![image](https://user-images.githubusercontent.com/63822072/199852168-356ebe83-08cf-4f98-be5f-e31bf51b52d1.png)

La pagina web se vería así:

![image](https://user-images.githubusercontent.com/63822072/199853068-1769205b-c152-4791-a529-88a4a2d8f9f2.png)

#### ConsultarMenoresEnfermedadContagiosa: Allí se encuentra lo que se va a ver en la página web para la realización de la historia de usuario 2

![image](https://user-images.githubusercontent.com/63822072/199853276-b7da2e6d-2290-4841-acb4-46703d7568dd.png)


### TEST 

En la prueba unitaria que se realizó se obtuvo los siguientes casos de equivalencia: 


Código: 

![image](https://user-images.githubusercontent.com/63822072/199853464-f5ed36cf-7714-4a05-8295-db3e316302a0.png)
 
Correr prueba: 

![image](https://user-images.githubusercontent.com/63822072/199853625-5506701d-fd28-4c50-b142-30f1e01a00e2.png)

### PRUEBAS DE LAS DOS HISTORIAS DE USUARIOS 

### HISTORIA DE USUARIO 1 

![image](https://user-images.githubusercontent.com/63822072/199853969-53908461-91bb-4fd1-808a-9bf4ffaf03c7.png)

Consultando las consultas de un paciente 

![image](https://user-images.githubusercontent.com/63822072/199854189-c0808fce-ba15-4efc-9a85-8972139d9511.png)


### HISTORIA DE USUARIO 2

![image](https://user-images.githubusercontent.com/63822072/199854260-a23bc90c-bf7b-40a2-8f67-48ae2c5bbea3.png)

Aquí aparece una sola fila debido a que hay un menor de edad nacido en el 2018 que padece de varicela 



## Bono

Si después de realizado el parcial, de forma INDIVIDUAL encuentra defectos menores (que impliquen a lo sumo cambiar 5 líneas de código), y que al corregirlos permiten que los puntos 2 o 3 funcionen:

1. Haga los ajustes en su código.

2. Haga un nuevo commit con el mensaje "entrega bono, ahora funciona el Punto XX" , donde XX es el punto que se corrigió. 

3. Ejecute:

    ```bash
    $ git diff --stat HEAD HEAD^^
    ```

4. Si el resultado del comando anterior es menor o igual a 10, puede aplicar al bono.

5. Comprima la nueva versión siguiendo el esquema indicado en el parcial, y súbalo a más tardar el 24 de Marzo a las 11:59pm en el espacio correspondiente.

