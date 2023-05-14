DROP DATABASE IF EXISTS projectdb CASCADE;

CREATE DATABASE projectdb;
USE projectdb;

SET mapreduce.map.output.compress = true;
SET mapreduce.map.output.compress.codec = org.apache.hadoop.io.compress.SnappyCodec;

CREATE EXTERNAL TABLE air_quality STORED AS AVRO LOCATION '../air_quality' TBLPROPERTIES ('avro.schema.url'='../avsc/air_quality.avsc');

SELECT * FROM ait_quality LIMIT 10;
