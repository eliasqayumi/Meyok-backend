package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kind")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kind {
    @Id
    @Column(name = "kind_id", nullable = false, length = 10)
    private String id;

    @Column(name = "kind", nullable = false, length = 20)
    private String kind;


}