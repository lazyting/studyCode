package code.pattern._1_prototype;

import code.pattern._1_prototype.model.Computer;

public class PrototypeMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setId("xo10.0");
        computer.setName("̨ʽ");
        computer.setBrand("AOC");
        computer.setSize(23.5);
        Computer computer1 = computer.clone();
        computer1.setSize(24);
        System.out.println(computer);
        System.out.println(computer1);
    }
}
