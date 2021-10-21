package com.example.ejemplorecicler;

import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ProductoVista
{
    private Activity activity;

    private ProductoModelo modelo;

    private EditText editNombre;

    private EditText editCantidad;

    private EditText editPrecioUnidad;

    private Button btnGuardar;

    public ProductoVista(Activity activity, ProductoModelo modelo, ProductoControlador controlador)
    {
        this.activity = activity;

        this.modelo = modelo;

        this.editNombre = this.activity.findViewById(R.id.editNombre);

        this.editCantidad = this.activity.findViewById(R.id.editCantidad);

        this.editPrecioUnidad = this.activity.findViewById(R.id.editPrecioUnidad);

        this.btnGuardar = this.activity.findViewById(R.id.buttonGuardar);

        this.btnGuardar.setOnClickListener(controlador);

        ActionBar actionBar = ((AppCompatActivity) this.activity).getSupportActionBar();

        actionBar.setTitle(R.string.editarProducto);

        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void mostrarModelo()
    {
        this.editNombre.setText(modelo.getNombre());

        this.editCantidad.setText(modelo.getCantidad());

        this.editPrecioUnidad.setText(modelo.getPrecioUnidad());
    }

    public void guardarModelo()
    {
        this.modelo.setNombre(this.editNombre.getText().toString());

        this.modelo.setCantidad(this.editCantidad.getText().toString());

        this.modelo.setPrecioUnidad(this.editPrecioUnidad.getText().toString());
    }

    public void mensaje(String texto)
    {
        Toast.makeText(this.activity, texto, Toast.LENGTH_LONG).show();
    }
}