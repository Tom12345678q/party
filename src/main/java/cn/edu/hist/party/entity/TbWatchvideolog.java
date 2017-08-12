package cn.edu.hist.party.entity;

public class TbWatchVideoLog {
    private Integer id;

    private Integer userId;

    private String username;

    private Integer videoId;

    private String videoName;

    private Long watchSecond;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public Long getWatchSecond() {
        return watchSecond;
    }

    public void setWatchSecond(Long watchSecond) {
        this.watchSecond = watchSecond;
    }
}