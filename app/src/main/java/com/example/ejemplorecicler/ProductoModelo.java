package com.example.ejemplorecicler;

import java.io.Serializable;

public class ProductoModelo implements Serializable
{
    private String nombre;
    private String cantidad;
    private String precioUnidad;

    public ProductoModelo() { }

    public ProductoModelo(String nombre, String cantidad, String precioUnidad)
    {
        this.nombre = nombre;

        this.cantidad = cantidad;

        this.precioUnidad = precioUnidad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(String cantidad)
    {
        this.cantidad = cantidad;
    }

    public String getPrecioUnidad()
    {
        return precioUnidad;
    }

    public void setPrecioUnidad(String precioUnidad)
    {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }
        else if (o.getClass().equals(this.getClass()))
        {
            ProductoModelo u = (ProductoModelo) o;

            if (this.nombre.equals(u.nombre) && this.cantidad.equals(u.cantidad) && this.precioUnidad.equals(u.precioUnidad))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        final int primo = 23;

        int retorno = 0;

        retorno = primo * this.nombre.hashCode();

        retorno += this.cantidad.hashCode();

        retorno += this.precioUnidad.hashCode();

        return retorno;
    }

    @Override
    public String toString()
    {
        return this.nombre.concat(" - ").concat(this.cantidad).concat(" - ").concat(this.precioUnidad);
    }
}