package com.bfs.springmvc.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "book")
@Getter
@Setter
@ToString
public class Book implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_generator")
    private Integer id;

    @Column(name = "book_name")
    private String book_name;

    @Column(name = "author")
    private String author;

    @Column(name = "isbn")
    private int isbn;

    @Column(name = "publish_Date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date  publish_Date;





}
