package com.example.ejemplorecicler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoViewHolder>
{
    private List<ProductoModelo> productos;

    private MyOnItemClick listener;

    public ProductoAdapter(List<ProductoModelo> productos, MyOnItemClick listener)
    {
        this.productos = productos;

        this.listener = listener;
    }

    public List<ProductoModelo> getProductos()
    {
        return this.productos;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View viewItemLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto, parent, false);

        ProductoViewHolder productoViewHolder = new ProductoViewHolder(viewItemLayout, this.listener);

        return productoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position)
    {
        ProductoModelo producto = this.productos.get(position);

        holder.txtNombre.setText(producto.getNombre());

        holder.txtCantidad.setText(producto.getCantidad());

        holder.txtPrecioUnidad.setText(producto.getPrecioUnidad());

        holder.setPosition(position);
    }

    @Override
    public int getItemCount()
    {
        return this.productos.size();
    }
}