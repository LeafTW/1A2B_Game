package com.game._1a2b.enity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Game1A2BLog")
public class Game1A2BLog {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Integer recordID;
    private String guess;
}
