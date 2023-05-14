\c postgres

DROP DATABASE IF EXISTS project;

CREATE DATABASE project;

\c project;

START TRANSACTION;

CREATE TABLE air_quality (
        id integer NOT NULL PRIMARY KEY,
        year integer,
        month integer,
        day integer,
        hour integer,
        "pm2.5" real,
        PM10 real,
        SO2 real,
        NO2 real,
        CO real,
        O3 real,
        TEMP real,
        PRES real,
        DEWP real,
        RAIN real,
        wd VARCHAR(4),
        WSPM real,
        station VARCHAR(50)
);

SET datestyle TO iso, ymd;

\COPY air_quality FROM '../data/project_tb.csv' DELIMITER ',' CSV HEADER NULL AS '';

COMMIT;

SELECT * FROM air_quality;
