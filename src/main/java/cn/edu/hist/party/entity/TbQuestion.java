package cn.edu.hist.party.entity;

public class TbQuestion {
    private Integer id;

    private String aStems;

    private String bStems;

    private String cStems;

    private String dStems;

    private String analyse;

    private String answer;

    private Integer score;

    private String title;

    private Integer typeId;

    private String typeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getaStems() {
        return aStems;
    }

    public void setaStems(String aStems) {
        this.aStems = aStems == null ? null : aStems.trim();
    }

    public String getbStems() {
        return bStems;
    }

    public void setbStems(String bStems) {
        this.bStems = bStems == null ? null : bStems.trim();
    }

    public String getcStems() {
        return cStems;
    }

    public void setcStems(String cStems) {
        this.cStems = cStems == null ? null : cStems.trim();
    }

    public String getdStems() {
        return dStems;
    }

    public void setdStems(String dStems) {
        this.dStems = dStems == null ? null : dStems.trim();
    }

    public String getAnalyse() {
        return analyse;
    }

    public void setAnalyse(String analyse) {
        this.analyse = analyse == null ? null : analyse.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}