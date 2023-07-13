/*1. ¿Qué consulta harías para obtener todos los países que hablan esloveno? 
Tu consulta debe devolver el nombre del país, el idioma y el porcentaje de idioma. 
Tu consulta debe organizar el resultado por porcentaje de idioma en orden descendente. (1)*/

SELECT countries.name AS pais, languages.language AS idioma, languages.percentage AS porcentaje  FROM countries
/*Integrar otra tabla basados en algun parametro*/
JOIN languages ON countries.id = languages.country_id
WHERE languages.language ="Slovene"
ORDER BY porcentaje DESC;

/*2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades para cada país? 
Su consulta debe devolver el nombre del país y el número total de ciudades. 
Tu consulta debe organizar el resultado por el número de ciudades en orden descendente. (3)*/

SELECT ct.name AS pais, count(cities.id) as ciudades FROM countries ct
JOIN cities ON ct.id = cities.country_id
GROUP BY ct.id
ORDER BY count(cities.id) DESC;

/*3. ¿Qué consulta harías para obtener todas las ciudades de México con una población de más de 500,000? 
Tu consulta debe organizar el resultado por población en orden descendente. (1)*/

/*4. ¿Qué consulta ejecutarías para obtener todos los idiomas en cada país con un porcentaje superior al 89%? 
Tu consulta debe organizar el resultado por porcentaje en orden descendente. (1)*/

/*5. ¿Qué consulta haría para obtener todos los países con un área de superficie inferior a 501 y una población superior a 100,000? (2)*/

/*6. ¿Qué consulta harías para obtener países con solo Monarquía Constitucional con un capital superior a 200
 y una esperanza de vida superior a 75 años? (1)*/

/*7. ¿Qué consulta harías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y tener una 
población superior a 500,000? La consulta debe devolver el nombre del país, el nombre de la ciudad, el distrito y la población. (2)*/

SELECT countries.name AS pais, cities.name as city, cities.district as distric , cities.population as population FROM cities
JOIN countries ON cities.country_id=countries.id
WHERE cities.country_code="ARG" AND cities.district="Buenos Aires"
AND cities.population > 500000
;

/*8. ¿Qué consulta harías para resumir el número de países en cada región?
 La consulta debe mostrar el nombre de la región y el número de países. 
 Además, la consulta debe organizar el resultado por el número de países en orden descendente. (2)*/