package mode.proxy.interfaceImplPgk;

import mode.proxy.interfacePgk.Animal;

/**
 * Created by Lei on 2019/3/9.
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("ÎÒ°®³Ô");
    }

    @Override
    public void sleep() {
        System.out.println("ÎÒ°®Ë¯");
    }

    @Override
    public void drink() {
        System.out.println("ÎÒ°®ºÈ");
    }

    @Override
    public void play() {
        System.out.println("ÎÒ°®Íæ");
    }
}
