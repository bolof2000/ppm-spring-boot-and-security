package io.ppm.projectmanagementtool.entity;

import com.google.api.client.util.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "products")
public class Products {

    @Id
    private String id;
    private String name;
    private String description;
    private String category_id;
    private double price;
    private String created;
    private String modified;

    public Products() {
    }

    public Products(String id, String name, String description, String category_id, double price, String created, String modified) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category_id = category_id;
        this.price = price;
        this.created = created;
        this.modified = modified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category_id='" + category_id + '\'' +
                ", price=" + price +
                ", created='" + created + '\'' +
                ", modified='" + modified + '\'' +
                '}';
    }
}
