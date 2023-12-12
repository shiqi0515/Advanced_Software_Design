public class Article {
    private int creatorID;
    private String title;
    private String content;
    private String topic;

    public Article(int creatorID, String title, String content, String topic) {
        this.creatorID = creatorID;
        this.title = title;
        this.content = content;
        this.topic = topic;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getTopic() {
        return topic;
    }
}
