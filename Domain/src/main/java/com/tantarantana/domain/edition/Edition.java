package com.tantarantana.domain.edition;

import javax.persistence.*;

@Entity
public class Edition {
    @Id
    @Column(unique = true)
    private Long year;


    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }
}
