package no.cantara.java.modules.json2;

import java.util.ArrayList;
import java.util.List;

public class Thing {
    private String id;
    private String name;
    private List<String> tags;
    private String ownerId;

    public Thing(String id, String name) {
        this(id,name,new ArrayList<>(), "");
    }

    public Thing(String id, String name, List<String> tags, String ownerId) {
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.ownerId = ownerId;
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

    public List<String> getTags() {
        if (tags == null) {
            return new ArrayList<>();
        }
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tags=" + tags +
                ", ownerId='" + ownerId + '\'' +
                '}';
    }
}
