package com.tantarantana.domain.edition;

import javax.persistence.*;
import java.time.Year;

@Entity
public class Edition {
    @Id
    @Column(unique = true)
    private Year year;


    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
