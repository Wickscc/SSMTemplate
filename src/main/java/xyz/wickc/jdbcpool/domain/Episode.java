package xyz.wickc.jdbcpool.domain;

/**
 * Created on 2020/2/26
 *
 * @author wicks
 * @since 1.8
 */
public class Episode {
    private String chName;
    private String engName;
    private String imdbNub;

    public Episode() {}

    @Override
    public String toString() {
        return "Episode{" +
                "chName='" + chName + '\'' +
                ", engName='" + engName + '\'' +
                ", imdbNub='" + imdbNub + '\'' +
                '}';
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getImdbNub() {
        return imdbNub;
    }

    public void setImdbNub(String imdbNub) {
        this.imdbNub = imdbNub;
    }
}
