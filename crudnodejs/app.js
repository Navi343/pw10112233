var express = require("express");
var mysql = require("mysql");
var app = express(); //ejecuta constructor

//configurar la conexion a mysql
var conexion = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'pw1011'
});
//probamos la conexion
conexion.connect(function(error){
    if(error){
        throw error;
    }else{
        console.log("conectado a la base de datos");
    }
});

app.get("/",function(req, res){
    res.send("<h1>ruta de inicio con nodemon</h1>");
});

//crear el servidor
app.listen("3001",function(){
    console.log("servidor en el puerto 3000")
});
