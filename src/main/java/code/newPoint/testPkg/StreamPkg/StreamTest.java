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
        streamResult = strList.stream();//串行流
        streamResult = strList.parallelStream();//相较于串行流，并行流能够大大提升执行效率
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
     * Intermediate（中间操作）:中间操作是指对流中数据元素做出相应转换或操作后依然返回为一个流Stream，仍然可以供下一次流操作使用。
     * 常用的有：map (mapToInt, flatMap 等)、 filter、 distinct、 sorted、 peek、 limit、 skip。
     * Termial（结束操作）：是指最终对Stream做出聚合操作，输出结果。
     *
     * @param stream
     */
    public static void streamOperate(Stream stream) {
        //将每一个元素都添加字符串“_map”
//        stream.map(str -> str + "_map").forEach(System.out::println);

        //拼接两个Stream
//        Stream.concat(Stream.of(1, 2, 3), Stream.of(4, 5, 6)).
//                forEach(System.out::println);

//        去除重复的数据
//        Stream<String> stream1 = Stream.of("a", "a", "b", "c");
//        stream1.distinct().forEach(System.out::println);

//        截取流中前两个元素
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
