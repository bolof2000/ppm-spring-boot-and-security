package io.ppm.projectmanagementtool.entity;


import com.google.api.client.util.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "categories")
public class Categories {

    @Id
    private String id;
    private String name;
    private String description;
    private String created;
    private String modified;


    public Categories(String id, String name, String description, String created, String modified) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.created = created;
        this.modified = modified;
    }

    public Categories() {
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
        return "Categories{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", created='" + created + '\'' +
                ", modified='" + modified + '\'' +
                '}';
    }
}
