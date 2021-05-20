package com.github.brunoctt.citiesapi.cities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;


@Entity
@Table(name = "cidade")
@TypeDefs(value = {
    @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    // 1st
    @Column(name = "lat_lon")
    private String geolocation;

    // 2nd
      @Type(type = "point")
      @Column(name = "lat_lon", updatable = false, insertable = false)
      private Point location;

    private Double latitude;

    private Double longitude;

    private Short cod_tom;

    public City() {
    }

    //   public City(final Long id, final String name, final Integer uf, final Integer ibge,
    //               final String geolocation, final Point location) {
    //     this.id = id;
    //     this.name = name;
    //     this.uf = uf;
    //     this.ibge = ibge;
    //     this.geolocation = geolocation;
    //     this.location = location;
    //   }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeolocation() {
        return geolocation;
    }

      public Point getLocation() {
        return location;
      }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Short getCod_tom() {
        return cod_tom;
    }
}
