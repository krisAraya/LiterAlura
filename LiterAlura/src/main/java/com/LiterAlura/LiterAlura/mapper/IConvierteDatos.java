package com.LiterAlura.LiterAlura.mapper;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);

}