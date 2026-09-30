# Laboratorio 04 

## Complemento : Comunicación emisor/receptor y cifrado de mensajes en Java

## Etapas:
1. Comunicación sin cifrado
  - Emisor → Receptor
  - Envío de mensaje mediante sockets.
  - Visualización del mensaje original.
2. Comunicación cifrada
  - Emisor cifra el mensaje.
  - Envía el texto cifrado.
  - Receptor descifra.
  - Se muestra:
    - mensaje original
    - mensaje cifrado
    - mensaje recuperado

Java proporciona la clase javax.crypto.Cipher para realizar cifrado y descifrado, permitiendo especificar transformaciones como algoritmo/modo/padding.

```bash
┌──────────────────────────────┐
│ Docker Network               │
│                              │
│ ┌────────────────┐           │
│ │ Container 1    │           │
│ │                │           │
│ │ Emisor.java    │           │
│ └───────┬────────┘           │
│         │                    │
│         │ TCP                │
│         │ mensaje cifrado    │
│         ▼                    │
│ ┌────────────────┐           │
│ │ Container 2    │           │
│ │                │           │
│ │ Receptor.java  │           │
│ └────────────────┘           │
│                              │
└──────────────────────────────┘
             ▲
             │
         Wireshark
```

```bash
PARTE 1
Socket Java
    │
    ├── Emisor ───────────────► Receptor
    │       "Hola mundo"
    │
    └──────── Wireshark ─────────┘
             ↓
       mensaje visible
```

```bash
PARTE 2
Socket Java + Cifrado
    │
    ├── Emisor
    │      "Hola mundo"
    │          ↓
    │       AES-GCM
    │          ↓
    │      "A8F92C..."
    │
    └──────────────► Receptor
                         ↓
                     AES-GCM
                         ↓
                   "Hola mundo"

             Wireshark
                 ↓
          mensaje NO visible
```

## Prueba
```bash
Mensaje original
       ↓
     CIFRAR
       ↓
   8FA29B...
       ↓
   modificar
       ↓
   8FA2AB...
       ↓
    RECEPTOR
       ↓
  ERROR DE AUTENTICACIÓN
```

### Prueba A — Texto plano
- Enviar: Este mensaje contiene información confidencial.
- Capturar con Wireshark.
- Los estudiantes deben buscar el contenido del mensaje.
## Prueba B — AES-GCM
- Enviar exactamente: Este mensaje contiene información confidencial.
- pero cifrado. Después buscar nuevamente el texto: Este mensaje contiene información confidencial en Wireshark.

## Informe

### 1. Comunicación en texto plano

Captura de pantalla de Wireshark.

### 2. Comunicación AES-GCM

Captura del emisor.

Captura del receptor.

Captura de Wireshark.

### 3. Comunicación AES-CBC

Capturas correspondientes.

### 4. Comunicación RSA-OAEP

Capturas correspondientes.

### 5. Comparación

Tabla comparativa de los algoritmos.

### 6. Análisis de Wireshark

¿Qué información puede observarse?

¿Qué información deja de ser visible cuando se utiliza cifrado?

### 7. Prueba de modificación

¿Qué ocurre cuando se modifica un mensaje cifrado?

## Entregables
```bash
lab04/
├── README.md
├── src/
│   ├── Ejemplo1Emisor.java   (Envía sin cifrar)
│   ├── Ejemplo1Receptor.java
│   ├── Ejemplo2Emisor.java   (Envía con cifrado)
│   ├── Ejemplo2Receptor.java
│   ├── ...
│   └── ...
└── ...
```

### 8. Conclusiones

Cada integrante debe escribir una conclusión.

## Referencia:
- [Class Cipher](https://docs.oracle.com/en/java/javase/26/docs/api/java.base/javax/crypto/Cipher.html)
