package sg.edu.np.mad.madpractical;

public class User {
    private String name;
    private String description;
    private int id;
    private boolean followed;

    public User(String N, String D, int ID) {
        name = N;
        description = D;
        id = ID;
        followed = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean F) {
        followed = F;
    }
}