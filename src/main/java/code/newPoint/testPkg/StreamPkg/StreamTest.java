package code.newPoint.testPkg.StreamPkg;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Lei on 2019/3/17.
 */
public class StreamTest {

    public static Stream produceStream() {
        Stream streamResult = null;
        String[] array = {"a", "b", "d", "e", "c"};
        List<String> strList = Arrays.asList(array);
        streamResult = strList.stream();//������
        streamResult = strList.parallelStream();//����ڴ��������������ܹ��������ִ��Ч��
        streamResult = Arrays.stream(array);


        streamResult = Stream.of(array);
//        streamResult = Stream.generate(() -> Double.toString(Math.random() * 1000));
//        streamResult = Stream.generate(new Supplier<Object>() {
//            @Override
//            public Object get() {
//                return null;
//            }
//        });
        return streamResult;
    }

    /**
     * Intermediate���м������:�м������ָ����������Ԫ��������Ӧת�����������Ȼ����Ϊһ����Stream����Ȼ���Թ���һ��������ʹ�á�
     * ���õ��У�map (mapToInt, flatMap ��)�� filter�� distinct�� sorted�� peek�� limit�� skip��
     * Termial����������������ָ���ն�Stream�����ۺϲ�������������
     *
     * @param stream
     */
    public static void streamOperate(Stream stream) {
        //��ÿһ��Ԫ�ض�����ַ�����_map��
//        stream.map(str -> str + "_map").forEach(System.out::println);

        //ƴ������Stream
//        Stream.concat(Stream.of(1, 2, 3), Stream.of(4, 5, 6)).
//                forEach(System.out::println);

//        ȥ���ظ�������
//        Stream<String> stream1 = Stream.of("a", "a", "b", "c");
//        stream1.distinct().forEach(System.out::println);

//        ��ȡ����ǰ����Ԫ��
//        Stream<String> stream2 = Stream.of("a", "a", "b", "c");
//        stream2.limit(2).forEach(System.out::println);
        Stream<String> stream3 = Stream.of("a", "a", "b", "c");
        stream3.skip(2).forEach(System.out::println);


    }

    public static void main(String[] args) {
//        System.out.println(Double.toString(Math.random() * 10));
        Stream stream = produceStream();
        streamOperate(stream);
    }
}
