package com.example.demo.World.Entities;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Code")
    private int code;
    @Column(name = "Continent")
    private String continent;
    @Column(name = "Region")
    private String region;
//    @Column(name = "SurfaceArea")
//    private Float privateArea;
//    @Column(name = "IndepYear")
//    private Integer indepYear;
//    @Column(name = "Population")
//    private Integer population;
//    @Column(name = "LifeExpectancy")
//    private Float lifeExpectancy;
//    @Column(name = "GNP")
//    private Float gnp;
//    @Column(name = "GNPOld")
//    private Float gnpOld;
//    @Column(name = "LocalName")
//    private String localName;
//    @Column(name = "GovernmentForm")
//    private String governmentForm;
//    @Column(name = "HeadOfState")
//    private String headOfState;
//    @Column(name = "Capital")
//    private Integer capital;
//    @Column(name = "Code2")
//    private String code2;

    public Country() {
    }

    public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
