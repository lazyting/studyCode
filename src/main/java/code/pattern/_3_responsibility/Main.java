package code.pattern._3_responsibility;

import code.pattern._3_responsibility.model.Boss;
import code.pattern._3_responsibility.model.Employee;
import code.pattern._3_responsibility.model.GroupLeader;
import code.pattern._3_responsibility.model.Manager;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        Boss boss = new Boss();
        employee.setOverTimePayHandler(groupLeader);
        groupLeader.setOverTimePayHandler(manager);
        manager.setOverTimePayHandler(boss);
        employee.requestOverTimePay(800);
    }
}
