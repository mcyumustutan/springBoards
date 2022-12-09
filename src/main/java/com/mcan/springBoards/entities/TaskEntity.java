package com.mcan.springBoards.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskEntity extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "task_id_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "task_id_gen", sequenceName = "task_id_seq")
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "user_id", nullable = false)
    private long user_id;

    @Column(name = "board_id", nullable = false)
    private long board_id;

    @Column(name = "started_at")
    @Temporal(TemporalType.DATE)
    private Date startedAt;

    @Column(name = "read_at")
    @Temporal(TemporalType.DATE)
    private Date readAt;

    @Column(name = "finished_at")
    @Temporal(TemporalType.DATE)
    private Date finishedAt;
}
