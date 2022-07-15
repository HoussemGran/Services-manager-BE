package com.dev.process.entity;


import com.dev.process.enums.Type;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PROCESS")
@Getter
@Setter
@NoArgsConstructor
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NonNull
    private String name;
    private String description;
    private String type;
    private String status;
    private String platform;

}
