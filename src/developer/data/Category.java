package developer.data;

public class Category {
    private String id;
    private boolean active;

    /**
     * Setter Getter (keyword alt+insert)
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id!= null){
            this.id = id;
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
