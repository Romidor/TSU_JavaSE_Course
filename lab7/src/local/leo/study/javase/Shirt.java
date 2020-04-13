package local.leo.study.javase;

public class Shirt {

    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt() {
    }

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "\nИдентификатор: '" + id + '\'' +
                "\nОписание: '" + description + '\'' +
                "\nЦвет: '" + color + '\'' +
                "\nРазмер: '" + size + '\'' +
                '}';
    }
}
