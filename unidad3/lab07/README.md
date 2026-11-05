# Laboratorio: Subnetting IPv4 utilizando FLSM

## 1. Objetivos

- Identificar direcciones IPv4 de clase A, B y C.
- Calcular subredes utilizando máscaras de longitud fija (FLSM).
- Determinar la nueva máscara de subred.
- Calcular la cantidad de subredes y hosts disponibles.
- Identificar dirección de red, broadcast y rango de IP asignables.
- Diseñar una red institucional utilizando subredes de igual tamaño.

## 2. Fundamentos teóricos

### 2.1. Direccionamiento IPv4 por clases

| Clase | Rango del primer octeto | Máscara por defecto | CIDR |
|---|---|---|---|
| A | 1–126 | 255.0.0.0 | /8 |
| B | 128–191 | 255.255.0.0 | /16 |
| C | 192–223 | 255.255.255.0 | /24 |

### 2.2. Concepto de FLSM

FLSM (Fixed Length Subnet Mask) consiste en dividir una red en varias subredes utilizando la misma máscara de subred.

Características:

- Todas las subredes tienen el mismo tamaño.
- Todas utilizan la misma máscara.
- Todas disponen de la misma cantidad de hosts utilizables.
- La cantidad de direcciones asignadas por subred es constante.

### 2.3. Fórmulas

Cantidad de subredes:

\[
N_s=2^n
\]

Cantidad de hosts utilizables:

\[
N_h=2^h-2
\]

Nuevo prefijo:

\[
P_{nuevo}=P_{original}+n
\]

Bits disponibles para hosts:

\[
h=32-P_{nuevo}
\]

Donde:
- `n`: bits prestados.
- `h`: bits restantes para hosts.

## 3. Ejercicios resueltos

### Ejercicio 01: Red clase C

Dividir la siguiente red en 4 subredes iguales:

```text
192.168.10.0/24
```

**Paso 1. Calcular los bits prestados**

\[
2^n=4
\]

\[
n=2
\]

**Paso 2. Calcular el nuevo prefijo**

\[
P=24+2=26
\]

**Paso 3. Determinar la máscara**

```text
255.255.255.192
```

**Paso 4. Calcular los hosts**

\[
h=32-26=6
\]

\[
N_h=2^6-2=62
\]

**Paso 5. Determinar las subredes**

El incremento es:

\[
256-192=64
\]

| Subred | Red | Primera IP | Última IP | Broadcast |
|---|---|---|---|---|
| 1 | 192.168.10.0 | .1 | .62 | .63 |
| 2 | 192.168.10.64 | .65 | .126 | .127 |
| 3 | 192.168.10.128 | .129 | .190 | .191 |
| 4 | 192.168.10.192 | .193 | .254 | .255 |

**Resultado:** 4 subredes con 62 hosts utilizables cada una.

### Ejercicio 02: Red clase B

Dividir la siguiente red en 16 subredes iguales:

```text
172.16.0.0/16
```

**Paso 1. Bits prestados**

\[
2^4=16
\]

**Paso 2. Nuevo prefijo**

\[
P=16+4=20
\]

**Paso 3. Nueva máscara**

```text
255.255.240.0
```

**Paso 4. Hosts disponibles**

\[
h=32-20=12
\]

\[
N_h=2^{12}-2=4094
\]

**Paso 5. Incremento**

\[
256-240=16
\]

Primeras cuatro subredes:

| Subred | Red | Primera IP | Última IP | Broadcast |
|---|---|---|---|---|
| 1 | 172.16.0.0 | 172.16.0.1 | 172.16.15.254 | 172.16.15.255 |
| 2 | 172.16.16.0 | 172.16.16.1 | 172.16.31.254 | 172.16.31.255 |
| 3 | 172.16.32.0 | 172.16.32.1 | 172.16.47.254 | 172.16.47.255 |
| 4 | 172.16.48.0 | 172.16.48.1 | 172.16.63.254 | 172.16.63.255 |

**Resultado:** 16 subredes con 4094 hosts utilizables cada una.

### Ejercicio 03: Red clase A

Dividir la siguiente red en 64 subredes iguales:

```text
10.0.0.0/8
```

**Paso 1. Bits prestados**

\[
2^6=64
\]

**Paso 2. Nuevo prefijo**

\[
P=8+6=14
\]

**Paso 3. Nueva máscara**

```text
255.252.0.0
```

**Paso 4. Hosts disponibles**

\[
h=32-14=18
\]

\[
N_h=2^{18}-2=262142
\]

**Paso 5. Incremento**

\[
256-252=4
\]

Primeras cuatro subredes:

| Subred | Dirección de red | Primera IP | Última IP | Broadcast |
|---|---|---|---|---|
| 1 | 10.0.0.0 | 10.0.0.1 | 10.3.255.254 | 10.3.255.255 |
| 2 | 10.4.0.0 | 10.4.0.1 | 10.7.255.254 | 10.7.255.255 |
| 3 | 10.8.0.0 | 10.8.0.1 | 10.11.255.254 | 10.11.255.255 |
| 4 | 10.12.0.0 | 10.12.0.1 | 10.15.255.254 | 10.15.255.255 |

**Resultado:** 64 subredes con 262142 hosts utilizables cada una.

---

## 4. Ejercicios propuestos

Resolver mostrando todos los procedimientos.

### Ejercicio 04: Clase C

Dada la red:

```text
192.168.20.0/24
```

Dividirla en 8 subredes iguales.

Determinar:
1. Bits prestados.
2. Nuevo prefijo CIDR.
3. Máscara decimal.
4. Cantidad de hosts utilizables por subred.
5. Dirección de red de las 8 subredes.
6. Primera IP, última IP y broadcast de cada subred.

### Ejercicio 05: Clase C

Dada la red:

```text
192.168.50.0/24
```

Se necesita crear 4 subredes iguales.

Determinar:
1. Nueva máscara.
2. Cantidad de subredes.
3. Cantidad de hosts disponibles por subred.
4. Tabla completa de direccionamiento.

### Ejercicio 06: Clase B

Dada la red:

```text
172.20.0.0/16
```

Dividirla en 32 subredes iguales.

Determinar:
1. Bits prestados.
2. Nuevo prefijo.
3. Máscara decimal.
4. Hosts utilizables por subred.
5. Direcciones de red de las primeras 8 subredes.

### Ejercicio 07: Clase A

Dada la red:

```text
10.0.0.0/8
```

Dividirla en 128 subredes iguales.

Determinar:
1. Bits prestados.
2. Nuevo prefijo.
3. Máscara decimal.
4. Hosts utilizables por subred.
5. Direcciones de red de las primeras 8 subredes.

### Ejercicio 08: Identificación de subred

Dada la dirección:

```text
192.168.15.130/26
```

Determinar:
1. Máscara decimal.
2. Dirección de red.
3. Dirección broadcast.
4. Primera IP utilizable.
5. Última IP utilizable.
6. Cantidad de hosts utilizables.

---

## 5. Trabajo de laboratorio: Diseño de una red institucional con FLSM

### 5.1. Situación problemática

Una institución educativa dispone de la siguiente red:

```text
192.168.100.0/24
```

Necesita implementar cinco redes independientes:

| Área | Cantidad de dispositivos |
|---|---:|
| Laboratorio de informática | 20 |
| Administración | 20 |
| Docentes | 20 |
| Biblioteca | 20 |
| Servidores | 20 |

El administrador de red ha establecido que todas las áreas deben utilizar subredes del mismo tamaño.

**Restricción:** utilizar exclusivamente FLSM. No se permite utilizar máscaras diferentes entre las subredes.

### 5.2. Actividades

**Actividad 1. Cálculo de subnetting**

Determinar:

- Cantidad mínima de subredes necesarias.
- Bits que se deben prestar.
- Nuevo prefijo CIDR.
- Máscara decimal.
- Cantidad de hosts utilizables por subred.

**Actividad 2. Tabla de direccionamiento**

Completar:

| Área | Dirección de red | Máscara | Primera IP | Última IP | Broadcast |
|---|---|---|---|---|---|
| Laboratorio | | | | | |
| Administración | | | | | |
| Docentes | | | | | |
| Biblioteca | | | | | |
| Servidores | | | | | |

**Actividad 3. Implementación en Cisco Packet Tracer**

Diseñar una topología que contenga:

- 1 router principal.
- 5 switches.
- 5 redes LAN independientes.
- 2 computadoras por cada LAN como mínimo.

Cada LAN deberá tener su propia subred.

Configurar:
- Direcciones IP de las computadoras.
- Máscaras de subred.
- Puertas de enlace.
- Interfaces del router.

**Actividad 4. Pruebas de conectividad**

Ejecutar:

```bash
ipconfig
ping DIRECCION_IP
```

Comprobar:

1. Comunicación entre equipos de una misma LAN.
2. Comunicación entre equipos de diferentes LAN.
3. Comunicación con la puerta de enlace.
4. Correcta configuración de las máscaras.

### 5.3. Entregables

1. Archivo README.md con los cálculos.
2. Tabla completa de direccionamiento.
3. Archivo de simulación `.pkt`.
4. Capturas de pantalla de la topología.
5. Evidencias de pruebas de conectividad.

---

## 6. Preguntas de comprensión

**Pregunta 1.** ¿Qué es FLSM y cuáles son sus principales características en comparación con un diseño de red que utiliza máscaras de diferentes longitudes?

**Pregunta 2.** Si se prestan 3 bits de la parte de host de una red, ¿cuántas subredes se pueden crear? Explicar el procedimiento matemático.

**Pregunta 3.** ¿Qué sucede con la cantidad de hosts disponibles cuando se incrementa el prefijo CIDR de una red? Presentar un ejemplo utilizando una red /24 y una /26.

**Pregunta 4.** ¿Por qué todas las subredes de una implementación FLSM deben utilizar la misma máscara? ¿Qué ventaja y qué desventaja presenta esta estrategia para administrar una red institucional?

---

## 7. Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Resolución de ejercicios de clase A, B y C | 5 puntos |
| Cálculos y tabla de direccionamiento del laboratorio | 5 puntos |
| Implementación en Cisco Packet Tracer | 4 puntos |
| Pruebas de conectividad | 2 puntos |
| Respuestas a las cuatro preguntas | 2 puntos |
| Organización y presentación del README | 2 puntos |
| **TOTAL** | **20 puntos** |

## 8. Reflexión final

FLSM permite organizar una red mediante subredes de tamaño uniforme. Aunque puede generar desperdicio de direcciones IP cuando las áreas tienen diferentes necesidades, facilita la planificación, configuración y administración del direccionamiento IPv4.
