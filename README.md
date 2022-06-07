# Trabajo Practico Nº4 de Estructuras de Datos y Algoritmos

## 📚 Enunciado

Considerando el ADT CLUB(SOCIO) definido con las siguientes operaciones:  
  
Sintaxis:  
CLUBVACIO: -> CLUB  
ALTASOCIO: CLUB x SOCIO -> CLUB  
ESTAVACIO: CLUB -> BOOL  
CANTIDAD: CLUB -> ent≥0  
ESTA: CLUB x SOCIO -> BOOL  
ULTIMOSOCIO: CLUB -> SOCIO U {indefinido}  
  
Semántica: Para todo C, D Є CLUB, s, t Є SOCIO   
  
ESTAVACIO(CLUBVACIO) ≡ TRUE  
ESTAVACIO(ALTASOCIO(C, s)) ≡ FALSE  
CANTIDAD(CLUBVACIO) ≡ 0  
CANTIDAD(ALTASOCIO(C, s)) ≡ 1 + CANTIDAD(C)  
ESTA(CLUBVACIO,s) ≡ FALSE  
ESTA(ALTASOCIO(C, s),t) ≡ i=j OR ESTA(C,t)  
ULTIMOSOCIO(CLUBVACIO) ≡ indefinido  
ULTIMOSOCIO(ALTASOCIO(C, s)) ≡ s  
  
1) Implemente en Java el ADT CLUB(SOCIO) usando lista simplemente enlazada. SOCIO debe identificarse con un entero. La implementación de la operación ESTA debe ser recursiva.  
  
2) Como usuario del ADT CLUB escriba una Función UNION que dados 2 CLUBES, devuelva otro CLUB, con todos los socios de los dados como parámetros.
  
3) Escriba un programa de prueba que construya objetos de la clase CLUB y aplique todas las operaciones especificadas, y la función del apartado d).  
  
## Construido con 🛠️

* [Java Development Kit (JDK)](https://www.java.com/es/download/help/develop.html) -  Herramientas de desarrollo para la creación de programas en Java.
* [Apache NetBeans](https://netbeans.apache.org/) - Entorno de desarrollo integrado libre

## 👨‍💻 Autor

- Luis Medina Raed