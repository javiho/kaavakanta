///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ksk;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
///**
// *
// * @author saara
// */
//@Entity
//@Table(name = "kaavatilasto")
//public class Kaavatilasto implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "aluenumero")
//    private String aluenumero;
//
//    @Column(name = "kaavatyyppi")
//    private String kaavatyyppi;
//
//    @Column(name = "suunnittelualue")
//    private String suunnittelualue;
//
////    // timestamp muutokselle
////    @Temporal(TemporalType.TIMESTAMP)
////    @Column(name = "date")
////    private Date date;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getAluenumero() {
//        return aluenumero;
//    }
//
//    public void setAluenumero(String aluenumero) {
//        this.aluenumero = aluenumero;
//    }
//
//    public String getKaavatyyppi() {
//        return kaavatyyppi;
//    }
//
//    public void setKaavatyyppi(String kaavatyyppi) {
//        this.kaavatyyppi = kaavatyyppi;
//    }
//
//    public String getSuunnittelualue() {
//        return suunnittelualue;
//    }
//
//    public void setSuunnittelualue(String suunnittelualue) {
//        this.suunnittelualue = suunnittelualue;
//    }
//}
