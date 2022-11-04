package com.example.Parcial.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "matter")
@Getter @Setter
@AllArgsConstructor
public class Matter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer code;

    @Column
    private String description;

    @Column
    private int credits;

    @ManyToOne
    @JoinColumn(name="student_id")
    @JsonIgnoreProperties("matter")
    private Student student;

    public Matter() {
    }

    public Matter(Integer code, String description, int credits) {
        this.code = code;
        this.description = description;
        this.credits = credits;
        this.student = student;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
