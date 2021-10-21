package com.example.ejemplorecicler;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.view.MenuItem;

public class ProductoActivity extends AppCompatActivity
{
    public static ProductoModelo producto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_producto);

        Bundle extras = super.getIntent().getExtras();

        ProductoModelo modelo = (ProductoModelo) extras.getSerializable("producto");

        ProductoControlador controlador = new ProductoControlador(modelo, this);

        ProductoVista vista = new ProductoVista(this, modelo, controlador);

        controlador.setVista(vista);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            ProductoActivity.producto = null;

            super.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}