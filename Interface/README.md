## Java interface

Laatikoihin talletetaan erilaisia esineitä. Kaikkien laatikoihin talletettavien esineiden on toteutettava rajapinta `Talletettava`. Rajapinta `Talletettava` määrittelee metodin `paino()`, joka palauttaa double-tyyppisen muuttujan.

- Luokat Kirja ja CDLevy toteuttavat rajapinnan Talletettava. 
- Luokan Laatikko sisälle voidaan tallettaa Talletettava-rajapinnan toteuttavia tavaroita. Laatikolle asetetaan maksimikapasiteetti kiloina. Laatikkoon ei voi lisätä enempää tavaraa kuin sen maksimikapasiteetti määrää.
- Myös Laatikko toteuttaa rajapinnan Talletettava. Esimerkiksi pienempi laatikko voidaan siis tallettaa isomman laatikon sisälle.  


