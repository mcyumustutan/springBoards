package com.mcan.springBoards.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "boards")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BoardEntity extends BaseEntity{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "board_id_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "board_id_gen", sequenceName = "board_id_seq")
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "order_number", nullable = false)
    private int orderNumber;
}
