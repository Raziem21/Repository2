package co.develhope.halExplorerRepo.entities;

import javax.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;
    private Integer firstAppearance;
    @Column(nullable = false)
    private String inventor;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFirstAppearance(Integer firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public Integer getFirstAppearance() {
        return firstAppearance;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public String getInventor() {
        return inventor;
    }
}
