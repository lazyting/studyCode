package base.StringPkg;

/**
 * Created by lzt on 2019/3/6.
 */
public class StringTest1 {
    public void replaceFirst() {
        String aa="aabbccddaa";
        System.out.println(aa.replaceFirst("aa","bb"));//bbbbccddaa
        System.out.println(aa.replaceFirst("(.*)aa(.*)","bb"));//bb
        System.out.println(aa);
    }
    public void replace() {
        String aa="aabbcc";
        System.out.println(aa.replace("aa","bb"));
    }
    public void replaceAll() {
        String aa="aabbccbbccdd";
        System.out.println(aa.replaceAll("ccbb","dd"));//aabbddccdd
        System.out.println(aa.replaceAll("dd","bb"));//aabbccbbccbb
        System.out.println(aa.replaceAll("(.*)dd(.*)","bb"));//bb
    }

    public static void main(String[] args) {
        StringTest1 stringTest1=new StringTest1();
        stringTest1.replaceFirst();
//        stringTest1.replaceAll();
    }
}
