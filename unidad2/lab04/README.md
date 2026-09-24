# Laboratorio 04

## Tema: Analizar paquetes con Wireshark

## Wireshark:
- Es un analizador de paquetes de red gratuito y de código abierto que permite capturar e inspeccionar en tiempo real el tráfico que circula por una red de comunicaciones.
- Descargar Wireshark: https://www.wireshark.org/#download
- Vea el video para instalar Wireshark en GNU/Linux:
- [![Video instalación de Wireshark](wireshark_youtube.png)](https://www.youtube.com/watch?v=opVVhChYFyg)

## Cree hosts para probar sus comunicaciones:
- Opción A: Utilizar el sistema operativo en 2 o más computadoras de laboratorio (se utilizará la red LAN del laboratorio).
- Opción B: Utilizar wsl en el sistema operativo de la computadora de laboratorio (se utilizará la red LAN del laboratorio).
- Opción C: Utilizar Docker para crear 2 o más contenedores en una computadora de laboratorio (se puede crear una red interna en Docker o utilizar la red LAN de laboratorio).
- Opción D: Utilizar Virtualbox para aplicar las opciones A, B o C.

## Grupos de 4 integrantes: (Indicar las tareas que realizó cada integrante)
| Alumno | Tarea realizada | Porcentaje |
|---|---|---|
|Apellidos y Nombres de Integrante 1|Descripción de la tarea.|100%|
|Apellidos y Nombres de Integrante 2|Descripción de la tarea.|100%|
|Apellidos y Nombres de Integrante 3|Descripción de la tarea.|100%|
|Apellidos y Nombres de Integrante 4|Descripción de la tarea.|100%|

## Actividades:
- **Construir la imagen y crear los contenedores**
- Desde la carpeta donde están Dockerfile y docker-compose.yml:
```bash
docker compose up -d --build
```
```bash
docker ps
```
```bash
docker exec -it rcd_lab04_container1_escobedo bash
```
```bash
docker exec -it rcd_lab04_container2_escobedo bash
```
- Si quieres eliminar los contenedores y la red creada por Compose:
```bash
docker compose down
```

## Comandos individuales para eliminar todos los artefactos de este laboratorio

```bash
docker ps
```

```bash
docker stop rcd_lab04_container1_escobedo
```

```bash
docker stop rcd_lab04_container2_escobedo
```

```bash
docker ps -a
```

```bash
docker rm rcd_lab04_container1_escobedo
```

```bash
docker rm rcd_lab04_container2_escobedo
```

```bash
docker images
```

```bash
docker rmi rcd_lab04_image_escobedo:latest
```

```bash
docker network ls
```

```bash
docker network rm rcd_lab04_network_escobedo
```
