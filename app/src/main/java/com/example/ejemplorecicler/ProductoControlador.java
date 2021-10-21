package com.example.ejemplorecicler;

import android.app.Activity;
import android.view.View;

public class ProductoControlador implements View.OnClickListener
{
    private ProductoModelo modelo;

    private ProductoVista vista;

    private Activity activity;

    public ProductoControlador(ProductoModelo modelo, Activity activity)
    {
        this.modelo = modelo;

        this.activity = activity;
    }

    public void setVista(ProductoVista vista)
    {
        this.vista = vista;

        this.vista.mostrarModelo();
    }

    private boolean validar()
    {
        if (!this.modelo.getNombre().isEmpty() && !this.modelo.getCantidad().isEmpty() && !this.modelo.getPrecioUnidad().isEmpty() && this.modelo.getNombre() != null && this.modelo.getCantidad() != null && this.modelo.getPrecioUnidad() != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonGuardar)
        {
            this.vista.guardarModelo();

            if (this.validar())
            {
                this.vista.mensaje(this.activity.getString(R.string.txt_guardado));

                ProductoActivity.producto = this.modelo;

                this.activity.finish();
            }
            else
            {
                this.vista.mensaje(this.activity.getString(R.string.txt_noGuardado));

                ProductoActivity.producto = null;
            }
        }
    }
}