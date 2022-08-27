# Task 9 - crud-area
Kamis, 25 Agustus 2022

Crud data provinsi dan kota menggunakan JAVA Spring Boot.

## Arsitektur
1. Database PostgreSQL
2. SpringBoot untuk REST API

Dokumentasi API : https://documenter.getpostman.com/view/624374/VUr1HtUF

## HTTP Request Sample

### Get All Data Provinsi
<pre>
curl --location --request GET 'http://localhost/api/provinsi'
</pre>

### Get Data Provinsi by Id Provinsi
<pre>
curl --location --request GET 'http://localhost/api/provinsi/4'
</pre>

### Add Data Provinsi
<pre>
curl --location --request POST 'http://localhost/api/provinsi' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id_provinsi" : 5,
    "nama_kota"   : "tes"
}'
</pre>

### Update Data Provinsi
<pre>
curl --location --request PUT 'http://localhost/api/provinsi' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id_provinsi" : 5,
    "nama_provinsi" : "Jambi edits"
}'
</pre>

### Delete Data Provinsi by Id Provinsi
<pre>
curl --location --request DELETE 'http://localhost/api/provinsi/2'
</pre>