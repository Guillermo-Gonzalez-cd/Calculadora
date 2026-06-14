# Calculadora de metodos numericos

Proyecto desarrollado en Java para la asignatura de Métodos Numéricos.

# Grupo

1. Alisson Lizbeth Jalinas Martinez.
2. Andrea Lisseth Suazo Gutiérrez.
3. Erling Guillermo Saavedra González.

---

## Métodos implementados

1. Método de Bisección
2. Método de Newton-Raphson
3. Método de la Secante
4. Inversa de Matrices (Gauss-Jordan)
5. Interpolación de Newton
6. Interpolación de Lagrange

---

## Requisitos

- Java JDK 21 o superior
- Visual Studio Code (opcional)
- Biblioteca exp4j-0.4.8.jar

---

## Ejecución

1. Abrir el proyecto en Visual Studio Code.
2. Verificar que el JDK esté instalado.
3. Ejecutar el archivo Principal.java.
4. Seleccionar el método numérico deseado desde el menú principal.

---

# Guía de uso

## 1. Método de Bisección

Permite aproximar raíces de ecuaciones utilizando un intervalo inicial.

### Datos solicitados

- Función f(x)
- Límite inferior (xl)
- Límite superior (xu)
- Número de iteraciones
- Raíz verdadera (opcional)

### Salida

Tabla con:

- Iteración
- xl
- xu
- xr
- Error aproximado (%)
- Error verdadero (%)

---

## 2. Método de Newton-Raphson

Permite aproximar raíces mediante derivadas.

### Datos solicitados

- Función f(x)
- Derivada f'(x)
- Valor inicial x0
- Número de iteraciones
- Raíz verdadera

### Salida

Tabla con:

- Iteración
- xi
- Error verdadero (%)

---

## 3. Método de la Secante

Permite aproximar raíces sin necesidad de derivadas.

### Datos solicitados

- Función f(x)
- x(i-1)
- xi
- Número de iteraciones

### Salida

Tabla con:

- Iteración
- x(i-1)
- xi
- x(i+1)

---

## 4. Inversa de una Matriz

Calcula la matriz inversa mediante el método de Gauss-Jordan.

### Datos solicitados

- Orden de la matriz (2x2 o 3x3)
- Elementos de la matriz

### Salida

- Matriz inversa

---

## 5. Interpolación de Newton

Construye un polinomio interpolante utilizando diferencias divididas.

### Datos solicitados

- Cantidad de puntos
- Coordenadas (x,y)
- Valor a evaluar

### Salida

- Tabla de diferencias divididas
- Coeficientes
- Polinomio de Newton
- Polinomio desarrollado (para 3 puntos)
- Evaluación del polinomio

---

## 6. Interpolación de Lagrange

Construye un polinomio interpolante mediante los polinomios base de Lagrange.

### Datos solicitados

- Cantidad de puntos
- Coordenadas (x,y)
- Valor a evaluar

### Salida

- Polinomio de Lagrange
- Bases de Lagrange
- Evaluación del polinomio

---

## Formato de funciones

Las funciones deben escribirse utilizando la sintaxis compatible con exp4j.

### Ejemplos válidos

x^2-4
x^3-2*x-5
exp(-x)-x
sin(x)
cos(x)
log(x)

### Ejemplos inválidos

e^-x-x

### Debe escribirse:

exp(-x)-x