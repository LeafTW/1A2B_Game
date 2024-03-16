package com.game._1a2b.enity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Game1A2B")
public class Game1A2B {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String answer;
    private Integer number_times;

}
