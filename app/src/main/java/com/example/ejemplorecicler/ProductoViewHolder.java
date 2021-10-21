package com.example.ejemplorecicler;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ProductoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    private MyOnItemClick listener;

    private int position;

    TextView txtNombre;

    TextView txtCantidad;

    TextView txtPrecioUnidad;

    public ProductoViewHolder(View viewItemLayout, MyOnItemClick listener)
    {
        super(viewItemLayout);

        this.listener = listener;

        this.txtNombre = viewItemLayout.findViewById(R.id.txtNombre);

        this.txtCantidad = viewItemLayout.findViewById(R.id.txtCantidad);

        this.txtPrecioUnidad = viewItemLayout.findViewById(R.id.txtPrecioUnidad);

        this.txtNombre.setOnClickListener(this);
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    @Override
    public void onClick(View view)
    {
        listener.onItemClick(position);
    }
}