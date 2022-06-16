package ru.itmo.courses.climbers.jpa;

import ru.itmo.courses.climbers.jpa.entity.Climber;
import ru.itmo.courses.climbers.jpa.entity.Group;
import ru.itmo.courses.climbers.jpa.entity.Mountain;
import ru.itmo.courses.climbers.jpa.entity.entityBuilder.ManagerMaker;

public class App {
    public static void main(String[] args) {

        ManagerMaker managerMaker = new ManagerMaker();
        Climber climber1 = new Climber();
        Group group = new Group();


        Mountain gora = new Mountain();
        gora.setMountain("gora");
        gora.setCountry("gora");
        gora.setHeight(110);

        Mountain gora1 = new Mountain();
        gora1.setMountain("gora1");
        gora1.setCountry("gora1");
        gora1.setHeight(10);


        managerMaker.addToTable(gora);
        managerMaker.addToTable(gora1);
        managerMaker.dropFromTable(gora1);

        Climber climber = new Climber();
        climber.setNameOfClimber("Петр");
        climber.setAddressOfClimber("тест");

        climber1.setNameOfClimber("Иван");
        climber1.setAddressOfClimber("тест");

        managerMaker.addToTable(climber);
        managerMaker.addToTable(climber1);

        Group firstGroup = new Group();
        firstGroup.addToGroup(climber);
        firstGroup.addToGroup(climber1);

        managerMaker.addToTable(firstGroup);











    }
}
