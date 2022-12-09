package com.mcan.springBoards.entities;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt = new Date();

    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt = new Date();

    @Column(name = "deleted_at")
    @Temporal(TemporalType.DATE)
    private Date deletedAt = new Date();
}
