package com.corenetworks.modelo;

import java.util.Objects;

public class Categoria {
    private int categoryId;
    private String categoryName;
    private String descriptcion;

    public Categoria() {
    }

    public Categoria(int categoryId, String categoryName, String descriptcion) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.descriptcion = descriptcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return categoryId == categoria.categoryId && Objects.equals(categoryName, categoria.categoryName) && Objects.equals(descriptcion, categoria.descriptcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName, descriptcion);
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescriptcion() {
        return descriptcion;
    }

    public void setDescriptcion(String descriptcion) {
        this.descriptcion = descriptcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", descriptcion='" + descriptcion + '\'' +
                '}';




    }
}
