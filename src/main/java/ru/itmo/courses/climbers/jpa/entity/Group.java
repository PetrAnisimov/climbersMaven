package ru.itmo.courses.climbers.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@NonNull
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_group")
@Entity
public class Group extends BaseId {

    public Group() {
    }

    public boolean isOpentoAdd = false;

    
    private Mountain mountain;

    @Column(name = "climbers_group")
    private Climber[] climbers = new Climber[3];

    public void addToGroup(Climber climber) {
        if (!isOpentoAdd) {
            System.out.println("Набор закрыт");
            return;
        }
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i] == null) {
                climbers[i] = climber;
                return;
            }
        }
        System.out.println("Альпинист добавлен");
    }

}
