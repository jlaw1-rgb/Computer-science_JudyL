
public class Assignment {

    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        if (title == null || title.length() == 0 || description == null || description.length() == 0) {
            throw new IllegalArgumentException("Invalid input.");
        }
        // Students: add your own validation and exceptions as you see fit
        setTitle(title);
        setDescription(description);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
        this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}
