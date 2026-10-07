# Trabajo Final — Administración y Seguridad de Servicios de Red

## Curso

**Redes y Comunicación de Datos**

## Trabajo Final Integrador

### Administración, Seguridad y Monitoreo de Servicios de Red

---

## 1. Descripción

En el examen parcial se implementó un servidor de red utilizando diferentes protocolos de comunicación.

Para el **Trabajo Final**, cada grupo asumirá el rol de un **equipo de administradores de redes y seguridad**, responsable de evaluar, proteger, monitorear y mantener el servicio implementado anteriormente.

El objetivo no es solamente demostrar que el servidor funciona, sino demostrar que el equipo es capaz de:

* Administrar un servicio de red.
* Identificar vulnerabilidades.
* Analizar el tráfico de red.
* Aplicar mecanismos de seguridad.
* Configurar controles de acceso.
* Implementar reglas de firewall.
* Analizar registros (*logs*).
* Detectar actividades sospechosas.
* Responder ante incidentes.
* Proponer mejoras de seguridad.
* Documentar técnicamente las decisiones tomadas.

> **Importante:** Todas las pruebas de seguridad y ataques deben realizarse únicamente dentro de la red de laboratorio proporcionada para el curso. No está permitido atacar sistemas, redes o servicios externos.

---

# 2. Servidores asignados

Cada grupo continuará trabajando con el protocolo utilizado durante el examen parcial.

| Grupo       | Servicio | Puerto | Tema principal                                      |
| ----------- | -------- | -----: | --------------------------------------------------- |
| **Grupo 1** | IRC      |   6667 | Seguridad y administración de comunicaciones        |
| **Grupo 2** | HTTP     |     80 | Seguridad de servidores web                         |
| **Grupo 3** | DNS      |     53 | Seguridad y administración de resolución de nombres |
| **Grupo 4** | FTP      |     21 | Control de acceso y transferencia segura            |
| **Grupo 5** | DHCP     |     68 | Administración y seguridad de asignación IP         |
| **Grupo 6** | SSH      |     22 | Administración remota segura                        |
| **Grupo 7** | TELNET   |     23 | Análisis de protocolo inseguro y migración          |
| **Grupo 8** | SMTP     |     25 | Seguridad y administración de correo                |

El servidor implementado durante el examen parcial será considerado el **punto de partida** del trabajo final.

---

# 3. Objetivo general

Implementar y administrar de manera segura un servicio de red, aplicando técnicas de **hardening, control de acceso, firewall, monitoreo, análisis de tráfico, auditoría y respuesta ante incidentes de seguridad**.

---

# 4. Objetivos específicos

Al finalizar el trabajo, el grupo deberá ser capaz de:

1. Verificar el funcionamiento del servicio.
2. Identificar puertos y servicios expuestos.
3. Analizar la configuración actual del servidor.
4. Identificar riesgos y vulnerabilidades.
5. Aplicar medidas de hardening.
6. Configurar reglas de firewall.
7. Implementar mecanismos de control de acceso.
8. Analizar el tráfico utilizando herramientas de captura.
9. Analizar registros del sistema.
10. Detectar actividades sospechosas.
11. Realizar pruebas de seguridad controladas.
12. Aplicar medidas de mitigación.
13. Verificar que el servicio continúe funcionando después de las modificaciones.
14. Documentar todas las actividades realizadas.

---

# 5. Escenario

Cada grupo forma parte del equipo de administración de redes de una organización.

La organización ya posee un servidor funcionando, pero una auditoría inicial ha identificado que existen posibles problemas de seguridad.

El equipo de administradores deberá realizar una **auditoría técnica** y posteriormente aplicar las medidas necesarias para proteger el servicio.

El trabajo deberá demostrar el siguiente proceso:

```text
SERVIDOR EXISTENTE
        │
        ▼
AUDITORÍA
        │
        ▼
IDENTIFICACIÓN DE RIESGOS
        │
        ▼
HARDENING
        │
        ▼
FIREWALL
        │
        ▼
CONTROL DE ACCESO
        │
        ▼
MONITOREO
        │
        ▼
PRUEBAS DE SEGURIDAD
        │
        ▼
DETECCIÓN DE INCIDENTES
        │
        ▼
MITIGACIÓN
        │
        ▼
VERIFICACIÓN
        │
        ▼
DOCUMENTACIÓN FINAL
```

---

# 6. Parte I — Inventario y reconocimiento

El grupo deberá realizar un inventario técnico del servidor.

Como mínimo deberá determinar:

* Dirección IP.
* Nombre del servidor.
* Sistema operativo.
* Versión del sistema operativo.
* Servicios activos.
* Puertos abiertos.
* Procesos relacionados con el servicio.
* Usuarios relacionados con el servicio.
* Archivos de configuración.
* Ubicación de los archivos de logs.
* Dependencias utilizadas.

### Herramientas sugeridas

```bash
ip a
ss -tulpn
ps aux
systemctl
lsof
hostnamectl
```

También puede utilizarse:

```bash
nmap
```

### Evidencias

Se deberá incluir:

* Capturas de pantalla.
* Comandos utilizados.
* Resultados obtenidos.
* Interpretación de los resultados.

---

# 7. Parte II — Auditoría de seguridad

El grupo deberá realizar una evaluación de seguridad del servicio.

Debe responder preguntas como:

* ¿Qué puertos están expuestos?
* ¿Son necesarios todos los puertos?
* ¿Quién puede acceder al servicio?
* ¿Existen usuarios innecesarios?
* ¿Existen configuraciones inseguras?
* ¿Se utilizan contraseñas?
* ¿La comunicación está cifrada?
* ¿Se expone información innecesaria?
* ¿Existen permisos excesivos?
* ¿El servicio genera logs?
* ¿Dónde se almacenan?
* ¿Qué ocurre si un usuario intenta acceder incorrectamente?

El grupo deberá elaborar una tabla de riesgos.

### Ejemplo

| Riesgo                     | Probabilidad | Impacto | Nivel   | Recomendación                   |
| -------------------------- | ------------ | ------- | ------- | ------------------------------- |
| Puerto innecesario abierto | Media        | Alto    | Alto    | Bloquear mediante firewall      |
| Contraseña débil           | Alta         | Alto    | Crítico | Aplicar política de contraseñas |
| Servicio sin cifrado       | Alta         | Alto    | Crítico | Utilizar alternativa segura     |
| Logs insuficientes         | Media        | Medio   | Medio   | Activar auditoría               |

---

# 8. Parte III — Hardening del servidor

El grupo deberá aplicar medidas de **endurecimiento de seguridad**.

Como mínimo deberá considerar:

### Sistema operativo

* Actualización del sistema.
* Eliminación de servicios innecesarios.
* Revisión de usuarios.
* Revisión de grupos.
* Revisión de permisos.
* Política de contraseñas.
* Protección de archivos de configuración.

### Servicio de red

* Configuración segura.
* Restricción de usuarios.
* Restricción de direcciones IP cuando corresponda.
* Deshabilitación de funcionalidades innecesarias.
* Protección de archivos y directorios.
* Registro de actividades.

### Principio fundamental

> **El servidor debe exponer únicamente lo que realmente necesita para cumplir su función.**

---

# 9. Parte IV — Firewall

El grupo deberá implementar reglas de firewall.

Se pueden utilizar herramientas como:

```text
UFW
iptables
nftables
```

La política deberá seguir el principio:

> **Deny by default / Permitir explícitamente lo necesario**

Por ejemplo:

```text
                 ┌───────────────┐
Internet ───────►│   FIREWALL    │
                 └───────┬───────┘
                         │
               ┌─────────┴─────────┐
               │                   │
          Puerto permitido     Puerto bloqueado
               │                   │
               ▼                   X
           SERVICIO
```

El grupo deberá demostrar:

* Conexión permitida.
* Conexión bloqueada.
* Regla utilizada.
* Justificación de la regla.

---

# 10. Parte V — Análisis de tráfico

Se deberá utilizar una herramienta de análisis de tráfico, preferentemente:

```text
Wireshark
```

El grupo deberá capturar tráfico relacionado con su protocolo.

Deberá identificar:

* IP origen.
* IP destino.
* Puerto origen.
* Puerto destino.
* Protocolo.
* Información intercambiada.
* Paquetes relevantes.
* Posible información sensible.

---

# 11. Parte VI — Comunicación segura

El grupo deberá determinar si el protocolo utilizado permite una comunicación segura.

Se deberá responder:

> ¿Qué información podría obtener un atacante si captura el tráfico?

Cuando sea aplicable, se deberá comparar el protocolo original con una alternativa segura.

### Ejemplos

```text
TELNET :23
      ↓
SSH :22
```

```text
HTTP :80
      ↓
HTTPS :443
```

```text
FTP :21
      ↓
FTPS / SFTP
```

El grupo deberá justificar técnicamente la alternativa propuesta.

---

# 12. Parte VII — Prueba de seguridad controlada

Cada grupo deberá realizar pruebas de seguridad **únicamente contra los servidores del laboratorio**.

El objetivo es demostrar que las medidas de seguridad implementadas son efectivas.

Se pueden realizar actividades como:

* Reconocimiento de puertos.
* Identificación de servicios.
* Intentos controlados de acceso.
* Comprobación de permisos.
* Análisis de tráfico.
* Comprobación de reglas de firewall.
* Revisión de logs.
* Pruebas de disponibilidad bajo condiciones controladas.

### Regla fundamental

> **No se permite realizar ataques contra servidores, sitios web, redes o sistemas que no pertenezcan al laboratorio del curso.**

No se deberán realizar pruebas contra:

* Google.
* Facebook.
* Instagram.
* Servidores institucionales.
* Servidores de terceros.
* Redes Wi-Fi ajenas.
* Servicios públicos de Internet.

---

# 13. Parte VIII — Detección de un incidente

El grupo deberá plantear un escenario de incidente.

Por ejemplo:

```text
Un usuario informa que existen múltiples
intentos de acceso al servidor.
```

El equipo deberá investigar:

1. ¿Qué ocurrió?
2. ¿Cuándo ocurrió?
3. ¿Cuál fue la IP origen?
4. ¿Qué puerto fue atacado?
5. ¿Qué servicio fue afectado?
6. ¿Qué usuario fue utilizado?
7. ¿Existen evidencias en los logs?
8. ¿Cuál fue el impacto?
9. ¿Qué medida de contención se aplicó?
10. ¿Cómo evitar que vuelva a ocurrir?

---

# 14. Parte IX — Logs y auditoría

El grupo deberá identificar los registros generados por:

* Sistema operativo.
* Servicio de red.
* Firewall.
* Autenticación.
* Aplicaciones relacionadas.

Deberá mostrar ejemplos reales de logs y explicar qué información contienen.

Como mínimo se deberá identificar:

```text
Fecha
Hora
IP origen
IP destino
Usuario
Servicio
Acción
Resultado
```

---

# 15. Parte X — Monitoreo

El grupo deberá establecer mecanismos para comprobar el estado del servidor.

Se deberá monitorear, como mínimo:

* Disponibilidad.
* CPU.
* Memoria.
* Disco.
* Procesos.
* Conexiones.
* Puertos.
* Estado del servicio.

Ejemplos:

```bash
top
htop
free
df
ps
ss
systemctl status
```

El grupo deberá establecer qué indicadores utilizaría para determinar si el servidor está funcionando correctamente.

---

# 16. Parte XI — Respuesta ante incidentes

Ante un incidente de seguridad, el grupo deberá plantear un procedimiento.

Se recomienda utilizar el siguiente modelo:

```text
1. IDENTIFICAR
       ↓
2. ANALIZAR
       ↓
3. CONTENER
       ↓
4. ERRADICAR
       ↓
5. RECUPERAR
       ↓
6. DOCUMENTAR
       ↓
7. PREVENIR
```

El grupo deberá aplicar este procedimiento a un incidente relacionado con su servidor.

---

# 17. Requerimientos específicos por grupo

Además de las actividades generales, cada grupo deberá realizar una actividad específica.

## Grupo 1 — IRC :6667

### Reto

**Seguridad y administración de un servidor IRC**

Investigar y demostrar:

* Control de usuarios.
* Control de canales.
* Autenticación.
* Registro de conexiones.
* Control de acceso.
* Problemas de flooding.
* Disponibilidad del servicio.
* Alternativas de comunicación segura.

---

## Grupo 2 — HTTP :80

### Reto

**Auditoría y hardening de un servidor web**

Investigar y demostrar:

* Puertos abiertos.
* Información expuesta por el servidor.
* Métodos HTTP.
* Directorios expuestos.
* Permisos.
* Logs.
* Control de acceso.
* HTTP vs HTTPS.
* Headers de seguridad.

---

## Grupo 3 — DNS :53

### Reto

**Administración y seguridad de DNS**

Investigar y demostrar:

* Consultas DNS.
* Resolución directa.
* Resolución inversa.
* Caché.
* Recursividad.
* Transferencias de zona.
* Control de consultas.
* Riesgos de DNS abierto.
* Medidas de protección.

---

## Grupo 4 — FTP :21

### Reto

**Seguridad de transferencia de archivos**

Investigar y demostrar:

* Usuarios.
* Permisos.
* Directorios.
* Acceso anónimo.
* Logs.
* Captura de credenciales.
* Riesgos de FTP sin cifrado.
* Alternativas seguras.

---

## Grupo 5 — DHCP :68

### Reto

**Administración y seguridad de DHCP**

Investigar y demostrar:

* Asignación de direcciones.
* Reservas DHCP.
* Configuración de gateway.
* DNS.
* Tiempo de concesión.
* Logs.
* DHCP no autorizado (*Rogue DHCP*).
* Medidas de protección.

---

## Grupo 6 — SSH :22

### Reto

**Administración remota segura**

Investigar y demostrar:

* Usuarios.
* Autenticación.
* Claves SSH.
* Acceso de root.
* Contraseñas.
* Control de acceso.
* Logs.
* Firewall.
* Protección frente a intentos repetitivos de autenticación.

---

## Grupo 7 — TELNET :23

### Reto

**Análisis de un protocolo inseguro y migración**

Demostrar:

* Funcionamiento de TELNET.
* Captura del tráfico.
* Riesgos de seguridad.
* Exposición de credenciales.
* Análisis con Wireshark.
* Comparación TELNET vs SSH.
* Propuesta de migración.

---

## Grupo 8 — SMTP :25

### Reto

**Administración y seguridad de correo**

Investigar y demostrar:

* Funcionamiento de SMTP.
* Usuarios.
* Autenticación.
* Logs.
* Control de relay.
* Riesgo de Open Relay.
* Cifrado.
* Medidas contra uso indebido del servidor.

---

# 18. Entregables

Cada grupo deberá entregar:

## 18.1 Repositorio Git

El repositorio deberá contener:

```text
trabajo-final-redes/
│
├── README.md
│
├── docs/
│   ├── informe.pdf
│   ├── arquitectura.png
│   └── topologia.png
│
├── configuracion/
│   ├── firewall/
│   ├── servidor/
│   └── seguridad/
│
├── evidencias/
│   ├── auditoria/
│   ├── wireshark/
│   ├── firewall/
│   ├── logs/
│   └── pruebas/
│
└── scripts/
    └── ...
```

---

# 19. Informe técnico

El informe deberá contener como mínimo:

## 1. Portada

* Universidad.
* Curso.
* Trabajo final.
* Integrantes.
* Docente.
* Grupo.
* Fecha.

## 2. Introducción

Presentación del problema.

## 3. Objetivos

Objetivo general y objetivos específicos.

## 4. Arquitectura de red

Diagrama de la infraestructura.

## 5. Implementación inicial

Descripción del servidor desarrollado en el examen parcial.

## 6. Auditoría de seguridad

Resultados encontrados.

## 7. Vulnerabilidades y riesgos

Tabla de riesgos.

## 8. Hardening

Medidas aplicadas.

## 9. Firewall

Reglas implementadas.

## 10. Análisis de tráfico

Resultados de Wireshark.

## 11. Pruebas de seguridad

Pruebas realizadas y resultados.

## 12. Monitoreo y logs

Mecanismos implementados.

## 13. Incidente de seguridad

Descripción, análisis y respuesta.

## 14. Mejoras propuestas

Mejoras futuras.

## 15. Conclusiones

Conclusiones técnicas del trabajo.

## 16. Referencias

Documentación técnica consultada.

---

# 20. Presentación y demostración

Cada grupo deberá realizar una demostración práctica.

La exposición deberá incluir:

### 1. Arquitectura

Mostrar la topología.

### 2. Servicio

Demostrar que el servicio funciona.

### 3. Vulnerabilidad

Mostrar al menos un riesgo identificado.

### 4. Protección

Demostrar la solución aplicada.

### 5. Firewall

Mostrar las reglas implementadas.

### 6. Monitoreo

Mostrar el estado del servidor.

### 7. Logs

Mostrar evidencias de actividad.

### 8. Análisis de tráfico

Mostrar una captura realizada con Wireshark.

### 9. Incidente

Explicar el incidente simulado.

### 10. Respuesta

Demostrar cómo fue mitigado.

---

# 21. Evidencias

Las capturas de pantalla deben ser **evidencias técnicas**, no simplemente capturas decorativas.

Cada evidencia debe incluir:

```text
¿Qué se está demostrando?
¿Qué comando se utilizó?
¿Qué resultado se obtuvo?
¿Qué significa el resultado?
```

### Ejemplo

```text
Evidencia: Regla de firewall

Comando:
sudo ufw status numbered

Resultado:
22/tcp ALLOW desde 192.168.10.0/24
80/tcp ALLOW desde cualquier origen

Interpretación:
SSH solamente está disponible para la red
administrativa, mientras que HTTP permanece
disponible para los usuarios.
```

---

# 22. Tecnologías sugeridas

Los grupos pueden utilizar:

### Sistema operativo

```text
GNU/Linux
```

### Análisis

```text
Nmap
Wireshark
ss
lsof
netstat
```

### Seguridad

```text
UFW
iptables
nftables
Fail2ban
```

### Monitoreo

```text
top
htop
free
df
systemctl
journalctl
```

El uso de herramientas adicionales está permitido siempre que el grupo pueda explicar técnicamente su funcionamiento.

---

# 23. Reglas de seguridad del laboratorio

Las actividades de seguridad deberán realizarse exclusivamente dentro del entorno de laboratorio.

Está prohibido:

* Atacar sistemas externos.
* Escanear redes públicas sin autorización.
* Intentar acceder a cuentas de terceros.
* Capturar tráfico de usuarios que no participan en el laboratorio.
* Realizar ataques de denegación de servicio contra sistemas externos.
* Obtener o utilizar credenciales reales.
* Interrumpir servicios institucionales.

El objetivo del trabajo es **aprender administración y seguridad de redes**, no comprometer sistemas reales.

---

# 24. Criterios de evaluación

| Criterio                                     |     Peso |
| -------------------------------------------- | -------: |
| Implementación y funcionamiento del servicio |      10% |
| Auditoría y análisis de vulnerabilidades     |      15% |
| Hardening y configuración segura             |      15% |
| Firewall y control de acceso                 |      15% |
| Análisis de tráfico con Wireshark            |      10% |
| Logs, monitoreo y auditoría                  |      10% |
| Pruebas de seguridad controladas             |      10% |
| Respuesta ante incidentes                    |       5% |
| Documentación técnica                        |       5% |
| Presentación y demostración                  |       5% |
| **TOTAL**                                    | **100%** |

---

# 25. Criterio fundamental de evaluación

No se evaluará solamente si el servidor funciona.

Se evaluará principalmente si el estudiante puede responder:

> **¿Cómo sé que mi servidor es seguro?**

Y debe demostrarlo mediante evidencias.

El estudiante deberá ser capaz de explicar:

```text
¿Qué tengo?
     ↓
¿Qué está expuesto?
     ↓
¿Qué riesgos existen?
     ↓
¿Cómo puedo protegerlo?
     ↓
¿Cómo sé que está protegido?
     ↓
¿Cómo detecto un ataque?
     ↓
¿Qué hago si ocurre un incidente?
```

---

# 26. Resultado esperado

Al finalizar el trabajo, cada grupo deberá presentar un servicio que no solamente funcione, sino que pueda ser **administrado, monitoreado, auditado y protegido**.

El resultado final deberá representar el trabajo de un verdadero:

## 👨‍💻 Administrador de Redes

con capacidad para:

```text
IMPLEMENTAR
     +
ADMINISTRAR
     +
PROTEGER
     +
MONITOREAR
     +
ANALIZAR
     +
RESPONDER
```

---

# 27. Pregunta final de reflexión

Cada grupo deberá responder en sus conclusiones:

> **Si este servidor fuera utilizado realmente por una organización, ¿qué riesgos de seguridad permanecerían después de nuestro trabajo y qué medidas implementaríamos en una siguiente etapa?**

La respuesta debe estar sustentada técnicamente y no limitarse a indicar que "el servidor quedó seguro".

---

## 28. Mensaje final

> **Un administrador de redes no solamente hace que los servicios funcionen.**
>
> **Debe garantizar que funcionen de manera segura, controlada, monitoreada y disponible.**
>
> **El objetivo de este trabajo es pasar de implementar servicios a administrarlos profesionalmente.**
